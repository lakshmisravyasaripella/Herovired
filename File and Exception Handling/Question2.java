import java.io.FileReader;
import java.util.*;
class Question2
{
    	public static void main(String[] args) 
	{
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter file name with path:");
        	String f=sc.nextLine();
        	try
		{
            		FileReader fr=new FileReader(f);
            		int i,count=0;
            		while((i = fr.read())!=-1)
            		{
            			count+=1;
            		}
            		System.out.println(count);
        	}
        	catch(Exception e)
		{
        		e.printStackTrace();
        	}
    	}
}