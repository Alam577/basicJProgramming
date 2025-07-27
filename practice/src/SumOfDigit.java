import java.util.Scanner;

public class SumOfDigit{

    public static int count(int num)
    {
        int sum=0;
        while(num!=0)
        {
            int sumOfDigit=num%10;//get the last digit
            sum+=sumOfDigit;//add the digit 
            num=num/10;//remove the last digit
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(count(num));
        sc.close();
    }
}