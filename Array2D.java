import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pertambahan Matriks

        System.out.println("Penjumlahan matriks");

        int [][] matriks1 = {
                {1,2,3},
                {4,5,6},
        };
        int [][] matriks2 = {
                {11,12,13},
                {14,15,16},
        };

        susun(matriks1,matriks2);
        System.out.println("\nMatriks a + Matriks b adalah:");


        int [][] hasil = jumlah(matriks1,matriks2);
        total(hasil);



    }
    static int[][] jumlah(int [][] matriks_a, int [][] matriks_b){

        int[][] hasil = new int [matriks_a.length][matriks_a[0].length];
        for (int i = 0; i < matriks_a.length; i++){
            for (int j = 0; j < matriks_a[i].length;j++){
                hasil[i][j] = matriks_a[i][j] + matriks_b[i][j];

            }
        }
        return hasil;
    }
    static void susun(int [][] array,int[][] array2){
        int baris = array.length;
        int kolom = array[0].length;
        System.out.println("Matriks a");
        for (int i = 0; i < baris;i++){
            for (int j = 0; j < kolom; j++){
                System.out.print("|");
                System.out.print(array[i][j]);
            }
            System.out.print("|");
            System.out.print("\n");
        }
        System.out.print("\n");
        System.out.println("Matriks b");
        for (int k = 0; k < baris;k++){
            for (int l = 0; l < kolom; l++){
                System.out.print("|");
                System.out.print(array2[k][l]);
            }
            System.out.print("|");
            System.out.print("\n");
        }

    }
    static void total(int [][] array){
        int baris = array.length;
        int kolom = array[0].length;
        System.out.print("\n");
        for (int i = 0; i < baris;i++){
            for (int j = 0; j < kolom; j++){
                System.out.print("|");
                System.out.print(array[i][j]);
            }
            System.out.print("|");
            System.out.print("\n");
        }
    }
}
