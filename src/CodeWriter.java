import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CodeWriter {
    private String outFilename;
    public CodeWriter(String filename) {
        int dotPos = filename.indexOf(".");
        outFilename = filename.substring(0,dotPos+1).concat("hack");
        File file = new File(outFilename);
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void setFileName(String fileName) {
        //TODO write setFileName() method
    }
    public void writeArithmetic(String command) {
        //TODO write writeArithmetic() method
    }
    public void writePushPop(String command, String segment, int index) {
        //TODO write writePushPop() method
    }
    //write() method from HACKASS
    public void write(String command) {
        try {
//            System.out.println("file name is: " + outFilename);
            FileWriter myWriter = new FileWriter(outFilename, true);
            myWriter.write(command);
            myWriter.write(System.getProperty( "line.separator" ));
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
