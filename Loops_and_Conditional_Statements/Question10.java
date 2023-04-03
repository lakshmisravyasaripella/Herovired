import java.util.*;
class Question10
{
    	public static void main(String[] args) 
	{
        	Scanner sc=new Scanner(System.in);
        	System.out.print("Sample input : stringName:");
        	String str=sc.next();
        	System.out.print("Starting index :");
        	int start=sc.nextInt();
        	System.out.print("Ending index:");
        	int end=sc.nextInt();
        	System.out.println("Output: subString of "+str+" from "+start+" to "+end+" is: "+str.substring(start, end+1));
        	sc.close();
    	}
}