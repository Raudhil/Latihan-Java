import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CRUD2{
    public static void main(String[] args) throws IOException {
        System.out.println("Informasi Mahasiswa Polinema dengan prestasi terbaik\n");

        Scanner sc = new Scanner(System.in);

        FileReader read = new FileReader("database.txt");
        BufferedReader buffRead = new BufferedReader(read);

        String data = buffRead.readLine();
        String [] informasi = {"Nama","Kelas","NIM"};

        StringTokenizer token = new StringTokenizer(data,"_");
        StringTokenizer token2 = new StringTokenizer(data,"_");
        StringTokenizer token3 = new StringTokenizer(data,"_");
        StringTokenizer token4 = new StringTokenizer(data,"_");
        StringTokenizer token5 = new StringTokenizer(data,"_");
        StringTokenizer token6 = new StringTokenizer(data,"_");
        StringTokenizer token7 = new StringTokenizer(data,"_");

        boolean yesOrNo = true;
        String yesOrNo2;

        while(yesOrNo) {
            clear();
            System.out.print("Tampilkan data mahasiswa: ");
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        System.out.println(informasi[i] + ": " + token.nextToken());
                    }
                    break;
                case 2:
                    for (int i = 0; i < 3; i++) {
                        token2.nextToken();
                    }

                    data = buffRead.readLine();
                    token2 = new StringTokenizer(data, "_");

                    for (int i = 0; i < 3; i++) {
                        System.out.println(informasi[i] + ": " + token2.nextToken());
                    }
                    break;
                case 3:
                    for (int j = 0; j < 1; j++) {
                        for (int i = 0; i < 3; i++) {
                            token3.nextToken();
                        }
                        data = buffRead.readLine();
                        token3 = new StringTokenizer(data, "_");
                    }

                    data = buffRead.readLine();
                    token3 = new StringTokenizer(data, "_");

                    for (int i = 0; i < 3; i++) {
                        System.out.println(informasi[i] + ": " + token3.nextToken());
                    }
                    break;
                case 4:
                    for (int j = 0; j < 2; j++) {
                        for (int i = 0; i < 3; i++) {
                            token4.nextToken();
                        }
                        data = buffRead.readLine();
                        token4 = new StringTokenizer(data, "_");
                    }

                    data = buffRead.readLine();
                    token4 = new StringTokenizer(data, "_");

                    for (int i = 0; i < 3; i++) {
                        System.out.println(informasi[i] + ": " + token4.nextToken());
                    }
                    break;
                case 5:
                    for (int j = 0; j < 3; j++) {
                        for (int i = 0; i < 3; i++) {
                            token5.nextToken();
                        }
                        data = buffRead.readLine();
                        token5 = new StringTokenizer(data, "_");
                    }

                    data = buffRead.readLine();
                    token5 = new StringTokenizer(data, "_");

                    for (int i = 0; i < 3; i++) {
                        System.out.println(informasi[i] + ": " + token5.nextToken());
                    }
                    break;
                case 6:
                    for (int j = 0; j < 4; j++) {
                        for (int i = 0; i < 3; i++) {
                            token6.nextToken();
                        }
                        data = buffRead.readLine();
                        token6 = new StringTokenizer(data, "_");
                    }

                    data = buffRead.readLine();
                    token6 = new StringTokenizer(data, "_");

                    for (int i = 0; i < 3; i++) {
                        System.out.println(informasi[i] + ": " + token6.nextToken());
                    }
                    break;
                case 7:
                    for (int j = 0; j < 5; j++) {
                        for (int i = 0; i < 3; i++) {
                            token7.nextToken();
                        }
                        data = buffRead.readLine();
                        token7 = new StringTokenizer(data, "_");
                    }

                    data = buffRead.readLine();
                    token7 = new StringTokenizer(data, "_");

                    for (int i = 0; i < 3; i++) {
                        System.out.println(informasi[i] + ": " + token7.nextToken());
                    }
                    break;
                default:
                    System.err.println("Mohon input data mahasiswa dari 1-7");
                    break;
            }

            System.out.print("Apakah anda ingin data mahasiswa lain (y/n)? ");
            yesOrNo2 = sc.next();

            yesOrNo = yesOrNo2.equalsIgnoreCase("y");
        }

    }
    public static void clear(){
        try{
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        } catch (Exception e){
            System.err.println("Tidak bisa");
        }
    }
}