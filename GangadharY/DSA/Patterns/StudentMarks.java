import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Enter 1 to continue or 0 to stop:");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Enter student's marks:");
                int marks = scanner.nextInt();

                if (marks >= 90) {
                    System.out.println("This is Good");
                } else if (marks >= 60) {
                    System.out.println("This is also Good");
                } else if (marks >= 0) {
                    System.out.println("This is Good as well");
                }
            }
        } while (choice != 0);

        scanner.close();
    }
}