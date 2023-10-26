import java.io.FileInputStream;
import java.io.IOException;

public class IOStream {
    public static void main(String[] args) throws IOException {

        FileInputStream file,file2;

        StringBuilder kalimat = new StringBuilder("Assalamualaikum Warahmatullahi Wabarakatuh.");
        try {
            file = new FileInputStream("salam.txt");
            for (int i = 0; i < 43; i++){
                System.out.print(file.read());
            }

            System.out.print("\n");
            file2 = new FileInputStream("perkenalan.txt");
            for (int i = 0; i < 46; i++){
                System.out.print((char)file2.read());
            }
        } catch (Exception e){
            System.out.println("File Tersebut tidak ada");
        } finally {
            System.out.println("\nIni adalah akhir dari Perkenalan");
        }
        System.out.println("Kalau salah tetep lanjut lah");

    }
}
