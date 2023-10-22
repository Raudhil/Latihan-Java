import java.util.Scanner;

public class StringFormatTutorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d;
        char c = '0';
        System.out.print("Masukkan angka pertama: ");
        int a = sc.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = sc.nextInt();

        while (c != '+' && c != '-' && c != '*' && c != '/'){
            System.out.print("Masukkan jenis operasi(+ - * /): ");
            c = sc.next().charAt(0);
            switch (c) {
                case '+':
                    d = a + b;
                    System.out.printf("\nHasil dari %d + %d = %05d", a, b, d);
                    break;
                case '-':
                    d = a - b;
                    System.out.printf("\nHasil dari %d - %d = %05d", a, b, d);
                    break;
                case '*':
                    d = a * b;
                    System.out.printf("\nHasil dari %d * %d = %05d", a, b, d);
                    break;
                case '/':
                    d = a / b;
                    System.out.printf("\nHasil dari %d / %d = %05d", a, b, d);
                    break;
                default:
                    System.out.println("Tolong masukkan operasi yang benar.");
                    break;
            }
        }
    }
}
