import java.util.ArrayList;
class Queue {
    public static void main(String[] args) {
        ArrayList<Integer> queue=new ArrayList<>();
        push(1,queue);
        push(2,queue);
        push(3,queue);
        printQueue(queue);
        System.out.println(top(queue));
        push(10,queue);
        printQueue(queue);
        System.out.println(isEmpty(queue));
        pop(queue);
        printQueue(queue);
        pop(queue);
        printQueue(queue);
        System.out.println(isEmpty(queue));
        System.out.println(top(queue));
        pop(queue);
        pop(queue);
        System.out.println(isEmpty(queue));
        System.out.println(top(queue));
    }   
    public static boolean isEmpty(ArrayList<Integer> queue)
    {
        return queue.size()==0;
    }
    public static int top(ArrayList<Integer> queue)
    {
        if(queue.size()==0)
            return -1;
        else
            return queue.get(0);
    }
    public static void pop(ArrayList<Integer> queue)
    {
        if(queue.size()==0)
            System.out.println("Queue is empty");
        System.out.println("Removed value is: "+queue.remove(0));
    }
    public static void push(int ele,ArrayList<Integer> queue)
    {
        queue.add(ele);
    }
    public static void printQueue(ArrayList<Integer> queue)
    {
        for(int e:queue)
        {
            System.out.print(e+" ");
        }
        System.out.println();
    } 
}
