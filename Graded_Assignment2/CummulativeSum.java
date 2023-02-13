import java.util.Scanner;
class CummulativeSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,a[];
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int p[]=new int[n];
        p[0]=a[0];
        for(int i=1;i<n;i++)
        {
            p[i]=p[i-1]+a[i];
        }
        for(int i=0;i<n;i++)
            System.out.print(p[i]+" ");
        sc.close();
    }
}
