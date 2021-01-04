package by.example.lecture13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Random;

public class Example13OutputStream {

    public static final String FILENAME = "src/main/resources/fileForOutput.txt";

    public static void main(String[] args) throws IOException {

    }

    private static void showWriteWithBufferWithOffset() throws IOException {
        OutputStream outputStream = new FileOutputStream(FILENAME);

        Random random = new Random();
        int bufferSize = 64;
        byte[] dataToWrite = new byte[bufferSize];
        for (int i = 0; i < bufferSize; i++) {
            dataToWrite[i] = (byte) (random.nextInt(98) + 32);
        }

        System.out.println(new String(dataToWrite));

        outputStream.write(dataToWrite, 32, 8);
    }

    private static void showWriteWithBuffer() throws IOException {
        OutputStream outputStream = new FileOutputStream(FILENAME);

        byte[] dataToWrite = new byte[1024];
        Arrays.fill(dataToWrite, (byte) 'A');

        outputStream.write(dataToWrite);
    }

    private static void showWriteWithoutParams() throws IOException {
        OutputStream outputStream = new FileOutputStream(FILENAME);

        outputStream.write(65);
    }

}
