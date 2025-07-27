class Bank
{
    public double deposite(double money)
    {
         money=50000;
        return money;
    }

    public double CheckBal(double balance)
    {
        balance=150000;
        return balance;
    }   
}
class ATM extends Bank{
    public void InsertCard()
    {
        System.out.println("Enter a pin ");
    }
    
}

public class inheritence {
    public static void main(String[] args) {
        
        ATM obj=new ATM();
        obj.InsertCard();
        System.out.println(obj.deposite(0));
        System.out.println(obj.CheckBal(0));

    }
}
