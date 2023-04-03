import java.util.*;
class Question1
{
	public static void main(String[] args) 
	{
        	Scanner sc=new Scanner(System.in);
        	System.out.println("\nEnter all array elements separated by space\n");
        	String ele=sc.nextLine();
        	String elements[]=ele.split(" ");
        	int a[]=new int[elements.length];
        	for(int i=0;i<elements.length;i++)
        		a[i]=Integer.parseInt(elements[i]);
        	int sum=0;
        	int min=Integer.MAX_VALUE;
        	int max=Integer.MIN_VALUE;
        	int len=a.length;
        	for(int i=0;i<len;i++)
        	{
            		sum+=a[i];
            		if(a[i]>max)
                		max=a[i];
            		if(a[i]<min)
                		min=a[i];
        	}
        	System.out.println("The element with the Minimum value :"+min);
        	System.out.println("The element with the Maximum Value :"+max);
        	System.out.println("Average of all array elements : "+(sum/len));
        	System.out.println("Total number of array elements: "+len);
		sc.close();
	}
}