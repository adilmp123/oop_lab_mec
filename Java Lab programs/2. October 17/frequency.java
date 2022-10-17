import java.util.Scanner;
class frequency	
{
    public static void main(String[] args)
    {
    	Scanner read = new Scanner(System.in);
    	System.out.print("Enter a string: ");
    	String str = read.next();
        System.out.print("Enter the charcter to be searched: ");
        char c = read.next().charAt(0);
        int i=0,count=0;
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)==c)
                count++;
        }
        System.out.println("frequency of " + c +" = " + count);
    }
	
}
