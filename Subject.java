import java.util.Scanner;

public class Subject {
    int subjectMarks;
    int credits;
    int grade;
}

class Student {
    String name;
    String usn;
    double SGPA;
    Scanner s;
    Subject subject[];

    public Student() {
        s = new Scanner(System.in);
        subject = new Subject[8];
        for (int i = 0; i < 8; i++) {
            subject[i] = new Subject();
        }
    }

    public void getStudentDetails() {
        System.out.print("Enter Student Name: ");
        name = s.nextLine();
        System.out.print("Enter USN: ");
        usn = s.nextLine();
    }

    public void getMarks() {
        System.out.println("Enter marks and credits for 8 subjects:");
        for (int i = 0; i < 8; i++) {
            System.out.println("Subject " + (i + 1) + ":");
            System.out.print("Enter marks (0-100): ");
            subject[i].subjectMarks = s.nextInt();
            System.out.print("Enter credits: ");
            subject[i].credits = s.nextInt();

            
            s.nextLine();

            if (subject[i].subjectMarks < 0 || subject[i].subjectMarks > 100) {
                System.out.println("Invalid marks entered. Marks should be between 0 and 100.");
                subject[i].grade = 0;
            } else if (subject[i].subjectMarks < 40) {
                subject[i].grade = 0;
            } else {
                subject[i].grade = (subject[i].subjectMarks / 10) + 1;
                if (subject[i].grade == 11) {
                    subject[i].grade = 10;
                }
            }
        }
    }

    public void computeSGPA() {
        int effectiveScore = 0;
        int totalCredits = 0;

        for (int i = 0; i < 8; i++) {
            effectiveScore += (subject[i].grade * subject[i].credits);
            totalCredits += subject[i].credits;
        }

        if (totalCredits > 0) {
            SGPA = (double) effectiveScore / (double) totalCredits;
        } else {
            SGPA = 0.0;
        }
    }

    public void displayResult() {
        System.out.println("\nStudent Result");
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        System.out.printf("SGPA: %.2f\n", SGPA);
    }
}

class Calculatesgpa {
    public static void main(String[] args) {
        int numberOfStudents = 2; 
        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            students[i] = new Student();
            students[i].getStudentDetails();
            students[i].getMarks();
            students[i].computeSGPA();
        }

        System.out.println("\n--- Results ---");
        for (int i = 0; i < numberOfStudents; i++) {
            students[i].displayResult();
        }
    }
}
