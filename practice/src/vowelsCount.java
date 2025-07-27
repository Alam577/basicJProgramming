import java.util.Scanner;

public class vowelsCount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        int volCon=0;
        int consoCon=0;
                            int specialchar = 0;

        
        for(int i=0;i<str.length();i++)
        {
             char ch=str.charAt(i);
             str=str.toLowerCase();
             if(Character.isLetter(ch))
             {
                  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                 {
                    System.out.print(volCon);
                     volCon++;
                }
                else
                {
                    System.out.print(consoCon);
                      consoCon++;
                   
                }
                     consoCon++;
             }else
                {
                    specialchar++;
                }
        }   
        System.out.println("Vowels :"+volCon);  
        System.out.println(" "+"Consonents : "+consoCon);
        System.out.println("Speacial :"+specialchar);
        sc.close();
    }
}
