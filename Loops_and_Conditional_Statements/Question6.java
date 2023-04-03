import java.util.*;
class Question6
{
	public static void main(String[] args) 
    	{
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter a number:");
        	int n=sc.nextInt();
        	int count=1;
        	for(int i=0;i<n;i++)
        	{
            		for(int j=0;j<count;j++)
            			System.out.printf("* ");
            		System.out.println();
            		if(i!=n-1)
            			count+=2;
        	}
        	count-=2;
        	for(int i=0;i<n-1;i++)
        	{
            		for(int j=0;j<count;j++)
            			System.out.printf("* ");
            		System.out.println();
            		count-=2;
        	}
    	}
}