import java.util.Scanner;

public class fibbon {

    public static void fib(int n)
    {

        if(n<1)
        {
            System.out.println("Invalid input ");
        }
        if(n==1)
        {
            return;
        }else
        { 
            int n1=0;
            int n2=1;
            for(int i=2;i<=n;i++)
            {
                int res=n1+n2;
                System.out.print( " "+res);
                n1=n2;
                n2=res;

                
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       fib(n);
       sc.close();
      
    }
}