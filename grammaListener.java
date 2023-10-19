package pack;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammaParser}.
 */
public interface grammaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(grammaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(grammaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(grammaParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(grammaParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaParser#math}.
	 * @param ctx the parse tree
	 */
	void enterMath(grammaParser.MathContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaParser#math}.
	 * @param ctx the parse tree
	 */
	void exitMath(grammaParser.MathContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(grammaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(grammaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaParser#const}.
	 * @param ctx the parse tree
	 */
	void enterConst(grammaParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaParser#const}.
	 * @param ctx the parse tree
	 */
	void exitConst(grammaParser.ConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(grammaParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(grammaParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(grammaParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(grammaParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(grammaParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(grammaParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaParser#cast}.
	 * @param ctx the parse tree
	 */
	void enterCast(grammaParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaParser#cast}.
	 * @param ctx the parse tree
	 */
	void exitCast(grammaParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaParser#infunc}.
	 * @param ctx the parse tree
	 */
	void enterInfunc(grammaParser.InfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaParser#infunc}.
	 * @param ctx the parse tree
	 */
	void exitInfunc(grammaParser.InfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaParser#funcname}.
	 * @param ctx the parse tree
	 */
	void enterFuncname(grammaParser.FuncnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaParser#funcname}.
	 * @param ctx the parse tree
	 */
	void exitFuncname(grammaParser.FuncnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaParser#par}.
	 * @param ctx the parse tree
	 */
	void enterPar(grammaParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaParser#par}.
	 * @param ctx the parse tree
	 */
	void exitPar(grammaParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaParser#comand}.
	 * @param ctx the parse tree
	 */
	void enterComand(grammaParser.ComandContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaParser#comand}.
	 * @param ctx the parse tree
	 */
	void exitComand(grammaParser.ComandContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(grammaParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(grammaParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(grammaParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(grammaParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaParser#part}.
	 * @param ctx the parse tree
	 */
	void enterPart(grammaParser.PartContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaParser#part}.
	 * @param ctx the parse tree
	 */
	void exitPart(grammaParser.PartContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(grammaParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(grammaParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaParser#binary}.
	 * @param ctx the parse tree
	 */
	void enterBinary(grammaParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaParser#binary}.
	 * @param ctx the parse tree
	 */
	void exitBinary(grammaParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaParser#in}.
	 * @param ctx the parse tree
	 */
	void enterIn(grammaParser.InContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaParser#in}.
	 * @param ctx the parse tree
	 */
	void exitIn(grammaParser.InContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaParser#out}.
	 * @param ctx the parse tree
	 */
	void enterOut(grammaParser.OutContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaParser#out}.
	 * @param ctx the parse tree
	 */
	void exitOut(grammaParser.OutContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr(grammaParser.BoolexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr(grammaParser.BoolexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(grammaParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(grammaParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaParser#until}.
	 * @param ctx the parse tree
	 */
	void enterUntil(grammaParser.UntilContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaParser#until}.
	 * @param ctx the parse tree
	 */
	void exitUntil(grammaParser.UntilContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(grammaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(grammaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaParser#chindex}.
	 * @param ctx the parse tree
	 */
	void enterChindex(grammaParser.ChindexContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaParser#chindex}.
	 * @param ctx the parse tree
	 */
	void exitChindex(grammaParser.ChindexContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaParser#atindex}.
	 * @param ctx the parse tree
	 */
	void enterAtindex(grammaParser.AtindexContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaParser#atindex}.
	 * @param ctx the parse tree
	 */
	void exitAtindex(grammaParser.AtindexContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(grammaParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(grammaParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(grammaParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(grammaParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaParser#form}.
	 * @param ctx the parse tree
	 */
	void enterForm(grammaParser.FormContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaParser#form}.
	 * @param ctx the parse tree
	 */
	void exitForm(grammaParser.FormContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaParser#allindex}.
	 * @param ctx the parse tree
	 */
	void enterAllindex(grammaParser.AllindexContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaParser#allindex}.
	 * @param ctx the parse tree
	 */
	void exitAllindex(grammaParser.AllindexContext ctx);
}