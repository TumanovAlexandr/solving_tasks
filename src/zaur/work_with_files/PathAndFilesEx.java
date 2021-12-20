package zaur.work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesEx {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test5.txt");
        Path directoryPath = Paths.get("/Users/alex/Intellij/solving_tasks/src/zaur/work_with_files/other");

        Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);


    }
}
