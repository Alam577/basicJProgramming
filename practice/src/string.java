class mobile
{
    String name;
    int price;
    static String brand ="OnePlus";
    public mobile()
    {
        System.out.println(brand);
    }

    public void show(mobile obj)
    {
        System.out.println( obj.name+" "+obj.price+" :");
    }
}
public class string {
    public static void main(String[] args) {
    mobile obj=new mobile();
    obj.name="12 R";
    obj.price=35000;

    mobile obj1=new mobile();
    obj1.name="nord 5";
    obj1.price=50000;
    obj.show(obj);
    obj.show(obj1);
   
    }
}
