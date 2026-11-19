// Make class and import scanner
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String repeat;
        do {
        int[][] matrix = new int[3][3];
        for (int r = 0; r < matrix.length; r++) {
            for ( int c = 0; c < matrix[r].length; c++) {
                System.out.print("Enter a number for [" + r + "][" + c + "]: ");
                matrix[r][c] = sc.nextInt();
            }
        }
        int[] csum = new int[3];
        System.out.println("                 Array              \n                                    Row Sum");
        for (int r = 0; r < matrix.length; r++) {
            int rsum = 0;
            for ( int c = 0; c < matrix[r].length; c++) {
                rsum += matrix[r][c];
                csum[c] += matrix[r][c];
                System.out.printf("%10d", matrix[r][c]);
            }
            System.out.printf("%10d", rsum);
            System.out.println();
        }
        System.out.println();
            System.out.printf("%12s", "Column sum:");
            System.out.println();
            for (int c = 0; c < 3; c++) {
                System.out.printf("%10d", csum[c]);
            }
            System.out.println("\n======================================================");
            int diagsum1 = 0, diagsum2 = 0;
            for (int i = 0; i < 3; i++) {
                diagsum1 += matrix[i][i];
                diagsum2 += matrix[i][2 - i];
            }
            System.out.println("Diagonal Sum 1: " + diagsum1 + "\nDiagonal Sum 2: " + diagsum2);
        System.out.print("\nTry Again [Y|N]: ");
                repeat = sc.next();
        } while (repeat.equalsIgnoreCase("y") &&
                !repeat.equalsIgnoreCase("n"));
     sc.close();
    }
}