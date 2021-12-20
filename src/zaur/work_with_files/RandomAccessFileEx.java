package zaur.work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
    public static void main(String[] args){
        try(RandomAccessFile rw = new RandomAccessFile("test10.txt", "rw")) {
//            int a = rw.read();
//            System.out.println((char) a);

            rw.seek(101);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
