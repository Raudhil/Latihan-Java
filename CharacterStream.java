import java.io.*;

public class CharacterStream {
    public static void main(String[] args) throws IOException {

        // Perbedaan antara Byte Stream dan Character Stream Adalah jika menggunakan Byte Stream hanya bisa menggunakan
        // character lokal sedangkan jika kita menggunakan Character Stream kita bisa menggunakan karakter internasional.

        System.out.println("Ini adalah Character Stream.");

        FileInputStream inputByte = new FileInputStream("input.txt");
        FileReader inputChar = new FileReader("input.txt");

        FileOutputStream outputByte = new FileOutputStream("output.txt");
        FileWriter outputChar = new FileWriter("output.txt");

        int text = inputByte.read();
        int text2 = inputChar.read();

        while (text != -1){
            System.out.print((char)text + " ");
            outputByte.write(text);
            text = inputByte.read();
        }
        System.out.println(" ");

        while (text2 != -1){
            System.out.print((char) text2 + " ");
            outputChar.write(text2);
            text2 = inputChar.read();
        }

    }
}
