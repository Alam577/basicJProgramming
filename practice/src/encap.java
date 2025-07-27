class Human
{
  private  int age;
   private String name;

    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void show()
    {
        System.out.println("name :"+getName()+" "+"Age :"+getAge());

    }
}
public class encap {
    public static void main(String[] args) {
        Human hum=new Human();
        hum.setName("alam");
        hum.setAge(22);
        hum.setName("sidd");
        hum.setAge(23);
       // System.out.println("name :"+hum.getName()+" "+"Age :"+hum.getAge());
       hum.show();
    }
    }

