 class Basic {

    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public int sub(int n1,int n2)
    {
        return n1-n2;
    }   
}
 class AdvCal extends Basic{

    public int multi(int n1,int n2)
    {
        return n1*n2;
    }
    public int Div(int n1,int n2)
    {
        return n1/n2;
    }   
}
public class AdvanceCal {

    public static void main(String[] args) {
        AdvCal cal=new AdvCal();
        int r1=cal.add(5, 8);
        int r2=cal.Div(5, 8);
        int r3=cal.multi(5, 8);
        int r4=cal.sub(5, 8);

        System.out.println(r1);/* */
                System.out.println(r2);/* */
        System.out.println(r3);/* */
        System.out.println(r4);/* */

        System.out.println("hellop");
    }
}