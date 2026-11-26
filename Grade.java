import java.util.Scanner;
public class Grade {
    public static void StudentGradeMan(String studNo, String studName, String course, String yearLevel) {
        System.out.println("-------------------------------------------------");
        System.out.printf("Student Number :%s%n", studNo);
        System.out.printf("Student Name   :%s%n", studName);
        System.out.printf("Course         :%s%n", course);
        System.out.printf("Year Level     :%s%n", yearLevel);
        System.out.println("-------------------------------------------------");
    }
    public static double getAverage(double gr1, double gr2, double gr3) {
        double avg = 0;
        avg = (gr1 + gr2 + gr3) / 3;
        return avg;
    }
    public static String getRemarks(double ave) {
        if (ave >= 60) {
            return "Passed";
        } else {
            return "Failed";
        }
    }
    public static String getEquiv(double ave, char choice) {
        String equiv = "";
        switch (Character.toUpperCase(choice)) {
            case 'L':
                if (ave >= 90 && ave <= 100) {
                    equiv = "A";
                } else if (ave >= 83 && ave < 90) {
                    equiv = "B";
                } else if (ave >= 75 && ave < 83) {
                    equiv = "C";
                } else if (ave >= 60 && ave < 75) {
                    equiv = "D";
                } else {
                    equiv = "F";
                }
                break;
            case 'N':
                if (ave >= 96 && ave <= 100) {
                    equiv = "4.00";
                } else if (ave >= 90 && ave < 96) {
                    equiv = "3.50";
                } else if (ave >= 84 && ave < 90) {
                    equiv = "3.00";
                } else if (ave >= 77 && ave < 84) {
                    equiv = "2.50";
                } else if (ave >= 70 && ave < 77) {
                    equiv = "2.00";
                } else {
                    equiv = "1.00";
                }
                break;
            default:
                equiv = "Invalid";
                break;
        }
        return equiv;
    }
    public static void displayResult(double ave, char choice) {
        String remarks = getRemarks(ave);
        String equiv = getEquiv(ave, choice);
        String label = (Character.toUpperCase(choice) == 'N') ? "Numeric Grade is" : "Letter Grade is";
        System.out.printf("Average is     :%.2f%n", ave);
        System.out.printf("%-15s:%s%n", label, equiv);
        System.out.printf("Remarks        :%s%n", remarks);
        System.out.println("-------------------------------------------------");
    }
    public static void main(String args[]) {
        String studNo, studName, course, yearLevel;
        double gr1, gr2, gr3;
        char choice;
        Scanner sc = new Scanner(System.in);
        System.out.print("Student Number : ");
        studNo = sc.nextLine();
        System.out.print("Student Name   : ");
        studName = sc.nextLine();
        System.out.print("Course         : ");
        course = sc.nextLine();
        System.out.print("Year Level     : ");
        yearLevel = sc.nextLine();
        System.out.println("\nEnter Grades:");
        System.out.printf("Grade 1        : ");
        gr1 = sc.nextDouble();
        System.out.printf("Grade 2        : ");
        gr2 = sc.nextDouble();
        System.out.printf("Grade 3        : ");
        gr3 = sc.nextDouble();
        System.out.print("\nDisplay Letter Grade or Numeric Grade[L|N]?");
        choice = sc.next().charAt(0);
        System.out.println();
        StudentGradeMan(studNo, studName, course, yearLevel);
        double average = getAverage(gr1, gr2, gr3);
        displayResult(average, choice);
        sc.close();
    }
}
 