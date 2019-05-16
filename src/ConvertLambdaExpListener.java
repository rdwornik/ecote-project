import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

public class ConvertLambdaExpListener extends JavaBaseListener {

    TokenStreamRewriter rewriter;

    static String typeName;
    static String variableName;
    static StringBuilder parameters = new StringBuilder();


    public ConvertLambdaExpListener(TokenStream tokens) {
        rewriter = new TokenStreamRewriter(tokens);
    }

    @Override
    public void enterClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx) {
        typeName = ctx.getText();
    }

    @Override
    public void enterVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx) {
        variableName = ctx.getText();
    }

    @Override
    public void enterLambdaExpression(JavaParser.LambdaExpressionContext ctx) {


        String field;
        //add initialization in place of '->'
        field = "new " + typeName + "()";
        rewriter.replace(ctx.arrow().start, field);


        //add closing bracket at and of anonymous method declaration
        rewriter.insertBefore(ctx.lambdaBody().block().stop,"}");

        //delete open and closing parenthesis
        rewriter.delete(ctx.lambdaParameters().start);
        rewriter.delete(ctx.lambdaParameters().stop);
    }


    @Override
    public void enterLambdaBody(JavaParser.LambdaBodyContext ctx) {
        //add anonymous method declaration
        String field;
        field = " public void " + variableName + "(" + parameters.toString() + ") {";
        rewriter.insertAfter(ctx.start,field);
        parameters.setLength(0);
    }

    @Override
    public void enterParam(JavaParser.ParamContext ctx) {
        parameters.append(" Object " + ctx.stop.getText());
        rewriter.delete(ctx.start);
        rewriter.delete(ctx.stop);

    }

    @Override
    public void enterFolloParam(JavaParser.FolloParamContext ctx) {
        parameters.append(ctx.start.getText() + " Object " + ctx.stop.getText());
        rewriter.delete(ctx.start);
        rewriter.delete(ctx.stop);
    }

    @Override
    public void enterClassName(JavaParser.ClassNameContext ctx) {
        rewriter.replace(ctx.start,"Converted" + ctx.start.getText());
    }
}
