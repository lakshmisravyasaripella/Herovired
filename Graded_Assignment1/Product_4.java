import java.util.*;
class Store
{
	double cost;
	int count;
	String specification;
	String productname;
	Store(String name,String specif,double cost,int count)
    	{
		this.cost = cost;
		this.count = count;
		this.productname = name;
		this.specification = specif;
	}
	public int productCount() 
    	{
		return this.count;
	}
	public void productDetails() 
    	{
		System.out.println("Product name : "+this.productname);
		System.out.println("Product Specification : "+this.specification);
		System.out.println("Product cost : "+this.cost);
		System.out.println("Product count : "+this.count);
		System.out.println();
	}
	public void editOrUpdate(String spec) 
    	{
		this.specification = spec;
	}
	public void editProductName(String name) 
    	{
		this.productname = name;
	}
	public String getProduct() 
    	{
		return this.productname;
	}
	public void editOrUpdate(int count) 
    	{
		this.count = count;
	}
	public void editOrUpdate(double cost) 
    	{
		this.cost = cost;
	}
}
public class Product_4 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
    	{
		System.out.println("No. of products\n ");
		int n = sc.nextInt();
		sc.nextLine();
		List<Store>list = new ArrayList<Store>();
		System.out.println("Note : Enter details of product with name in one line seperared with spaces \n");
		for(int i = 0 ; i < n ; i++) 
        	{
			System.out.println("Enter product name,  specification,  cost,  count : \n");
			String t = sc.nextLine();
			String a[] = t.split(" ");
			String name = a[0];
			String spec = a[1];
			double cost = Double.parseDouble(a[2]);
			int count = Integer.parseInt(a[3]);
			Store s = new Store(name,spec,cost,count);
			list.add(s);
			System.out.println();
		}
		boolean flag = true;
		while(flag != false) 
        	{
			System.out.println("------------X------------");
			System.out.println("	1.Product List  ");
			System.out.println("	2.Product Count ");
			System.out.println("	3.Product Details ");
			System.out.println("	4.Edit Product Details ");
			System.out.println("	5.Update Inventory ");
			System.out.println("	6.Exit");
			System.out.println("	Enter your choice ");
			int choice = sc.nextInt();
			if(choice == 1) 
            		{
				productList(list);
			}
            		else if(choice == 2) 
            		{
				productcount(list);
	    		}
            		else if(choice == 3) 
            		{
				productdetails(list);
			}
            		else if(choice == 4) 
            		{
				editproduct(list);
			}
        	    	else if(choice == 5) 
            		{
				updateInventory(list);
			}
            		else if(choice  == 6) 
            		{
				flag = false;
			}
            		else 
            		{
			    System.out.println("Enter your choice");
			}
		}
		sc.close();
	}
	public static void editproduct(List<Store> list) 
    	{
		System.out.println("Enter product name : ");
		sc.nextLine();
		String pname = sc.nextLine();
		for(Store p: list) 
		{
			if(p.getProduct().compareToIgnoreCase(pname) == 0) 
            		{
				System.out.println("What do you want to edit :\n1.Specification\n2.Cost\n3.Product Count");
				int ch = sc.nextInt();
				if(ch == 1) 
                		{
					System.out.println("Enter product specification ");
					sc.nextLine();
					String st = sc.nextLine();
					p.editOrUpdate(st);
				}
				else if(ch == 2) 
                		{
					System.out.println("Enter product cost ");
					double cost = sc.nextDouble();
					p.editOrUpdate(cost);
				}
				else 
                		{
					System.out.println("\nEnter product count ");
					int count = sc.nextInt();
					p.editOrUpdate(count);
				}
				return;
			}
            		System.out.println();
		}
		System.out.println("\nProduct not found");
	}
	public static void productdetails(List<Store> list) 
    	{
		System.out.println("\nEnter product name : ");
		sc.nextLine();
		String pname = sc.nextLine();
		for(Store p: list) 
        	{
			if(p.getProduct().compareToIgnoreCase(pname) == 0) 
            		{
				p.productDetails();
				return;
			}
		}
		System.out.println("\nProduct not found");
        	System.out.println();
	}
	public static void productcount(List<Store> list) 
    	{
		System.out.print("\nEnter product name : ");
		sc.nextLine();
		String pname = sc.nextLine();
		boolean f = false;
		for(Store p: list) 
        	{
			if((p.getProduct()).compareToIgnoreCase(pname) == 0) 
            		{
				System.out.println("count of "+p.getProduct() + " is "+p.productCount());
				f = true;
				break;
			}
		}
		if(!f)
		System.out.println("Product not found");
	}
	public static void productList(List<Store> list) 
    	{
		if(list.size() == 0) 
        	{
			System.out.println("Empty ... ");
			return;
		}
		int i = 1 ;
		for(Store p:list)
			System.out.println((i++) + " " +p.getProduct());
		System.out.println();
	}
	public static void updateInventory(List<Store> list) 
    	{
		System.out.println("-----------------------");
		System.out.println("1. Add poduct");
		System.out.println("2. Delete product");
		System.out.println("Enter your choice");
        	System.out.println();
		sc.nextLine();
		int n = sc.nextInt();
		if(n == 1) 
        	{
			System.out.println("Enter ProductName,Specification,Cost,Count : ");
			sc.nextLine();
			String t = sc.nextLine();
			String []arr = t.split(" ");
			String name = arr[0];
			String spec = arr[1];
			double cost = Double.parseDouble(arr[2]);
			int count = Integer.parseInt(arr[3]);
			Store p1 = new Store(name,spec,cost,count);
			list.add(p1);
		}
        	else 
        	{
			System.out.println("Enter name to delete product : ");
			sc.nextLine();
			String pname = sc.nextLine();
			int i = 0;
			for(Store p: list) 
            		{
				if((p.getProduct()).compareToIgnoreCase(pname) == 0) 
                		{
					break;
				}
				i++;
			}
			if(i == list.size())
				System.out.println("Product not found");
			else 
            		{
				list.remove(i);
				System.out.println("Product removed successfully");
			}
		}
	}
}
