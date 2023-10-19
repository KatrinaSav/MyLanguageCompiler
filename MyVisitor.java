package pack;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import javax.xml.parsers.ParserConfigurationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class MyVisitor extends grammaBaseVisitor<Object> {
    private HashMap<String, Object> variables;
    private ArrayList<ArrayList<Object>> functions;
    private Object currentReturn;
    public MyVisitor() throws ParserConfigurationException {
        variables = new HashMap<>();
        functions = new ArrayList<>();
        currentReturn = null;

    }

    public static void main( String[] args) throws Exception
    {
        try {
            MyErrorListner erlst = new MyErrorListner();
            String source = "ex.txt";
            CharStream cs = fromFileName(source);
            grammaLexer lexer = new grammaLexer(cs);
            lexer.removeErrorListeners();
            lexer.addErrorListener(erlst);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            grammaParser parser = new grammaParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(erlst);
            grammaParser.ProgramContext tree = parser.program();
            MyVisitor visitor = new MyVisitor();
            visitor.visit(tree);
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
            return;
        }

    }

    @Override public Object visitReturn(grammaParser.ReturnContext ctx) throws Exception {
        currentReturn = visitExpr(ctx.expr());
        return currentReturn;
    }

    @Override public Object visitIn(grammaParser.InContext ctx) throws Exception {
        if(ctx.type().getText().equals("number")){
            Scanner in = new Scanner(System.in);
            Integer num = in.nextInt();
            in.close();
            return num;
        }
        else if(ctx.type().getText().equals("text")){
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            in.close();
            return str;
        }
        else if(ctx.type().getText().equals("bool")){
            Scanner in = new Scanner(System.in);
            Boolean bool = in.nextBoolean();
            in.close();
            return bool;
        }
        else if(ctx.type().getText().equals("document")){
            if(ctx.form() == null)
                throw new Exception("Read function for document requires 1 param");
            else {
                Object fileName = visitForm(ctx.form());
                if(fileName.getClass() != String.class)
                    throw new Exception("Read function for document requires string param");
                else
                    return Doc.readDoc((String) fileName);
            }
        }
        else
            throw new Exception("There is no read function for "+ctx.type().getText()+" type");
    }

    @Override public Object visitOut(grammaParser.OutContext ctx) throws Exception {
        Object obj = null;
        Boolean checker = false;
        if(ctx.ID() != null)
        {
            if(variables.containsKey(ctx.ID().getText()))
                obj = variables.get(ctx.ID().getText());
            else
                throw new Exception("No var "+ ctx.ID().getText());
        }
        else if(ctx.form() != null)
        {
            obj = visitForm(ctx.form(0));
            checker = true;
        }

        if(checker & ctx.form().size() != 1 & obj.getClass() != Doc.class)
            throw new Exception("Extra param in write function");
        else if(!checker & ctx.form().size() != 0 & obj.getClass() != Doc.class)
            throw new Exception("Extra param in write function");
        else if(checker & ctx.form(1) != null & obj.getClass() == Doc.class)
        {
            Object fileName = visitForm(ctx.form(1));
            if(fileName.getClass() != String.class)
                throw new Exception("Wrong params: doc.write() requires 1 string param");
            ((Doc)obj).writeDoc(((String) fileName).replace("\"", ""));
            return true;
        }
        else if(!checker & ctx.form(0) != null & obj.getClass() == Doc.class)
        {
            Object fileName = visitForm(ctx.form(0));
            if(fileName.getClass() != String.class)
                throw new Exception("Wrong params: doc.write() requires 1 string param");
            ((Doc)obj).writeDoc(((String) fileName).replace("\"", ""));
            return true;
        }
        else if(obj.getClass() == Doc.class)
            throw new Exception("Wrong params: doc.write() requires 1 string param");
        else
        {
            if(obj.getClass() == Attribute.class)
                System.out.println("<'"+((Attribute) obj).name+"':'"+((Attribute) obj).value+"'>");
            if(obj.getClass() == Nod.class)
            {
                System.out.println("['"+ ((Nod) obj).name +"':'"+ ((Nod) obj).inText+"']");
            }
            if(obj.getClass() == Integer.class)
                System.out.println(obj);
            if(obj.getClass() == String.class)
                System.out.println(obj);
            if(obj.getClass() == Boolean.class)
            {
                if((Boolean)obj)
                    System.out.println("Yes");
                if(!(Boolean)obj)
                    System.out.println("No");
            }
        }
        return null;
    }
    @Override public Object visitWhile(grammaParser.WhileContext ctx) throws Exception {
        Boolean bool = (Boolean) visitBoolexpr(ctx.boolexpr());
        System.out.println(bool);
        if(bool)
        {
            for(int i = 0; i < ctx.stat().size(); i++)
                visitStat(ctx.stat(i));
            visitWhile(ctx);
        }
        return true;
    }
    @Override public Object visitUntil(grammaParser.UntilContext ctx) throws Exception {
        Boolean bool = (Boolean) visitBoolexpr(ctx.boolexpr());
        if(!bool)
        {
            for(int i = 0; i < ctx.stat().size(); i++)
                visitStat(ctx.stat(i));
            visitUntil(ctx);
        }
        return true;
    }
    @Override public Object visitIf(grammaParser.IfContext ctx) throws Exception {
        Object bool = visitBoolexpr(ctx.boolexpr());
        if((Boolean)bool)
        {
            for(int i = 0; i < ctx.stat().size(); i++)
                visitStat(ctx.stat(i));
        }
        else if(ctx.else_()!=null)
        {
            for(int i = 0; i < ctx.else_().stat().size(); i++)
                visitStat(ctx.else_().stat(i));
        }
        return true;
    }
   @Override public Object visitBoolexpr(grammaParser.BoolexprContext ctx) throws Exception {
        if(ctx.expr(0)!= null)
        {
            Object left = visitExpr(ctx.expr(0));
            Object right = visitExpr(ctx.expr(1));
            if(left.getClass() != right.getClass())
                throw new Exception("Can't compare different types");
            else
            {
                if(ctx.logop.getText().equals("=="))
                {
                    if(left.getClass() == Attribute.class)
                        return ((Attribute) left).name.equals(((Attribute) right).name)
                                & ((Attribute) left).value.equals(((Attribute) right).value);
                    else if(left.getClass() == Nod.class)
                        return left.equals(right);
                    else if(left.getClass() == Doc.class)
                        return left.equals(right);
                    else if(left.getClass() == String.class)
                        return left.equals(right);
                    else if(left.getClass() == Boolean.class)
                        return left.equals(right);
                    else if(left.getClass() == Integer.class)
                        return left.equals(right);
                }
                if(ctx.logop.getText().equals("!="))
                {
                    if(left.getClass() == Attribute.class)
                        return !(((Attribute) left).name.equals(((Attribute) right).name)
                                & ((Attribute) left).value.equals(((Attribute) right).value));
                    else if(left.getClass() == Nod.class)
                        return !left.equals(right);
                    else if(left.getClass() == Doc.class)
                        return !left.equals(right);
                    else if(left.getClass() == String.class)
                        return !left.equals(right);
                    else if(left.getClass() == Boolean.class)
                        return !left.equals(right);
                    else if(left.getClass() == Integer.class)
                        return !left.equals(right);
                }
                if(ctx.logop.equals(">"))
                {
                    if(left.getClass() == Integer.class)
                        return (Integer)left > (Integer)right;
                    else
                        throw new Exception("Operation '>' is not declared for "+left.getClass());
                }
                if(ctx.logop.getText().equals("<"))
                {
                    if(left.getClass() == Integer.class)
                        return (Integer)left < (Integer)right;
                    else
                        throw new Exception("Operation '<' is not declared for "+left.getClass());
                }
                if(ctx.logop.getText().equals(">="))
                {
                    if(left.getClass() == Integer.class)
                        return (Integer)left >= (Integer)right;
                    else
                        throw new Exception("Operation '>=' is not declared for "+left.getClass());
                }
                if(ctx.logop.getText().equals("<="))
                {
                    if(left.getClass() == Integer.class)
                        return (Integer)left <= (Integer)right;
                    else
                        throw new Exception("Operation '<=' is not declared for "+left.getClass());
                }
            }
        }
        else if(ctx.boolexpr(0) != null){
            Object bool1 = visitBoolexpr(ctx.boolexpr(0));
            Object bool2 = visitBoolexpr(ctx.boolexpr(1));
            if(ctx.OR() != null)
            {
                return (Boolean)bool1 | (Boolean) bool2;
            }
            else if(ctx.AND()!=null)
            {
                return (Boolean)bool1 & (Boolean) bool2;
            }
        }
        return null;
    }
    @Override public Object visitCall(grammaParser.CallContext ctx) throws Exception {
        ArrayList<Object> params = new ArrayList<>();
        ArrayList<String> types = new ArrayList<>();
        for(int i = 0; i < ctx.expr().size(); i++)
        {
            Object p = visitExpr(ctx.expr(i));
            params.add(p);
            if (Integer.class.equals(p.getClass())) {
                types.add("number");
            } else if (Nod.class.equals(p.getClass())) {
                types.add("node");
            } else if (Attribute.class.equals(p.getClass())) {
                types.add("attribute");
            } else if (Doc.class.equals(p.getClass())) {
                types.add("document");
            } else if (Boolean.class.equals(p.getClass())) {
                types.add("bool");
            } else if (String.class.equals(p.getClass())) {
                types.add("text");
            }
        }
        Boolean checker = false;
        grammaParser.FuncContext context = null;
        String rType = "";
        for(ArrayList<Object> func: functions)
        {
            if(func.get(0).equals(ctx.ID().getText()) & func.size() - 3 == types.size())
            {
                for(int i = 2; i < func.size()-1;i++)
                {
                    checker = true;
                    if(!func.get(i).equals(types.get(i-2)))
                    {
                        checker = false;
                        break;
                    }
                }
            }
            if(checker)
            {
                context = (grammaParser.FuncContext) func.get(func.size()-1);
                rType = (String) func.get(1);
                break;
            }
        }
        if(context == null)
            throw new Exception("There is no function "+ ctx.ID().getText() + " with appropriate params.");
        HashMap<String, Object> saveVar = variables;
        variables = new HashMap<>();
        for(int i = 1; i < context.ID().size(); i++)
        {
            variables.put(context.ID(i).getText(), params.get(i-1));
        }
        for(int i = 0; i < context.stat().size(); i++)
            visitStat(context.stat(i));
        if(currentReturn == null)
            throw new Exception("In function " + context.ID(0).getText() + " there is no return statement or it is unreachable");
        else
        {
            String returnType = "";
            if (Integer.class.equals(currentReturn.getClass())) {
                returnType = "number";
            } else if (Nod.class.equals(currentReturn.getClass())) {
                returnType = "node";
            } else if (Attribute.class.equals(currentReturn.getClass())) {
                returnType = "attribute";
            } else if (Doc.class.equals(currentReturn.getClass())) {
                returnType = "document";
            } else if (Boolean.class.equals(currentReturn.getClass())) {
                returnType = "bool";
            } else if (String.class.equals(currentReturn.getClass())) {
                returnType = "text";
            }
            if(!returnType.equals(rType))
                throw new Exception("Function: "+context.ID(0).getText()+" return type doesn't match declaration ");
            else {
                variables = saveVar;
                Object res = currentReturn;
                currentReturn = null;
                return res;
            }
        }
    }
    @Override public Object visitCast(grammaParser.CastContext ctx) throws Exception {
        Object obj = null;
        if(ctx.cast()!= null)
            obj = visitCast(ctx.cast());
        else if(ctx.const_()!= null)
            obj = visitConst(ctx.const_());
        else if(ctx.ID()!=null)
        {
            if(variables.containsKey(ctx.ID().getText()))
            {
                obj = variables.get(ctx.ID().getText());
            }
            else
                throw new Exception("No var " + ctx.ID().getText());
        }
        if(obj.getClass() == Attribute.class)
        {
            if(ctx.ND() != null)
            {
                return new Nod(((Attribute)obj).name,((Attribute)obj).value);
            }
            else throw new Exception("Can't cast attribute");
        }
        else if(obj.getClass() == Nod.class)
        {
            if(ctx.DOC() != null)
            {
                Doc res = new Doc(((Nod)obj).name);
                res.root = (Nod)obj;
                return res;
            }
            else throw new Exception("Can't cast node");
        }
        else if(obj.getClass() == Integer.class)
        {
            if(ctx.TXT() != null)
            {
                return String.valueOf(obj);
            }
            else throw new Exception("Can't cast number");
        }
        return true;
    }
    @Override public Object visitFunc(grammaParser.FuncContext ctx) throws Exception {
        ArrayList<Object> params = new ArrayList<>();
        params.add(ctx.ID(0).getText());
        params.add(ctx.type(0).getText());
        for(int i = 1; i < ctx.type().size(); i++)
        {
            params.add(ctx.type(i).getText());
        }
        Boolean checker = false;
        for (ArrayList<Object> func:functions) {
            if(params.size() == func.size() & params.get(0) == func.get(0))
            {
                if(params.get(1) != func.get(1))
                    throw new Exception("Wrong overloading of function "+ func.get(0));
                for(int i = 2; i < func.size()-1; i++)
                {
                    if(params.get(i) != func.get(i))
                        checker = true;
                }
            }

        }
        if(checker)
            throw new Exception("Two similar declarations of functions");
        else
        {
            params.add(ctx);
            functions.add(params);
        }
        return null;
    }
    @Override
    public Object visitMath(grammaParser.MathContext ctx) throws Exception {
        if(variables.containsKey(ctx.ID().getText()))
        {
            if (variables.get(ctx.ID().getText()).getClass() == Integer.class) {
                if (ctx.DECR() == null) {
                    variables.put(ctx.ID().getText(), (Integer) variables.get(ctx.ID().getText()) + 1);
                    return (Integer) variables.get(ctx.ID().getText());
                } else {
                    variables.put(ctx.ID().getText(), (Integer) variables.get(ctx.ID().getText()) - 1);
                    return (Integer) variables.get(ctx.ID().getText()) - 1;
                }
            }
            else
               throw new Exception("Var " + ctx.ID().getText() + " isn't int");
        }
        else
            throw new Exception("No var " + ctx.ID().getText());
    }
    @Override public Object visitExpr(grammaParser.ExprContext  ctx) throws Exception {
        if(ctx.binary() != null)
        {
            Object left = visitExpr(ctx.expr(0));
            Object right = visitExpr(ctx.expr(1));
            if(right.getClass() == left.getClass())
            {
                if(ctx.binary().getText().equals("+"))
                {
                    if(left.getClass() == Integer.class)
                    {
                        return Integer.sum((Integer)left,(Integer)right);
                    }
                    else if(left.getClass() == Nod.class)
                    {
                        return ((Nod) left).addChild((Nod) right);
                    }
                    else if(left.getClass() == String.class)
                    {
                        return (String)left + (String)right;
                    }
                    else
                        throw new Exception("Operation '+' not declared for " + left.getClass());
                }
                if(ctx.binary().getText().equals("-"))
                {
                    if(left.getClass() == Integer.class)
                    {
                        return (Integer)left - (Integer)right;
                    }
                    else if(left.getClass() == Nod.class)
                    {
                        return ((Nod)left).delChild((Nod) right);
                    }
                    else
                        throw new Exception("Operation '-' not declared for " + left.getClass());
                }
            }
            else
            {
                if(ctx.binary().getText().equals("+"))
                {
                    if(left.getClass() == Nod.class & right.getClass() == Attribute.class)
                    {
                        return ((Nod) left).setAttribute((Attribute)right);
                    }
                    else
                        throw new Exception("Operation '+' not declared for " + left.getClass() + " and " + right.getClass());
                }
                if(ctx.binary().getText().equals("-"))
                {
                    if(left.getClass() == Nod.class & right.getClass() == Attribute.class)
                    {
                        return ((Nod) left).delAttr((Attribute) right);
                    }
                    else
                        throw new Exception("Operation '+' not declared for " + left.getClass() + " and " + right.getClass());
                }

            }
        }
        if(ctx.form() != null)
        {
            return visitForm(ctx.form());
        }
        if(ctx.par() != null)
        {
            return visitExpr(ctx.par().expr());
        }
        return null;
    }
    @Override public Object visitForm(grammaParser.FormContext  ctx) throws Exception {
        Object result = null;
        if(ctx.ID() != null)
        {
            if(!variables.containsKey(ctx.ID().getText()))
                throw new Exception("No var " + ctx.ID().getText());
            result = variables.get(ctx.ID().getText());
        }
        if(ctx.cast() != null)
            result = visitCast(ctx.cast());
        if(ctx.const_() != null)
            result = visitConst(ctx.const_());
        if(ctx.allindex() != null)
            result = visitAllindex(ctx.allindex());
        if(ctx.call() != null)
            result = visitCall(ctx.call());
        if(ctx.comand() != null)
        {

            if(result.getClass() == Nod.class)
            {
                Nod el = (Nod) result;
                switch(ctx.comand().namecom.getText())
                {
                    case "attributes":
                    {
                        return el.attributes.size();
                    }
                    case "children":
                    {
                        return el.nodChildren.size();
                    }
                    case "name":
                    {
                        return el.name;
                    }
                    case "in_text":
                    {
                        return el.inText;
                    }
                    default:
                        throw new Exception("No command "+ctx.comand().namecom.getText()+" for type node");
                }
            }
            else if(result.getClass() == Attribute.class)
            {
                Attribute attr = (Attribute) result;
                switch(ctx.comand().namecom.getText())
                {

                    case "name":
                    {
                        return attr.name;
                    }
                    case "value":
                    {
                        return attr.value;
                    }
                    default:
                        throw new Exception("No command "+ctx.comand().namecom.getText()+" for type attr");
                }
            }
            else
                throw new Exception("There is no build-in command for type "+ result.getClass().toString());
        }
        else if(ctx.infunc() != null)
        {
            switch(ctx.infunc().funcname().getText())
            {
                case "set_root":
                {
                    if(result.getClass() != Doc.class)
                        throw new Exception("No command "+ctx.infunc().funcname().getText()+" for type " + result.getClass());
                    if(ctx.infunc().form().size() == 1)
                    {
                        Object param = visitForm(ctx.infunc().form(0));
                        if(param.getClass() == Nod.class)
                        {
                            ((Doc)result).root = (Nod)param;
                            return result;
                        }
                        else
                            throw new Exception("Wrong type of param in set_root(), Node is expected instead of "+param.getClass());
                    }
                    else
                        throw new Exception("Wrong number of param: set_root() requires 1 param");
                }
                case "get_root":
                {
                    if(result.getClass() != Doc.class)
                        throw new Exception("No command "+ctx.infunc().funcname().getText()+" for type " + result.getClass());
                    if(ctx.infunc().form().size() == 0)
                        return ((Doc)result).root;
                    else
                        throw new Exception("Wrong number of param: set_root() requires 0 param");
                }
                case "edit":
                {
                    //throw new Exception("No command "+ctx.comand().namecom.getText()+" for type " + result.getClass());
                    if(result.getClass() == Nod.class | result.getClass() == Attribute.class) {
                        if (ctx.infunc().form().size() == 2)
                        {
                            Object param1 = visitForm(ctx.infunc().form(0));
                            Object param2 = visitForm(ctx.infunc().form(1));
                            if(param1.getClass() != String.class & param2.getClass() != String.class)
                                throw new Exception("Wrong params: edit() requires string params");
                            else
                            {
                                switch ((String) param1) {
                                    case "in_text" -> {
                                        if (result.getClass() == Attribute.class)
                                            throw new Exception("There is no field 'in_text' in Attribute");
                                        else
                                        {
                                            ((Nod) result).inText = (String) param2;
                                            return result;
                                        }
                                    }
                                    case "value" -> {
                                        if (result.getClass() == Nod.class)
                                            throw new Exception("There is no field 'value' in Node");
                                        else
                                        {
                                            ((Attribute) result).value = (String) param2;
                                        }
                                            return result;
                                    }
                                    case "name" -> {
                                        if (result.getClass() == Nod.class) {
                                            ((Nod) result).name = (String) param2;
                                            return result;
                                        }
                                        else
                                        {
                                            ((Attribute) result).name = (String) param2;
                                            return result;
                                        }
                                    }
                                    default -> throw new Exception("Wrong first param in edit()");
                                }
                            }
                        }
                        else
                            throw new Exception("Wrong number of param: edit() requires 2 params");
                    }
                    else
                        throw new Exception("No command "+ctx.infunc().funcname().getText()+" for type "+result.getClass());
                }
                case "find":
                {
                    if(result.getClass() == Nod.class ) {
                        if (ctx.infunc().form().size() == 1) {
                            Object param1 = visitForm(ctx.infunc().form(0));
                            if (param1.getClass() != String.class)
                                throw new Exception("Wrong params: find() requires string param");
                            else {
                                return ((Nod)result).find((String)param1);
                            }
                        } else
                            throw new Exception("Wrong number of param: find() requires 1 param");
                    }
                    else
                        throw new Exception("No command "+ctx.infunc().funcname().getText()+" for type "+result.getClass());
                }
                default:
                    throw new Exception("No command "+ctx.infunc().funcname().getText()+" for type doc");
            }


        }
        return result;
    }
    @Override public Object visitFor(grammaParser.ForContext  ctx) throws Exception {
        Object right = null;
        if(ctx.part(0).expr()!= null) {
            right = visitExpr(ctx.part(0).expr());
            variables.put(ctx.part(0).ID().getText(), right);
        }
        else if(ctx.part(0).math()!= null)
            visitMath(ctx.part(0).math());
        while(true)
        {
            Boolean bool = (Boolean) visitBoolexpr(ctx.boolexpr());
            if(bool)
            {
                for(int i = 0; i < ctx.stat().size(); i++)
                    visitStat(ctx.stat(i));
                if(ctx.part(1).expr()!= null) {
                    right = visitExpr(ctx.part(1).expr());
                    if (!variables.containsKey(ctx.part(1).ID().getText()))
                        throw new Exception("No var " + ctx.part(1).ID().getText());
                    else {
                        variables.put(ctx.part(1).ID().getText(), right);
                    }
                }
                else if(ctx.part(1).math()!= null)
                    visitMath(ctx.part(1).math());

            }
            else
                break;
        }
        return true;
    }

    @Override public Object visitConst(grammaParser.ConstContext  ctx) throws Exception {
        Doc doc;
        if(ctx.d != null)
        {
            if(ctx.STRING().size() !=0)
            {
                doc = new Doc(ctx.STRING(0).getText());
            }
            else
            {
                if(!variables.containsKey(ctx.ID(0).getText()))
                    throw new Exception("No var " + ctx.ID(0).getText());
                if(variables.get(ctx.ID(0).getText()).getClass() == String.class)
                {
                    doc = new Doc(variables.get(ctx.ID(0).getText()).toString());
                }
                else
                    throw new Exception("Var " + ctx.ID(0).getText()+ "isn't string");

            }
            return doc;
        }
        if(ctx.i != null)
        {
            return Integer.parseInt(ctx.i.getText());
        }
        if(ctx.a != null)
        {
            String first = "";
            String second = "";
            if(ctx.ID(0) == ctx.getChild(1))
            {
                if(!variables.containsKey(ctx.ID(0).getText()))
                    throw new Exception("No var " + ctx.ID(0).getText());
                if(variables.get(ctx.ID(0).getText()).getClass() == String.class)
                    first = variables.get(ctx.ID(0).getText()).toString();
                else
                    throw new Exception("Var " + ctx.ID(0).getText()+ "isn't string");
            }
            else if(ctx.STRING(0) == ctx.getChild(1))
                first = ctx.STRING(0).getText().replace("\"", "");
            if(ctx.ID(ctx.ID().size()-1) == ctx.getChild(3))
            {
                if(!variables.containsKey(ctx.ID(ctx.ID().size()-1).getText()))
                    throw new Exception("No var "+ ctx.ID(ctx.ID().size()-1).getText());
                if(variables.get(ctx.ID(ctx.ID().size()-1).getText()).getClass() == String.class)
                    second = variables.get(ctx.ID(ctx.ID().size()-1).getText()).toString();
                else
                    throw new Exception("Var "+ctx.ID(ctx.ID().size()-1).getText()+" isn't string");
            }
            else if(ctx.STRING(ctx.STRING().size()-1) == ctx.getChild(3))
                second = ctx.STRING(ctx.STRING().size()-1).getText().replace("\"", "");
            return new Attribute(first, second);
        }
        if(ctx.s != null)
        {
            return ctx.STRING(0).getText().replace("\"","");
        }
        if(ctx.n != null)
        {
            String first = "";
            String second = "";
            if(ctx.ID(0) == ctx.getChild(1))
            {
                if(!variables.containsKey(ctx.ID(0).getText()))
                    throw new Exception("No var "+ (ctx.ID(0).getText()));
                if(variables.get(ctx.ID(0).getText()).getClass() == String.class)
                    first = variables.get(ctx.ID(0).getText()).toString();
                else
                    throw new Exception("Var" + (ctx.ID(0).getText()+"isn't string"));
            }
            else if(ctx.STRING(0) == ctx.getChild(1))
                first = ctx.STRING(0).getText().replace("\"", "");
            if(ctx.ID(ctx.ID().size()-1) == ctx.getChild(3))
            {
                if(!variables.containsKey(ctx.ID(ctx.ID().size()-1).getText()))
                    throw new Exception("No var " + ctx.ID(ctx.ID().size()-1).getText());
                if(variables.get(ctx.ID(ctx.ID().size()-1).getText()).getClass() == String.class)
                    second = variables.get(ctx.ID(ctx.ID().size()-1).getText()).toString();
                else
                    throw new Exception("Var "+ ctx.ID(ctx.ID().size()-1).getText()+"isn't string");
            }
            else if(ctx.STRING(ctx.STRING().size()-1) == ctx.getChild(3))
                second = ctx.STRING(ctx.STRING().size()-1).getText().replace("\"", "");
            Nod el = new Nod(first, second);
            return el;
        }
        if(ctx.YES() != null)
        {
            return true;
        }
        if(ctx.NO() != null)
        {
            return false;
        }
        return null;
    }
    @Override public Object visitAssign(grammaParser.AssignContext  ctx) throws Exception {
        ArrayList<Object> left = new ArrayList<>();
        ArrayList<Object> right = new ArrayList<>();
        int index = 0;
        for(int i = 0; i < ctx.getChildCount(); i++)
        {
            if(ctx.getChild(i).getText().equals("="))
            {
                index = i + 1;
                break;
            }
            if(ctx.getChild(i).getText().equals(","))
                continue;
            left.add(ctx.getChild(i));
        }
        for(int i = index; i < ctx.getChildCount(); i++)
        {
            if(ctx.getChild(i).getText().equals(","))
                continue;
            right.add(ctx.getChild(i));
        }
        for(int i = 0; i < right.size(); i++)
        {

            for(int k = 0; k < ctx.expr().size(); k++)
            {
                if (right.get(i) == ctx.expr(k))
                {
                    right.set(i,visitExpr(ctx.expr(k)));
                }
            }
            for(int k = 0; k < ctx.math().size(); k++)
            {
                if (right.get(i) == ctx.math(k))
                {
                    right.set(i,visitMath(ctx.math(k)));
                }
            }
            for(int k = 0; k < ctx.in().size(); k++)
            {
                if (right.get(i) == ctx.in(k))
                {
                    right.set(i,visitIn(ctx.in(k)));
                }
            }
            for(int k = 0; k < ctx.call().size(); k++)
            {
                if (right.get(i) == ctx.call(k))
                {
                    right.set(i,visitCall(ctx.call(k)));
                }
            }
        }
        if(right.size() != left.size())
            throw new Exception("Number of vars not equal");
        else
        {
            for(int i = 0; i < left.size(); i++)
            {
                for(int k = 0; k< ctx.ID().size();k++)
                {
                    if(left.get(i) == ctx.ID(k))
                    {
                        variables.put(ctx.ID(k).getText(), right.get(i));
                    }
                }
            }
        }
        return 0;
    }
    @Override public Object visitAllindex(grammaParser.AllindexContext  ctx) throws Exception {
        Nod el;
        if(!variables.containsKey(ctx.ID().getText()))
            throw new Exception("No var " + ctx.ID().getText());
        if(variables.get(ctx.ID().getText()).getClass() == Nod.class)
            el = (Nod) variables.get(ctx.ID().getText());
        else
            throw new Exception("Type of " +ctx.ID().getText()+" is not Node");
        if(ctx.atindex() != null & ctx.chindex() != null)
        {
            Object index = visitExpr(ctx.chindex().expr());
            int index1;
            if(index.getClass() == Integer.class)
                index1 = (Integer)index;
            else
                throw new Exception("Index not int");
            index = visitExpr(ctx.atindex().expr());
            int index2;
            if(index.getClass() == Integer.class)
                index2 = (Integer)index;
            else
                throw new Exception("Index not int");
            Nod n;
            if(index1 >= el.nodChildren.size())
                throw new Exception("Index out of range");
            else
            {
                n = el.nodChildren.get(index1);
                if(index2 >= n.attributes.size())
                    throw new Exception("Index out of range");
                else
                {
                    return n.attributes.get(index2);
                }
            }
        }
        else if(ctx.chindex() != null)
        {
            Object index = visitExpr(ctx.chindex().expr());
            int index1;
            if(index.getClass() == Integer.class)
                index1 = (Integer)index;
            else
                throw new Exception("Index not int");
            if(index1 >= el.nodChildren.size())
                throw new Exception("Index out of range");
            else {
                return el.nodChildren.get(index1);
            }
        }
        else if(ctx.atindex() != null)
        {
            Object index = visitExpr(ctx.atindex().expr());
            int index2;
            if(index.getClass() == Integer.class)
                index2 = (Integer)index;
            else
                throw new Exception("Index not int");
            if(index2 >= el.attributes.size())
                throw new Exception("Index out of range");
            else
            {
                return el.attributes.get(index2);
            }
        }
        return 0;
    }

}