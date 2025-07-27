import java.util.Scanner;

public class toggleString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();

         StringBuilder res=new StringBuilder("");

         for (int i = 0; i <str.length(); i++) {
            char ch =str.charAt(i);
            if(ch>='A'&& ch<='Z')
            {
                res.append(Character.toLowerCase(ch));
                
            }
            else if(ch>='a'&& ch<='z')
            {
               res.append(Character.toUpperCase(ch));
            }
            else
                res.append(ch);


         }
         System.out.println(res);
    }
}
