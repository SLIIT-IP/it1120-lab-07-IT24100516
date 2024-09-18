import java.util.Scanner;

public class IT24100516Lab7Q3 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        for (int customer = 1; customer <= 5; customer++) 
	{
            System.out.println("Customer " + customer);  

            System.out.print("Enter total bill amount: ");
            double billAmount = input.nextDouble();

            System.out.print("Enter payment mode (C for Cash, O for Other): ");
            char paymentMode = input.next().charAt(0);

           
            if (paymentMode == 'C' || paymentMode == 'c') 
	    {
                double discount = billAmount * 0.05; 

                System.out.println("Total bill amount: " + billAmount);

                System.out.println("Discount: " + discount);

                billAmount -= discount;  

            } 
	    else if (paymentMode == 'O' || paymentMode == 'o') 
	    {
                System.out.println("Total bill amount: " + billAmount);

                System.out.println("Discount: 0.0");  
            } 
	    else 
	    {
                System.out.println("Payment Mode is Not Valid");

                System.out.println();

                continue;  
            }


            System.out.println("Final amount to be paid: " + billAmount);

            System.out.println();  
        }
    }
}
