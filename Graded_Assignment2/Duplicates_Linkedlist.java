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
class Duplicates_Linkedlist
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of linked list");
        int n=sc.nextInt();
        Node h=null,t=null;
        for(int i=0;i<n;i++)
        {
            int d=sc.nextInt();
            Node m=new Node(d);
            if(h==null)
            {
                h=m;
                t=m;
            }
            else{
                t.next=m;
                t=t.next;
            }
        }
        Node res=null,ta=null;
        ArrayList<Integer> al=new ArrayList<>();
        while(h!=null)
        {
            if(!al.contains(h.data))
            {
                al.add(h.data);
                Node m=new Node(h.data);
                if(res==null)
                {
                    res=m;
                    ta=m;
                }
                else{
                    ta.next=m;
                    ta=m;
                }
            }
            h=h.next;
        }
        while(res!=null)
        {
            System.out.print(res.data+" ");
            res=res.next;
        }
        sc.close();
    }
}