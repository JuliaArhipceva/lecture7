package by.example.lecture13;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Example13InputStream {

    public static final String FILENAME = "src/main/resources/file.txt";
    private static final File FILE = new File(FILENAME);

    public static void main(String[] args) throws IOException {

    }

    private static void showSkip() throws IOException {
        InputStream inputStream = new FileInputStream(FILENAME);
        inputStream.skip(10L);

        int read = inputStream.read();
        System.out.println((char) read);
    }

    private static void showReadToTheBufferWithOffset() throws IOException {
        InputStream inputStream = new FileInputStream(FILENAME);
        byte[] buffer = new byte[1024];
        int offset = 0;
        int length = 10;

        while (offset + length <= 1024) {
            inputStream.read(buffer, offset, length);
            offset += length;
        }

        System.out.println(new String(buffer));
    }

    private static void showReadWithBuffer() throws IOException {
        InputStream inputStream = new FileInputStream(FILENAME);

        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes);

        System.out.println(new String(bytes));

        byte[] buffer = new byte[1024];
        while (inputStream.available() > 0) {
            inputStream.read(buffer);
            System.out.println(new String(buffer));
            Arrays.fill(buffer, (byte) 0);
        }

    }

    private static void showReadWithoutParams() throws IOException {
        InputStream inputStream = new FileInputStream(FILENAME);

        int available = inputStream.available();
        System.out.println("There are " + available + " bytes."); // ABC
        int readByte = inputStream.read();
        System.out.println("Byte from source: " + (char) readByte); // A

        available = inputStream.available();
        System.out.println("There are " + available + " bytes."); // BC

        int[] intRepresentationOfBytes = new int[available];
        for (int i = 0; i < available; i++) {
            intRepresentationOfBytes[i] = inputStream.read();
        }

        System.out.println("Rest bytes: " + new String(intRepresentationOfBytes, 0, available)); // BC

        int read = inputStream.read();
        System.out.println("Read after 3 bytes: " + read);

        ///

        System.out.println("Another stream");

        InputStream is = new FileInputStream(FILENAME);

        int byteFromStream = -1;
        do {
            byteFromStream = is.read();
            System.out.println("Byte from source: " + (char) byteFromStream);
        } while (byteFromStream != -1);
    }

}
