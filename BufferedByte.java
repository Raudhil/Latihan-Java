import java.io.*;
import java.util.Arrays;

public class BufferedByte {
    public static void main(String[] args) throws IOException {

        // Membaca file dan menyalin isinya dengan BufferedInputStream dan array byte.

        FileInputStream file1 = new FileInputStream("input.txt");
        System.out.println(file1.available());

        BufferedInputStream buffered = new BufferedInputStream(file1);

        byte[] data = buffered.readAllBytes();
        System.out.println(Arrays.toString(data));

        String convert = new String(data);
        System.out.println(convert);

        // Membuat file dengan BufferedOutputStream

        FileOutputStream file2 = new FileOutputStream("input2.txt");
        BufferedOutputStream buffered2 = new BufferedOutputStream(file2);

        buffered2.write(data);
        buffered2.flush();

        file1.close();
        buffered.close();
        file2.close();
        buffered2.close();

        // Mencoba membuat file baru dan mengisinya sendiri.

        String fileName = "input3.txt";

        FileWriter writer = new FileWriter(fileName);

        writer.write(convert);

        writer.close();


    }
}


