package zaur.work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String text = "123455";

        try(FileWriter fileWriter = new FileWriter("src/zaur/work_with_files/test.txt")) {
            for (int i = 0; i < text.length(); i++) {
                fileWriter.write(text.charAt(i));
            }
            System.out.println("done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
