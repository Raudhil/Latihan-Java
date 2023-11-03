import java.io.*;
import java.util.Scanner;

public class LatihanScannerTokenizer {
    public static void main(String[] args) throws IOException {

//        // Scanner and Tokenizer File
//        FileReader read = new FileReader("input.txt");
//        BufferedReader buffered = new BufferedReader(read);
//
//        Scanner input = new Scanner(buffered);
//        System.out.println(input.nextLine());
//        buffered.mark(200);
//
//        buffered.reset();
//
//        FileWriter writer = new FileWriter("input2.txt");
//        BufferedWriter buffWrite = new BufferedWriter(writer);
//
//        input = new Scanner(buffWrite.write(a));
//        System.out.print("Masukkan kata: ");
//        a = input.nextLine();
//        buffWrite.write(a);

        // Mencoba Menulis file dengan Scanner lalu mengisinya

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama file java: ");
        String file = sc.nextLine();


        FileWriter newFile = new FileWriter(file);
        BufferedWriter buffFile = new BufferedWriter(newFile);

        System.out.print("Masukkan kata yang ingin dimasukkan: ");

        while (true){
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("selesai")){
                break;
            }
            buffFile.write(input + "\n");
        }

        buffFile.close();
        newFile.close();

        FileReader read = new FileReader(file);
        BufferedReader buffered = new BufferedReader(read);

        Scanner input = new Scanner(buffered);
        while (input.hasNext()) {
            System.out.println(input.nextLine());

        }

        buffered.mark(200);
        read.close();
        buffered.close();



    }
}
