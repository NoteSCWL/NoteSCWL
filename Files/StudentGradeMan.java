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
        System.out.printf("Average is: %.2f", avg);
        System.out.println();
        System.out.println("Remarks: " + getRemarks(avg));
    }
    public static void studInfo(int studentNumber, String name, int yearLevel, String course) {
        System.out.println();
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Student Name: " + name);
        System.out.println("Student Year Level: " + yearLevel);
        System.out.println("Student Course: " + course);
    }
    public static void getEquiv(double avg, char choice) {
        switch(choice) {
            case 'L' : case 'l' : {
                if (avg >=90) {
                    System.out.println("Letter grade is: A");
                }  else if (avg >= 80) {
                    System.out.println("Letter grade is: B");
                }  else if (avg >= 70) {
                    System.out.println("Letter grade is: C");
                }  else if (avg >= 60) {
                    System.out.println("Letter grade is: D");
                } else {
                    System.out.println("Letter grade is: F");
                }
            } break;
            case 'N' : case 'n' : {
                if (avg >= 96 && avg <= 100) {
                    System.out.println("Numeric grade is: 4.0");
                } else if (avg >= 90 && avg < 96) {
                    System.out.println("Numeric grade is: 3.5");
                } else if (avg >= 84 && avg < 90) {
                    System.out.println("Numeric grade is: 3.0");
                } else if (avg >= 77 && avg < 84) {
                    System.out.println("Numeric grade is: 2.5");
                } else if (avg >= 70 && avg < 77) {
                    System.out.println("Numeric grade is: 2.0");
                } else {
                    System.out.println("Numeric grade is: 1.0");
                }
            } break;
            default: {
                System.out.println("Invalid choice");
            } break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Student Number: ");
        int sn = sc.nextInt();
        sc.nextLine();
        System.out.println("Input Student Name: ");
        String name = sc.nextLine();
        System.out.println("Input Student Year Level: ");
        int yl = sc.nextInt();
        sc.nextLine();
        System.out.println("Input Student Course: ");
        String course = sc.nextLine();

        System.out.println("----------------------------------STUDENT INFO--------------------------------");
        System.out.println("------------------------------------------------------------------------------");
        studInfo(sn, name, yl, course);
        System.out.println("------------------------------------------------------------------------------");
        System.out.print("Input grade 1: ");
        double gr1 = sc.nextDouble();

        System.out.print("Input grade 2: ");
        double gr2 = sc.nextDouble();

        System.out.print("Input grade 3: ");
        double gr3 = sc.nextDouble();
        System.out.println("------------------------------------------------------------------------------");
        System.out.print("Input choice (L for Letter Grade, N for Numeric Grade): ");
        char choice = sc.next().charAt(0);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(sn + " " + course + " " + yl);
        System.out.println(name);
        System.out.println("------------------------------------------------------------------------------");
        double avg = getAverage(gr1, gr2, gr3);
        displayResult(avg);
        getEquiv(getAverage(gr1, gr2, gr3), choice);
        
        sc.close();
    } 
}
