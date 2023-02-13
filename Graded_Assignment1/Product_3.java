import java.util.*;
class Product_3
{
    static Scanner sc=new Scanner(System.in);
    public static void addProducts(ArrayList<String> p,ArrayList<ArrayList<String>> pd,ArrayList<Integer> pc)
    {
        System.out.println("Enter product name");
        String pn=sc.next();
        p.add(pn);
        System.out.println("Enter product quantity");
        int pq=sc.nextInt();
        System.out.println("Enter specifications");
        sc.nextLine();
        String sp=sc.nextLine();
        System.out.println("Enter cost");
        String c=sc.next();
        ArrayList<String> a=new ArrayList<>();
        a.add(sp);
        a.add(c);
        a.add(Integer.toString(pq));
        pd.add(a);
        pc.add(pq);
    }
    public static void viewProductList(ArrayList<String> p,ArrayList<ArrayList<String>> pd,ArrayList<Integer> pc)
    {
        for(int i=0;i<p.size();i++)
        {
            System.out.print(p.get(i)+"  ");
            String d="";
            for(int j=0;j<pd.get(i).size();j++)
                d+=pd.get(i).get(j)+" ";
            System.out.print(d);
            System.out.println();
        }
    }
    public static void productCount(ArrayList<String> p,ArrayList<Integer> pc)
    {
        System.out.println("Enter product name to get count");
        String name=sc.next();
        int k=p.indexOf(name);
        System.out.println(p.get(k)+" "+pc.get(k));
    }
    public static void editProduct(ArrayList<String> p,ArrayList<ArrayList<String>> pd,ArrayList<Integer> pc)
    {
        System.out.println("Enter productname to edit details");
        String pn=sc.next();
        int k=p.indexOf(pn);
        System.out.println("Enter product quantity");
        int pq=sc.nextInt();
        System.out.println("Enter Specifications");
        sc.nextLine();
        String sp=sc.nextLine();
        System.out.println("Enter Cost");
        String c=sc.next();
        ArrayList<String> a=new ArrayList<>();
        a.add(sp);
        a.add(c);
        a.add(Integer.toString(pq));
        pd.set(k, a);
        pc.set(k,pq);
    }
    public static void updateInventory(ArrayList<String> p,ArrayList<ArrayList<String>> pd,ArrayList<Integer> pc)
    {
        System.out.println("Enter 1 to add and 2 to delete product quantity");
        int choice=sc.nextInt();
        if(choice==1)
        {
            System.out.println("Enter product name");
            String pn=sc.next();
            System.out.println("Enter no of items to be added");
            int n=sc.nextInt();
            int i=p.indexOf(pn);
            pc.set(i,pc.get(i)+n);
            int m=pc.get(i);
            pd.get(i).set(2,Integer.toString(m));
        }
        else
        {
            System.out.println("Enter product name");
            String pn=sc.next();
            System.out.println("Enter no of items to be removed");
            int n=sc.nextInt();
            int i=p.indexOf(pn);
            pc.set(i,pc.get(i)-n);
            int m=pc.get(i);
            pd.get(i).set(2,Integer.toString(m));
        }
    }
    public static void main(String[] args) 
    {
        ArrayList<String> p=new ArrayList<>();
        ArrayList<ArrayList<String>> pd=new ArrayList<>();
        ArrayList<Integer> pc=new ArrayList<>();
        System.out.println("Enter number of items to be added");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
            addProducts(p,pd,pc);
        viewProductList(p,pd,pc); 
        productCount(p, pc);
        editProduct(p,pd,pc);
        viewProductList(p,pd,pc);
        updateInventory(p,pd,pc);
        viewProductList(p,pd,pc);
    } 
}
