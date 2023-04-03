import java.util.*;
class Question3
{
	public static void reverse(int arr[])
    	{
        	int start=0,end=arr.length-1;
        	while(start<end)
        	{
            		int temp=arr[start];
            		arr[start]=arr[end];
            		arr[end]=temp;
            		start+=1;
            		end-=1;
        	}
    	}
	public static void main(String[] args) 
	{
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter no. of elements:");
        	int n=sc.nextInt();
        	int arr[]=new int[n];
		System.out.println("Enter array elements:");
        	for(int i=0;i<n;i++)
        		arr[i]=sc.nextInt();
        	for(int i=0;i<n;i++)
        	{
            		for(int j=0;j<n-i-1;j++)
            		{
                		if(arr[j]>arr[j+1])
                		{
                    			int temp=arr[j];
                    			arr[j]=arr[j+1];
                    			arr[j+1]=temp;
                		}
            		}
        	}
        	System.out.println("The elements in ascending order");
        	for(int i=0;i<n;i++)
        		System.out.print(arr[i]+" ");
        	System.out.println();
        	reverse(arr);
        	System.out.println("The elements in descending order");
        	for(int i=0;i<n;i++)
        		System.out.print(arr[i]+" ");
		sc.close();
    	}
}