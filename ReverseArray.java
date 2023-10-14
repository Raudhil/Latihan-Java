import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Making a reverse Array");

        int [] array = {5,4,1,6,3,7,2,9};

        Arrays.sort(array);

        read(array);

        reverse(array);


    }
    static void reverse(int[] array){
        int [] array2 = new int[array.length];

        for (int i = 0; i < array2.length;i++){
            array2[i] = array[array.length - i - 1];
        }
        System.out.println(Arrays.toString(array2));
    }

    static void read(int[] array){
        System.out.println("The Array is: "  + Arrays.toString(array));
    }
}
