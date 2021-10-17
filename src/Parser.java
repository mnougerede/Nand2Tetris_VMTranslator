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
        //TODO fill in commandType method for VM translator

        //FROM HACKASS - returns the instruction type (A, C or L) - address, compute, label
//        if (line.contains("=")||line.contains(";")){
//            return "C"; // C Command
//        }
//        else if (line.startsWith("@")){
//            return "A"; // A Command
//        }
//        else if (line.startsWith("(")){
//            return "L"; // L Command
//        }
//        else return "";

    }
    public String arg1() {
        if (!commandType().equals("C_RETURN")) {
            //TODO write if statements for return of arg1()

        }
    }
    public int arg2() {
        if (commandType().equals("C_PUSH") || commandType().equals("C_POP") || commandType().equals("C_FUNCTION") || commandType().equals("C_CALL")) {
            //TODO write if statements for return of arg2()

        }
    }
}
