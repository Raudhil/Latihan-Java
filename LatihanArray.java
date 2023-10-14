import java.util.Arrays;

public class LatihanArray{
    public static void main(String[] args) {
        System.out.println("Menjumlahkan array");

        int []array = {12,64,123,25,5};
        int []array2 = {15,23,45,20,12};

        Arrays.sort(array);
        Arrays.sort(array2);

        printArray(array,"Array1");
        printArray(array2,"Array2");

        int[] hasil = hasil(array, array2);

        System.out.println(Arrays.toString(hasil));

    }
    static void printArray(int [] array,String message){
        System.out.println("Array " + message + " adalah: " + Arrays.toString(array) );
    }
    static int [] hasil(int [] array,int[] array2){
        int []hasilArray = new int[array.length];

        for (int i = 0;i < array.length; i++){
            hasilArray[i] = array[i] + array2[i];
        }
        return hasilArray;
    }
}
