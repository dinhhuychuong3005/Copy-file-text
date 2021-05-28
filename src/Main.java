import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("sourceFile.txt");
        File file1 = new File("targetFile.txt");
        try {
            if (!file.exists()){
                file.createNewFile();
            }
            if (!file1.exists()){
                file1.createNewFile();
            }
            FileText.copyFile(file,file1);
            System.out.println("done");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
