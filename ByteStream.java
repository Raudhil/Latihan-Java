import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    public static void main(String[] args) throws IOException {
        System.out.println("Membaca dan membuat file.");

        // Input dan output Stream dengan byte.

        FileInputStream data = new FileInputStream("input.txt");
        int readData = data.read();


        try{while (readData != -1) {
            System.out.print((char) readData);
            readData = data.read();
        }
        } finally {
            data.close();
        }
        System.out.println(" ");
        // Menambahkan File dan mengisinya.

        try {
            data = new FileInputStream("input2.txt");

            int a = data.read();

            FileOutputStream out = new FileOutputStream("input3.txt");
            out.write(a);

            while (a != -1) {
                out.write(a);
                a = data.read();
            }
        } finally {
            data.close();
            System.out.println("Ini adalah akhir dari program.");
        }

        //Membuat file dan mengisinya.

        try {
            FileOutputStream fileBaru = new FileOutputStream("file2.txt");

            FileInputStream isi = new FileInputStream("file2.txt");
            int baru = 80;
            while (baru != 70){
                fileBaru.write(baru);
                baru = isi.read();
                baru--;
            }
        } finally {
            System.out.println("Program Telah Dibuat.");
        }

    }
}
