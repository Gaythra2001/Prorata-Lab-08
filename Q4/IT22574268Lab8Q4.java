import java.util.Scanner;

public class IT22574268Lab8Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentsArray = new int[8];

        int count = 0;
        while (count < 8) {
            System.out.print("Enter Student ID for Student " + (count + 1) + ": ");
            int id = scanner.nextInt();

            if (id <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                studentsArray[count] = id;
                count++;
            }
        }

        System.out.println();
        System.out.print("Enter a Student ID to Search: ");
        int searchId = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < 8; i++) {
            if (studentsArray[i] == searchId) {
                found = true;
                break;
            }
        }

        System.out.println();
        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }

        scanner.close();
    }
}