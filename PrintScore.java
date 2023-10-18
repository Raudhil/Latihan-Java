import java.util.Scanner;

public class PrintScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] lesson = {"MTK","BINDO","BINGGRIS"};

        System.out.print("Input student total: ");
        int a = sc.nextInt();
        int [][] student = new int[a][3];
        String [] studentName = new String[a];

        for (int i = 0; i < student.length;i++){
            System.out.print("Input Name: ");
            String name = sc.next();
            studentName[i] =  name;
            for (int j = 0;j < student[i].length;j++){
                System.out.print("Input  " + lesson[j] + " score: ");
                int score = sc.nextInt();
                student[i][j] = score;
            }
        }
        for (int g = 0;g < student.length; g++){
            System.out.println("\n" + studentName[g] + " Has a Score: ");
            for (int h = 0; h < student[g].length;h++){
                System.out.println(lesson[h] + " = " + student[g][h]);

            }
        }
    }
}
