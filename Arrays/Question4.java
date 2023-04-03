import java.util.*;
class Question4
{
	public static boolean isPrime(int n)
    	{
        	if(n<=1)
        		return false;
        	for(int i=2;i<=(int)Math.sqrt(n);i++)
        	{
            		if(n%i==0)
            			return false;
        	}
        	return true;
    	}
    	public static void main(String[] args) 
    	{
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter number of elements in array:");
        	int n=sc.nextInt();   
        	int arr[]=new int[n];
		System.out.println("Enter array elements:");
        	for(int i=0;i<n;i++)
        		arr[i]=sc.nextInt();
        	Arrays.sort(arr);
        	int found=1;
        	for(int i=n-1;i>=0;i--)
        	{
            		if(isPrime(arr[i]))
            		{
                		System.out.println("The Largest Prime number in given array:"+arr[i]);
                		found=0;
                		break;
            		}
        	}
        	if(found==1)
        		System.out.println("No prime numbers are present in the given array");
		sc.close();
    	}
}