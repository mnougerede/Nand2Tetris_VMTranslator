public class Main {

    public static void main(String[] args){

        Parser parser = new Parser("C:\\Users\\mnoug\\Study\\Coursera\\Nand2Tetris\\source files\\nand2tetris\\projects\\07\\MemoryAccess\\BasicTest\\BasicTest.vm");
        CodeWriter codeWriter = new CodeWriter("C:\\Users\\mnoug\\Study\\Coursera\\Nand2Tetris\\source files\\nand2tetris\\projects\\07\\MemoryAccess\\BasicTest.vm");


        //TODO add while has more commands loop

        //TODO add call if certain command type logic to the main method and remove it from the Parser method
        //eg if command is NOT C_RETURN then call Parser.arg1
            // if command is C_PUSH, C_POP, C_FUNCTION or C_CALL  then call Parser.arg2
    }


}
