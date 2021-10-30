import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Parser {
    private BufferedReader br;
    private String line;

    public Parser(String filename) {
        // opens the input file and gets ready to parse it
        File file = new File(filename);
        this.br = null;
        try {
            //This class accesses the input file, removes its whitespace and parses each instruction
            FileReader fr = new FileReader(file);
            this.br = new BufferedReader(fr);
            line = br.readLine().trim();

        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println(symbol());
    }

    public boolean hasMoreCommands() {
        //returns true when there is a command to parse on the current line
        return line != null;
    }
    public void advance(){
        //reads the next line of the text file
        try {
            System.out.println(line);
//            String testOut = String.format("dest: %s, comp: %s, jump: %s, symbol: %s", dest(), comp(), jump(), symbol());
//            System.out.println(testOut);
            line = br.readLine();
            if (line != null) line = line.trim();
            if (!hasMoreCommands()) br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public String commandType() {
        if (
                line.equals("add") || line.equals("sub") || line.equals("lt")
                || line.equals("gt") || line.equals("eq") || line.equals("neg")
                || line.equals("or") || line.equals("and") || line.equals("not"))
            return "C_ARITHMETIC";
        else if(line.startsWith("push")){
            return "C_PUSH";
        }
        else if(line.startsWith("pop")){
            return "C_POP";
        }
        else if(line.startsWith("label")){
            return "C_LABEL";
        }
        else if(line.startsWith("goto")){
            return "C_GOTO";
        }
        else if(line.startsWith("if")){
            return "C_IF";
        }
        else if(line.startsWith("function")){
            return "C_FUNCTION";
        }
        else if(line.equals("return")){
            return "C_RETURN";
        }
        else if(line.startsWith("call")){
            return "C_CALL";
        }
        else return "";

    }
    public String arg1() {

        //TODO test arg1()
        if (commandType().equals("C_ARITHMETIC")){
            return line;
        }
        else if (!commandType().equals("")){
            String[] parts = line.split(" ");
            return parts[1];
        }
        else return "";


    }
    public int arg2() {
        //TODO test arg2
        String[] parts = line.split(" ");
        return Integer.parseInt(parts[2]);
    }
}
