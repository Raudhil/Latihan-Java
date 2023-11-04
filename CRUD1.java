import java.util.Scanner;

public class CRUD1 {
    public static void main(String[] args) {

        boolean lanjutkan = true;
        String yorn;


        System.out.println("Membuat CRUD\n");

        Scanner input = new Scanner(System.in);

        while (lanjutkan){
            clear();

            System.out.print("Masukkan input: ");
            String number = input.next();

            switch (number){
                case "1":
                    System.out.println("\n===============");
                    System.out.println("MEMBELI MAKANAN");
                    System.out.println("===============");
                    break;
                case "2":
                    System.out.println("\n===============");
                    System.out.println("MEMBELI MINUMAN");
                    System.out.println("===============");
                    break;
                case "3":
                    System.out.println("\n=================");
                    System.out.println("MEMBELI PERALATAN");
                    System.out.println("=================");
                    break;
                case "4":
                    System.out.println("\n==================");
                    System.out.println("MEMBELI ALAT MASAK");
                    System.out.println("==================");
                    break;
                default:
                    System.out.println("\nMohon masukkan input yang benar.");
                    System.out.print("\nMasukkan input: ");
                    number = input.next();
                    break;
            }

            System.out.print("Apakah anda ingin melanjutkan? (y/n)");
            yorn = input.next();


            lanjutkan = yorn.equalsIgnoreCase("y");

        }
    }

    static void clear(){
        try {
            new ProcessBuilder("cmd","/c","dir").inheritIO().start().waitFor();
        } catch (Exception ex){
            System.err.println("Tidak bisa clear screen");
        }


    }

}

