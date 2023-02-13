import java.util.*;
class Unique
{
	public static ArrayList<Integer> isUnique(int arr[])
    	{
        	ArrayList<Integer> a=new ArrayList<>();
        	Arrays.sort(arr);
        	for(int i=0;i<arr.length-1;i++)
        	{
            		if(arr[i]!=arr[i+1])
            			a.add(arr[i]);
        	}
        	a.add(arr[arr.length-1]);
        	return a;
    	}
    	public static void main(String[] args) 
	{
        	Scanner sc=new Scanner(System.in);
        	int n=sc.nextInt();
        	int arr[]=new int[n];
        	for(int i=0;i<n;i++)
        		arr[i]=sc.nextInt();
        	System.out.println(isUnique(arr));
        	sc.close();
    	}
}
