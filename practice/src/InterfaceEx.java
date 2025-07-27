interface computer {

    void code();
}

class Laptop implements computer
{
    public void code()
    {
        System.out.println("coding code in laptop : ");

    }

}
class Desktop implements computer
{
   public void code()
    {
        System.out.println("coding in desktop :");
    }
    
}
class Developer
{
    public void devApp(computer cmp)
    {
        cmp.code();
    }
}

public class InterfaceEx {
    public static void main(String[] args) {

        computer lap=new Laptop();
        computer desk= new Desktop();

        desk.code();
        lap.code();

    }
}
