package pack;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link grammaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface grammaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link grammaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(grammaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(grammaParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammaParser#math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath(grammaParser.MathContext ctx) throws Exception;
	/**
	 * Visit a parse tree produced by {@link grammaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(grammaParser.ExprContext ctx) throws Exception;
	/**
	 * Visit a parse tree produced by {@link grammaParser#const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst(grammaParser.ConstContext ctx) throws Exception;
	/**
	 * Visit a parse tree produced by {@link grammaParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(grammaParser.FuncContext ctx) throws Exception;
	/**
	 * Visit a parse tree produced by {@link grammaParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(grammaParser.ReturnContext ctx) throws Exception;
	/**
	 * Visit a parse tree produced by {@link grammaParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(grammaParser.CallContext ctx) throws Exception;
	/**
	 * Visit a parse tree produced by {@link grammaParser#cast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(grammaParser.CastContext ctx) throws Exception;
	/**
	 * Visit a parse tree produced by {@link grammaParser#infunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfunc(grammaParser.InfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammaParser#funcname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncname(grammaParser.FuncnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammaParser#par}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(grammaParser.ParContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammaParser#comand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComand(grammaParser.ComandContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammaParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(grammaParser.IfContext ctx) throws Exception;
	/**
	 * Visit a parse tree produced by {@link grammaParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(grammaParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammaParser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart(grammaParser.PartContext ctx) throws Exception;
	/**
	 * Visit a parse tree produced by {@link grammaParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(grammaParser.ForContext ctx) throws Exception;
	/**
	 * Visit a parse tree produced by {@link grammaParser#binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(grammaParser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammaParser#in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn(grammaParser.InContext ctx) throws Exception;
	/**
	 * Visit a parse tree produced by {@link grammaParser#out}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut(grammaParser.OutContext ctx) throws Exception;
	/**
	 * Visit a parse tree produced by {@link grammaParser#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexpr(grammaParser.BoolexprContext ctx) throws Exception;
	/**
	 * Visit a parse tree produced by {@link grammaParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(grammaParser.WhileContext ctx) throws Exception;
	/**
	 * Visit a parse tree produced by {@link grammaParser#until}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntil(grammaParser.UntilContext ctx) throws Exception;
	/**
	 * Visit a parse tree produced by {@link grammaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(grammaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammaParser#chindex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChindex(grammaParser.ChindexContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammaParser#atindex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtindex(grammaParser.AtindexContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammaParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(grammaParser.AssignContext ctx) throws Exception;
	/**
	 * Visit a parse tree produced by {@link grammaParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(grammaParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammaParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForm(grammaParser.FormContext ctx) throws Exception;
	/**
	 * Visit a parse tree produced by {@link grammaParser#allindex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllindex(grammaParser.AllindexContext ctx) throws Exception;
}