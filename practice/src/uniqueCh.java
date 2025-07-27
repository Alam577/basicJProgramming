import java.util.Scanner;
import java.util.TreeSet;

public class uniqueCh {

    public static void main(String[] args) {
        TreeSet<Character> uniq=new TreeSet<>();
        
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("The input is "+str);

        for(int i=0;i<str.length();i++)
        {
            str.toLowerCase();
            char ch=str.charAt(i);

            if(uniq.contains(ch)==true)
            {
                uniq.remove(ch);
            }
            else
            {
                uniq.add(ch);
            }
        }
        for(Character ch:uniq)
        {
            System.out.print(ch+" ");
        }
        sc.close();
        
    }
}