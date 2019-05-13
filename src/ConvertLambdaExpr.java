import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.*;

import java.io.FileWriter;
import java.io.IOException;


public class ConvertLambdaExpr {

    public static void main(String[] args) {


        if(args.length != 1) {
            System.out.println("Wrong number of parameters please enter ONE argument");
            return;
        }
        try {
            String inputFile = args[0];


            //try to run file first and check if it to runnable

            //throws IOException in case file was not found
            //breaks file into character stream
            CharStream cs = CharStreams.fromFileName(inputFile);
            //converts a sequence of characters into sequence of tokens

            JavaLexer lexer = new JavaLexer(cs);

            //lexer.removeErrorListeners();
            //lexer.addErrorListener(ThrowingErrorListener.INSTANCE);


            //create a buffer of tokens from pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            //create a parser from tokens buffer
            JavaParser parser = new JavaParser(tokens);
            //begin parsing at init rule


            parser.removeErrorListeners();
            parser.addErrorListener(ThrowingErrorListener.INSTANCE);

            ParseTree tree = parser.compilationUnit();
            //Creating a generic parse tree walker that can trigger listeners waiting for event
            ParseTreeWalker walker = new ParseTreeWalker();

            ConvertLambdaExpListener converter = new ConvertLambdaExpListener(tokens);

            //initiate walk of tree with listener
            walker.walk(converter,tree);

            System.out.println(converter.rewriter.getText());
            runProcess(inputFile);

            writeToFile(converter.rewriter.getText(),inputFile);

        }catch (IOException e){
            System.out.println("File Name was not found");
        }catch (NotRunnableProcess | InterruptedException e){
            System.out.println("Error code is not compilable was not converted to new file");
            System.out.println(e.toString());
        }catch (ParseCancellationException e){
            System.out.println("Error in syntax occurred file was not converted to new file");
            System.out.println(e.getMessage());
        }

    }


    private static void runProcess(String inputFile) throws NotRunnableProcess , IOException ,InterruptedException{

        Process pro = Runtime.getRuntime().exec("javac " + inputFile);
        pro.waitFor();
        if(pro.exitValue() != 0)
            throw new NotRunnableProcess(pro);
    }

    private static void writeToFile(String data, String fileName){
        try(FileWriter fw = new FileWriter("/home/robert/IdeaProjects/ecote-project/Converted" + fileName)){
                fw.write(data);

        }catch (IOException e){
            System.out.println(e);
        }
    }
}
