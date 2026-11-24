import java.util.Scanner;
public class StudentGradeMan {
    public static double getAverage(double gr1, double gr2, double gr3) {
        double avg = (gr1+gr2+gr3)/3;
        return avg;
    }
    public static String getRemarks(double avg) {
        if (avg>= 60) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
    public static void displayResult(double avg) {
        String remarks = getRemarks(avg);
        System.out.printf("Average is: %.2f", avg);
        System.out.println();
        System.out.println("Remarks: " + getRemarks(avg));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input grade 1: ");
        double gr1 = sc.nextDouble();

        System.out.print("Input grade 2: ");
        double gr2 = sc.nextDouble();

        System.out.print("Input grade 3: ");
        double gr3 = sc.nextDouble();
        double avg = getAverage(gr1, gr2, gr3);
        displayResult(avg);
    }
}
