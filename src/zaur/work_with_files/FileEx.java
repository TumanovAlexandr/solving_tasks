package zaur.work_with_files;

import java.io.File;

public class FileEx {
    public static void main(String[] args) {
        File file = new File("test10.txt");
        File folder = new File("/Users/alex/Intellij/solving_tasks/src/zaur/work_with_files/other");

        System.out.println(file.getAbsolutePath());
        System.out.println(folder.getAbsolutePath());
        System.out.println("--------------");

        System.out.println(file.isAbsolute());
        System.out.println(folder.isAbsolute());
        System.out.println("--------------");

        System.out.println(file.isDirectory());
        System.out.println(folder.isDirectory());
        System.out.println("--------------");

        System.out.println(file.exists());
        System.out.println(folder.exists());
        System.out.println("--------------");



    }
}
