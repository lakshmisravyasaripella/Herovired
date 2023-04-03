import java.util.*;
class Question6
{
	public static void main(String[] args) 
    	{
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter number of elements in Array-A");
        	int n1=sc.nextInt();
        	HashMap<Integer,Integer> hm=new HashMap<>();
        	int a[]=new int[n1];
        	for(int i=0;i<n1;i++)
        	{
            		a[i]=sc.nextInt();
            		if(hm.containsKey(a[i]))
            			hm.put(a[i],hm.get(a[i])+1);
            		else
            			hm.put(a[i],1);
        	}
        	System.out.println("Enter number of elements in Array-B");
        	int n2=sc.nextInt();
        	int b[]=new int[n2];
       		for(int i=0;i<n2;i++)
        	{
            		b[i]=sc.nextInt();
            		if(hm.containsKey(b[i]))
            		System.out.println("Frequency of "+b[i]+" is "+hm.get(b[i]));
        	}
		sc.close();
    	}
}