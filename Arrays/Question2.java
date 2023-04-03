import java.util.*;
class Question2
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
        	int start=0,end=n-1;
        	while(start<end)
        	{
            		int temp=arr[start];
            		arr[start]=arr[end];
            		arr[end]=temp;
            		start+=1;
            		end-=1;
        	}
        	System.out.println("The elements in reverse order:");
        	for(int i=0;i<n;i++)
        		System.out.printf(arr[i]+" ");
		sc.close();
    	}
}