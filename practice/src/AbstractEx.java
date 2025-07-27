abstract class car
{
    String name="GWagon";
    abstract void drive();
    abstract void  changeGear();

}
class mercedes extends car{
    void drive()
    {
        System.out.println("Driving a : "+name);
    }
    void changeGear()
    {
        System.out.println("Changing a gear");
    }

}
public class AbstractEx {
    public static void main(String[] args) {
        mercedes mr=new mercedes();
        mr.drive();
        mr.changeGear();
        
    }

}
