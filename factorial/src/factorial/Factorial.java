package factorial;

import java.util.Scanner;
import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {
        Scanner computerKeyboardInput = new Scanner(System.in);
        long num;
        System.out.println("Enter a non-negative number: ");
        num = computerKeyboardInput.nextLong();
        if (num >= 0) {
            System.out.println(factorial(num));
        }
    }

    private static long factorial(long n) {
        long nF; //n factorial
        if (n == 1 || n == 0) //stopping condition
        {
            return 1;
        } else {
            return n * factorial(n - 1); //recursive method call
        }
        return nF;
    }
} //end factorial
