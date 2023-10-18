import java.util.Arrays;

public class MatriksMultiplication {
    public static void main(String[] args) {
        System.out.println("Matriks Multiplication");

        int [][] matriks_a = {
                {10,20},
                {30,40},
        };

        int [][] matriks_b = {
                {11,12},
                {13,14},
        };

        print(matriks_a);
        System.out.print("\n");
        print(matriks_b);
        System.out.println("\nHasil dari perkalian matriks a dan matriks b adalah:");
        System.out.print("\n");
        print2(matriks_a,matriks_b);
    }
    static void print2(int [][] matriks_1,int[][] matriks_2){
        int baris = matriks_1.length;
        int kolom = matriks_1[0].length;

        int [][] hasil = new int[baris][kolom];
        int count;

        for(int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                count = 0;
                for (int k = 0; k < kolom; k++) {
                    count += matriks_1[i][k] * matriks_2[k][j];
                }
                hasil[i][j] = count;
            }

        }
        print(hasil);
    }
    static void print(int [][] array){
        int baris = array.length;
        int kolom = array[0].length;

        for (int i = 0;i < baris;i++){
            System.out.print("|");
            for (int j = 0 ;j <  kolom; j++){
                System.out.print(array[i][j]);
                System.out.print("|");
            }
            System.out.print("\n");
        }

    }
}
