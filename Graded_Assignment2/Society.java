import java.util.*;
import java.io.*;
class ResidentialSociety
{	
	String societyname,location,secretaryname;
	ResidentialSociety(String societyname,String location,String secretaryname)
    {
		this.societyname = societyname;
		this.location = location;
		this.secretaryname = secretaryname ;
	}
	void viewDetailsSociety() 
    {
    	System.out.println("Society Name : "+this.societyname + " | Location : " + this.location + " | Secretary Name : "+ this.secretaryname);
    }
}
class Building extends ResidentialSociety 
{
		String buildingname;
		int totalNumberOfApartments;
		Building(String buildingname,int totalNumberOfApartments,String societyname,String location,String secretaryname) 
        {
			super( societyname, location, secretaryname);	
			this.buildingname = buildingname;
			this.totalNumberOfApartments = totalNumberOfApartments;
		}
		void viewDetailsBuilding() 
        {
	    	System.out.println("Building Name : "+this.buildingname + " | Total Number of Apartments : " + this.totalNumberOfApartments);
	    }
}
class Apartment extends Building
{
    int apartmentnumber;
    String ownername;
    String electricMeterNumber;
    Apartment(int apartmentnumber, String ownername, String electricMeterNumber,String buildingname,int totalNumberOfApartments,String societyname,String location,String secretaryname)
    {
    	super( buildingname, totalNumberOfApartments, societyname, location, secretaryname);
    	this.apartmentnumber = apartmentnumber;
    	this.ownername = ownername;
    	this.electricMeterNumber = electricMeterNumber;
    }
    void viewDetails() 
    {
    	System.out.println("Apartment Number : "+this.apartmentnumber + " | Owner Name : " + this.ownername+" | Electric Meter Number : "+this.electricMeterNumber);
    }
}
public class Society
{
	public static void main(String[] args) throws Exception   
    {
		String filePath = "Sample.csv";
		List<String[]> li = read(filePath);
		Apartment a1[] = new Apartment[10];
    	Apartment a2[] = new Apartment[10];
    	Apartment a3[] = new Apartment[10];
    	int i = 0, j = 0, k =0 ;
    	for(String[] ele:li) 
        {
    		if(ele[1].compareTo("A")== 0) 
            {
    			a1[i] = new Apartment(Integer.parseInt(ele[0]),ele[2],ele[3],ele[1],10,"Galaxy-Apartment Residential Society"," Banjara Hills, Hyderabad","Ajay_Keelu_1");
    					i++;
    		}
            else if(ele[1].compareTo("B") == 0) 
            {
    			a2[j] = new Apartment(Integer.parseInt(ele[0]),ele[2],ele[3],ele[1],10,"Galaxy-Apartment Residential Society"," Banjara Hills, Hyderabad","Ajay_Keelu_2");
				j++;
    		}
            else 
            {
    			a3[k] = new Apartment(Integer.parseInt(ele[0]),ele[2],ele[3],ele[1],10,"Galaxy-Apartment Residential Society"," Banjara Hills, Hyderabad","Ajay_Keelu_3");
				k++;
    		}
    	}
    	int t;
    	System.out.println("Apartment Details \n");
    	for(t = 0 ; t < i ; t++)
    		a1[t].viewDetails();
    	for(t = 0 ; t < j ; t++)
    		a2[t].viewDetails();
    	for(t = 0 ; t < k ; t++)
    		a3[t].viewDetails();
    	System.out.println();
    	System.out.println("Building Details \n");
    	for(t = 0 ; t < i ; t++)
    		a1[t].viewDetailsBuilding();
    	for(t = 0 ; t < j ; t++)
    		a2[t].viewDetailsBuilding();
    	for(t = 0 ; t < k ; t++)
    		a3[t].viewDetailsBuilding();
    	System.out.println();
    	System.out.println("Society Details \n");
    	for(t = 0 ; t < i ; t++)
    		a1[t].viewDetailsSociety();
    	for(t = 0 ; t < j ; t++)
    		a2[t].viewDetailsSociety();
    	for(t = 0 ; t < k ; t++)
    		a3[t].viewDetailsSociety();
    	System.out.println();
	}
	public static List<String[]> read(String csvFile)
    {
		List<String[]> lis = new ArrayList<>();
		try 
        {
	         File file = new File(csvFile);
	         FileReader fr = new FileReader(file);
	         BufferedReader bf = new BufferedReader(fr);
	         String line = "";
	         String[] tempArr;
	         while((line = bf.readLine()) != null) 
             {
	            tempArr = line.split(",");
	            lis.add(tempArr);
	         }
	         bf.close();
	         } 
             catch(IOException ioe) 
             {
	            
	         }
		return lis;
	}
}