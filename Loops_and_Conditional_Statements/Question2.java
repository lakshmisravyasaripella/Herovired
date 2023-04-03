import java.util.*;
class Question2
{
    	public static void main(String[] args) 
	{
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter marks obtained:");
        	float marks=sc.nextFloat();
        	System.out.println("Enter total marks:");
        	int total=sc.nextInt();
        	float perc=(marks/total)*100;
        	char grade;
        	float gpa;
        	if(90<=perc && 100>=perc)
		{
            		grade='A';
            		gpa=4;
        	}
        	else if(80<=perc && 89>=perc)
        	{
            		grade='B';
            		gpa=3;
        	}
        	else if(70<=perc && 79>=perc)
        	{
            		grade='C';
            		gpa=2;
        	}
        	else if(60<=perc && 69>=perc)
        	{
            		grade='D';
            		gpa=1;
        	}
        	else
        	{
            		grade='F';
            		gpa=0;
        	}
        	System.out.println("Percentage: "+perc+"%");
        	System.out.println("Grade: "+grade+", GPA: "+gpa);
        	sc.close();
    	}
}