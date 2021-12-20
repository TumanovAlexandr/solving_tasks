package zaur.work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class ChannelBufferEx1 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test10.txt", "rw");
             FileChannel channel = file.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder stringBuilder = new StringBuilder();

            int byteRead = channel.read(buffer);
            while (byteRead > 0) {
                System.out.println("Read " + byteRead);
                buffer.flip();
                while (buffer.hasRemaining()) {
                    stringBuilder.append((char) buffer.get());
                }
                buffer.clear();
                byteRead = channel.read(buffer);
            }

            System.out.println(stringBuilder);

            String text = "\n1234567";

//            ByteBuffer byteBuffer = ByteBuffer.allocate(text.getBytes().length);
//            byteBuffer.put(text.getBytes());
//            byteBuffer.flip();
//            channel.write(byteBuffer);

            ByteBuffer byteBuffer = ByteBuffer.wrap(text.getBytes(StandardCharsets.UTF_8));
            channel.write(byteBuffer);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
