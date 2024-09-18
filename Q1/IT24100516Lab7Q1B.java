import java.util.Scanner;

public class IT24100516Lab7Q1B 
{
    public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);

        for (int student = 1; student <= 3; student++)
	{
           
            System.out.print("Student " + student + "\n");
	    
	    System.out.print("Enter the marks for 4 subjects(type them in the same line keeping a space between each mark): ");
            int subject1 = input.nextInt();
            int subject2 = input.nextInt();
            int subject3 = input.nextInt();
            int subject4 = input.nextInt();

            
	    
            double average = (subject1 + subject2 + subject3 + subject4) / 4.0;
            System.out.println("Average is : " + average);

            
            if (average >= 75) 
	    {
                System.out.println("Overall Grade is : Distinction");
            } 
	    else if (average >= 50) 
	    {
                System.out.println("Overall Grade is : Credit");
            }
	    else {  System.out.println("Overall Grade is : Fail");  }

            System.out.println("  ");  
        }
    }
}
