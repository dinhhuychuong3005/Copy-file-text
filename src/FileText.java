import java.io.*;

public class FileText {
    public static void copyFile(File sourceFile,File targetFile) throws IOException {
        FileReader fileReader = new FileReader(sourceFile);
        FileWriter fileWriter = new FileWriter(targetFile);
        int count;
        while ((count = fileReader.read()) != -1){
            fileWriter.write(count);
        }
        fileWriter.close();
        fileReader.close();
    }
}
