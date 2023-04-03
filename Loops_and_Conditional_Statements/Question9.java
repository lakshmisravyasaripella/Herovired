import java.util.*;
class Question9
{
	public static void main(String[] args) 
	{
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter a number:");
		int num=sc.nextInt();
        	if(num<=1)
        		System.out.println(num+ " is Not a Prime number");
        	else
		{
            		int c=1;
            		for(int i=2;i<=(int)Math.sqrt(num);i++)
            		{
                		if(num%i==0)
                		{
                    			c=0;
                    			break;
                		}
            		}
            		if(c==1)
            			System.out.println(num+" is a Prime number");
            		else
            			System.out.println(num+ " is Not a Prime number");
        	}
    	}
}