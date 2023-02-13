import java.util.Scanner;
class Missing_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,a[];
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        if(a[0]!=1)
            System.out.print(1+" ");
        for(int i=0;i<n-1;i++)
        {
            if(a[i+1]-a[i]>1)
            {
                int diff=a[i+1]-a[i];
                int j=1;
                while(j<diff)
                {
                    System.out.print(a[i]+j+" ");
                    j++;
                }
            }
        }
        sc.close();
    }
}
