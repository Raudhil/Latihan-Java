import java.io.*;
import java.util.Arrays;

public class BufferedCharacter {
    public static void main(String[] args)throws IOException {

        System.out.println("Latihan Buffered Character Stream");
        System.out.println("=====================================");

        // Membaca file dengan Buffered File Reader
        FileReader read = new FileReader("input.txt");
        BufferedReader readBuff = new BufferedReader(read);
        readBuff.mark(200);
        String a = readBuff.readLine();

        System.out.println(a);

        readBuff.reset();

        System.out.println(" ");

        // Membaca file per baris
        System.out.println(readBuff.readLine());
        System.out.println(readBuff.readLine());

        // Membaca file dengan char
        readBuff.reset();

        char[] readChar = new char[100];
        readBuff.read(readChar);
        System.out.println(Arrays.toString(readChar));

        // Menulis file dengan Buffered character

        FileWriter newFile = new FileWriter("input2.txt");
        BufferedWriter bufferedFile = new BufferedWriter(newFile);

        bufferedFile.write(a);

        bufferedFile.close();



    }
}
