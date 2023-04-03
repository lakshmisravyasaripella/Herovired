import java.util.*;
class Question5
{
	public static void main(String[] args) 
    	{
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter number of elements:");
        	int n=sc.nextInt();
        	int arr[]=new int[n];
		System.out.println("Enter array elements:");
        	for(int i=0;i<n;i++)
        		arr[i]=sc.nextInt();
        	int j=0;
        	for(int i=0;i<n;i++)
        	{
            		if(arr[i]!=1)
            			arr[j++]=arr[i];
        	}
        	for(int i=j;i<n;i++)
        		arr[i]=1;
        	System.out.println("Array elements after moving Ones to end:");
        	for(int i=0;i<n;i++)
        		System.out.print(arr[i]+" ");
		sc.close();
	}
}