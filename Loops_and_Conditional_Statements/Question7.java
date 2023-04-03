import java.util.*;
class Question7
{
	public static void main(String[] args) 
	{
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter a number:");
        	int num=sc.nextInt();
        	for(int i=0;i<num;i++)
        	{
            		for(int j=0;j<num-i;j++)
            			System.out.printf("* ");
            		System.out.println();
        	}
        	for(int i=1;i<num+1;i++)
        	{
            		for(int j=0;j<i;j++)
            			System.out.printf("* ");
            		System.out.println();
        	}
		sc.close();
    	}
}