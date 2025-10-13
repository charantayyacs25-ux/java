import java.util.Scanner;

class Player2 {
    String name, usn;
    int n;
    double[] marks;
    double sgpa;

    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = sc.next();

        System.out.print("Enter USN: ");
        usn = sc.next();

        System.out.print("Enter score of subject: ");
        n = sc.nextInt();

        marks = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter score  " + (i + 1) + ": ");
            marks[i] = sc.nextDouble();
        }
    }

    void calc() {
        sgpa = 0;
        for (int i = 0; i < n; i++) {
            sgpa += marks[i];
        }
        sgpa = sgpa / n; // average
    }

    void display() {
        System.out.println("\n----------- RESULT -----------");
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        System.out.print("Scores: ");
        for (int i = 0; i < n; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println("\nAverage Score (SGPA): " + sgpa);
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int num = sc.nextInt();

        Player2[] obj = new Player2[num];

        for (int i = 0; i < num; i++) {
            System.out.println("\nEnter details for student " + (i + 1));
            obj[i] = new Player2();
            obj[i].accept();
            obj[i].calc();
        }

        System.out.println("\n===== student RESULTS =====");
        for (int i = 0; i < num; i++) {
            obj[i].display();
        }
    }
}
