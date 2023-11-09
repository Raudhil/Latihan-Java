import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CRUD3 {
    public static void main(String[] args) throws IOException {



        System.out.println("Mencari File");

        FileReader reader = new FileReader("database.txt");
        BufferedReader buffRead = new BufferedReader(reader);

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan keyword: ");
        String keywords = sc.nextLine();
        System.out.println();
        String [] keyword = keywords.split("\\s+");

        cekBuku(keyword);
    }

    static void cekBuku(String[] keywords)throws IOException{

        FileReader read = new FileReader("database.txt");
        BufferedReader buffRead = new BufferedReader(read);

        String data = buffRead.readLine();
        boolean exist;

        while (data != null){

            exist = true;

            for (String keyword : keywords){
                exist = exist && data.toLowerCase().contains(keyword.toLowerCase());
            }

            if (exist){
                String [] info = {"Nama","Kelas","NIM"};
                StringTokenizer token = new StringTokenizer(data,"_");
                for (String print : info){
                    System.out.println(print + ": " + token.nextToken());
                }
                System.out.println();
            }

            data = buffRead.readLine();
        }

    }
}
