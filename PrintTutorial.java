import java.util.Scanner;

public class PrintTutorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String kalimat1 = "Hello Guys Welcome back with me Raudhil Firdaus Naufal";
        System.out.println(kalimat1);

        System.out.print("Masukkan nama:");
        String kalimat2 = sc.next();

        String kalimat5 = kalimat1.replace("Raudhil Firdaus Naufal",kalimat2);

        System.out.println(kalimat5);

        System.out.print("Masukkan nama:");
        String kalimat3 = sc.next();

        String kalimat4 = kalimat5.replace(kalimat2,kalimat3);
        System.out.println(kalimat4);

        System.out.println(kalimat4.compareTo(kalimat5));
    }
}
