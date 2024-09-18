import java.util.Scanner;

public class IT24100516Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalMarks = 0;
        int marks = 0;


        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            marks = input.nextInt();
            totalMarks += marks;  
        }

        double average = totalMarks / 4.0; 

        System.out.println("Average: " + average);

      
        if (average >= 75) {
            System.out.println("Overall Grade is : Distinction");
        } else if (average >= 50) {
            System.out.println("Overall Grade is : Credit");
        } else {
            System.out.println("Overall Grade is : Fail");
        }
    }
}
