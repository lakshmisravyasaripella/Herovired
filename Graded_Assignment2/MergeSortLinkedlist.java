import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}
class MergeSortLinkedlist
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size and elements of first linked list");
        int n1=sc.nextInt();
        Node h1=null,t1=null;
        Node h2=null,t2=null;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n1;i++)
        {
            int d=sc.nextInt();
            Node nn=new Node(d);
            al.add(nn.data);
            if(h1==null)
            {
                h1=nn;
                t1=nn;
            }
            else
            {
                t1.next=nn;
                t1=nn;
            }
        }
        System.out.println("Enter size and elements of second linked list");
        int n2=sc.nextInt();
        for(int i=0;i<n2;i++)
        {
            int d=sc.nextInt();
            Node m=new Node(d);
            al.add(m.data);
            if(h2==null)
            {
                h2=m;
                t2=m;
            }
            else
            {
                t2.next=m;
                t2=m;
            }
        }
        Collections.sort(al);
        Node res=null,ta=null;
        for(int i: al)
        {
            Node m=new Node(i);
            if(res==null)
            {
                res=m;
                ta=m;
            }
            else
            {
                ta.next=m;
                ta=m;
            }
        }
        while(res!=null)
        {
            System.out.print(res.data+" ");
            res=res.next;
        }
        sc.close();
    }
}
