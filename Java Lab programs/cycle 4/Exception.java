import java.util.Scanner;
class Exception
{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        try
        {
            System.out.println("Program to perform divison");
            System.out.print("Enter first number: ");
            int n1 = read.nextInt();
            System.out.print("Enter second number: ");
            int n2 = read.nextInt();
            int n3 = n1/n2;
            System.out.println("result = "+n3);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception occurred");
        }
        finally
        {
            System.out.println("End of operation");
        }
        read.close();
    }
}