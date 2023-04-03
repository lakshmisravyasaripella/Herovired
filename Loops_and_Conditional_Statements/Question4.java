import java.util.*;
class Question4
{
	public static void main(String[] args) 
    	{
        	Scanner sc=new Scanner(System.in);
        	char ch;
        	while(true)
		{
            		System.out.println("Menu based app-Even/Odd Checker");
            		System.out.print("Please enter the number: ");
            		int n=sc.nextInt();
            		if(n%2==0)
            			System.out.println("The given number - "+n+" is an EVEN Number");
            		else
            			System.out.println("The given number - "+n+" is a ODD number");
            		System.out.print("Do you want to continue: ");
            		ch=sc.next().charAt(0);
            		if(ch!='Y' && ch!='y')
            			break;
        	} 
		sc.close();     
    	}
}