import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class LatihanException {
    public static void main(String[] args) {
        int [] array = {0,1,2,3};

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka - ");
        int a = sc.nextInt();


        //Cara pertama untuk exception
        try{
            System.out.printf("Hasil dari %d adalah %d\n",a,array[a]);
        } catch (Exception e) {
            System.err.println("Input diluar array\n");
        }finally {
            System.out.println("Program Selanjutnya");
        }
        //Cara kedua untuk exception menggunakan fungsi

        int hasil = data(array,a);
        System.out.println(hasil);

        //Cara ketiga untuk exception menggunakan fungsi dan throws exception
        try {
            System.out.println(data2(array,a));
        } catch (Exception e){
            System.err.println("Array Out of Bound");
        }
    }

    static int data2(int[] array, int index) throws Exception{
        int hasil = array[index];
        return hasil;
    }
    static int data(int[] array,int index){
        int hasil = 0;
        try {
            hasil = array[index];
        } catch (Exception e){
            System.err.println("Array Out of Bound");
        }
        return hasil;
    }
}
