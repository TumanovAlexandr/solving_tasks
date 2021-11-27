package foxminded;

import java.io.*;
import java.nio.file.Files;
import java.util.Base64;

public class App02 {
    public static void main(String[] args) throws IOException {

        String filePath = "/Users/alex/Downloads/temp/test.txt";
        File file = new File(filePath);

        byte[] fileContent = Files.readAllBytes(file.toPath());

        String fileString = Base64.getEncoder().encodeToString(fileContent);

        System.out.println(fileString);

    }
}
