// Java Program to Find the Biggest of 3 Numbers

// Importing generic Classes/Files
import java.util.Scanner;

class GFG {

    // Function to find the biggest of three numbers
    static int biggestOfThree(int x, int y, int z)
    {

        // Comparing all 3 numbers
        if (x >= y && x >= z)

            // Returning 1st number if largest
            return x;

        // Comparing 2nd no with 1st and 3rd no
        else if (y >= x && y >= z)

            // Return z if the above conditions are false
            return y;

        else

            // Returning 3rd no, Its sure it is greatest
            return z;
    }

    // Main driver function
    public static void main(String[] args)
    {
        int largest;
        Scanner sc=new Scanner(System.in);

        // Considering random integers three numbers
       int a=sc.nextInt();
          int b=sc.nextInt();

                    int c=sc.nextInt();

       
        // Calling the function in main() body
        largest = biggestOfThree(a, b, c);

        // Printing the largest number
        System.out.println(largest
                           + " is the largest number.");
                           sc.close();
    }
}