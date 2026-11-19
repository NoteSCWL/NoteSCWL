import java.util.Scanner;
public class LABARRAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int[][][] array = new int[2][3][3];
        for (int sec = 0; sec < array.length; sec++) {
            System.out.println();
            System.out.print("Section " + (sec + 1));
            System.out.println();
            for (int stu = 0; stu < array[sec].length; stu++) {
                System.out.print(" " + "Student " + (stu + 1));
                System.out.println();
                for (int sub = 0; sub < array[sec][stu].length; sub++) {
                    if (sub == 1) {
                        System.out.println("Grade for Java: ");
                        array[sec][stu][sub] = sc.nextInt();
                    } else if (sub == 2) {
                        System.out.println("Grade for Database: ");
                        array[sec][stu][sub] = sc.nextInt();
                    } else {
                        System.out.println("Grade for Networking: ");
                        array[sec][stu][sub] = sc.nextInt();
                    }
                }
            }
        }
        for (int sec = 0; sec < array.length; sec++) {
            double sectiontotal = 0;
            System.out.print("Section " + (sec + 1));
            System.out.println();
            for (int stu = 0; stu < array[sec].length; stu++) {
                double studenttotal = 0;
                System.out.print(" " + "Student " + (stu + 1));
                System.out.println();
                for (int sub = 0; sub < array[sec][stu].length; sub++) {
                    if (sub == 1) {
                        System.out.println("Grade for Java: "+ array[sec][stu][sub] + " ");
                    } else if (sub == 2) {
                        System.out.println("Grade for Database: "+ array[sec][stu][sub] + " ");
                    } else {
                        System.out.println("Grade for Networking: "+ array[sec][stu][sub] + " ");
                    }
                }
                System.out.println();
                studenttotal += array[sec][stu][0] + array[sec][stu][1] + array[sec][stu][2];
                System.out.println("Average for Student " + (stu + 1) + ": " + (studenttotal / 3));
                System.out.println();
            }
            System.out.println("----------------------------------------------------------------------------------------------\n");
            sectiontotal += array[sec][0][0] + array[sec][0][1] + array[sec][0][2] + array[sec][1][0] + array[sec][1][1] + array[sec][1][2] + array[sec][2][0] + array[sec][2][1] + array[sec][2][2];
            System.out.printf("Average for Section " + (sec + 1) + ": %.2f", (sectiontotal / 9));
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------\n");
        }
        sc.close();
    }
}
