import java.util.Arrays;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ExtendVisitor extends calBaseVisitor<String> 
{
    private final SymbolTable st;

    public ExtendVisitor() {
        st = new SymbolTable();
    }

    @Override
    public String visitVar_decl(calParser.Var_declContext ctx) 
    {
        String id = ctx.ID().getText();
        String type = ctx.type().getText();

        st.put(id, type);
        return id;
    }

    @Override
    public String visitConst_decl(calParser.Const_declContext ctx) 
    {
        String id = ctx.ID().getText();
        String type = ctx.type().getText();
        st.put(id, type);
        return ctx.ID().getText();
    }

    @Override
	public String visitStatement_block(calParser.Statement_blockContext ctx) 
    {
        if (ctx.statement() != null)
            visit(ctx.statement());
        if (ctx.statement_block() != null)
            visitChildren(ctx.statement_block());
        return "";
    }    

    @Override
    public String visitFunction(calParser.FunctionContext ctx) 
    {

        String id = ctx.ID().getText();
        String type = ctx.type().getText();
        st.put(id, type);
        st.put("#", "Null");
        type = type + "_" + visit(ctx.param_list());
        st.set(id, type);
        if (ctx.decl_list() != null)
            visit(ctx.decl_list());
        if (ctx.statement_block() != null)
            visit(ctx.statement_block());
        st.put("##", "Null");

        return id;
    }

    @Override
    public String visitMain(calParser.MainContext ctx) 
    {
        st.put("#", "Null");

        if (ctx.decl_list() != null)
            visit(ctx.decl_list());
        if (ctx.statement_block() != null)
            visit(ctx.statement_block());
        st.put("##", "Null");
        return "";
    }

    @Override
    public String visitExpression(calParser.ExpressionContext ctx) 
    {
        String id = ctx.ID().getText();
        String expression_type = visit(ctx.expression());
        boolean inMap;
        inMap = st.contains(id);
        if (!inMap) {
            System.out.println("Variable: " + id + " has no instance");
        }
        if (expression_type != null && expression_type.contains("_")) {
            String current_Type = expression_type.split("_")[0];
            String type = st.get(id);
            if (!type.equals(current_Type)) {
                System.out.println("The return value \"" + id + "\" is of invalid type \"" + type + "\".");
            }
        }
        return id;
    }

    @Override 
    public String visitNemp_arg_list(calParser.Nemp_arg_listContext ctx) 
    { 
        return visitChildren(ctx);
    }

    @Override 
    public String visitArg_list(calParser.Arg_listContext ctx) 
    { 
        return visitChildren(ctx);
    }

    @Override 
    public String visitFunction_list(calParser.Function_listContext ctx) 
    { 
        if (ctx.function() != null)
            visit(ctx.function());
        if (ctx.function_list() != null)
            visit(ctx.function_list());
        return "";
    }


    @Override 
    public String visitDecl_list(calParser.Decl_listContext ctx) 
    { 
        return visitChildren(ctx); 
    }

    @Override 
    public String visitParam_list(calParser.Param_listContext ctx) 
    { 
        return visitChildren(ctx); 
    }
}