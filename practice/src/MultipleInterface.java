
interface A {
    void showA();
}
interface B {

    void ShowB();
}
class MultiInter implements A,B{
   public void showA()
    {
        System.out.println("implented Show A successfully!!!");
    }
    public void ShowB()
    {
        System.out.println("implented Show B successfully!!!");
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        MultiInter m1= new MultiInter();
        m1.showA();
        m1.ShowB();
    }
}
