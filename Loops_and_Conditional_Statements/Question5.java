import java.util.*;
class Question5
{
	public static void main(String[] args) 
    	{
        	Scanner sc=new Scanner(System.in);
        	char ch;
        	while(true)
        	{
            		System.out.println("\nMenu based app - Unit conversion for Distance\n1.CM to M\n2.M to KM\n3.KM to M\n4.M to CM");
            		System.out.print("Enter your menu - ");
            		int i=sc.nextInt();
            		System.out.print("Please enter the CM Value: ");
            		double value=sc.nextDouble();
            		if(i==1)
                		System.out.printf("%d CM = %.2f M\n",(int)value,(value/100));
            		else if(i==2)
                		System.out.printf("%.2f M = %.2f KM\n",value,(value/1000));
            		else if(i==3)
                		System.out.printf("%.2f KM = .%2f M\n",value,(value*1000));
            		else if(i==4)
                		System.out.printf("%.2f M = %.2f CM\n",value,(value*100));
            		else
                		System.out.println("Invalid Choice");
            		System.out.print("Do you want to Continue:");
            		ch=sc.next().charAt(0);
            		if(ch!='y' && ch!='Y')
            			break;
        	}
        	sc.close();
	}
}