import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    try{
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(x/y);
    }
    catch(ArithmeticException e1)
    {
        System.out.println("java.lang.ArithmeticException: / by zero");
    }
    catch(InputMismatchException e2)
    {
        System.out.println("java.util.InputMismatchException");
    }
}

}