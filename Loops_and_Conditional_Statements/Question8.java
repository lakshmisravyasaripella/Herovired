import java.util.*;
class Question8
{
    	public static void main(String[] args) 
	{
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter three numbers");
        	int n1=sc.nextInt();
        	int n2=sc.nextInt();
        	int n3=sc.nextInt();
        	if(n1>n2 && n2>n3)
        	{
            		if(n2>n3)
            			System.out.println("The Smallest Number:"+n3);
            		else
            			System.out.println("The Smallest Number:"+n2);
			System.out.println("The Largest Number:"+n1);
        	}
        	else if(n2>n3 && n2>n1)
        	{
            		if(n1>n3)
            			System.out.println("The Smallest Number:"+n3);
            		else
            			System.out.println("The Smallest Number:"+n1);
			System.out.println("The Largest Number:"+n2);
        	}
        	else
        	{
            		if(n1>n2)
            			System.out.println("The Smallest Number:"+n2);
            		else
            			System.out.println("The Smallest Number:"+n1);
			System.out.println("The Largest Number:"+n3);
        	}
        	System.out.println("Average of all three numbers:"+(n1+n2+n3)/3);
		sc.close();
    	}
}