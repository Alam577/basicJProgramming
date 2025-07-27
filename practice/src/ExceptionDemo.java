public class ExceptionDemo {
    public static void main(String[] args) {
                    int a = 467;
            int b = 0;
        try {
            int res = a / b;  // This will throw ArithmeticException
            System.out.println(res);
        } catch (Exception e) {
            System.out.println("cannt divided by zero ");
            System.out.println("Exception caught: " + e);
        }
        System.out.println(a+b);
    }
}
