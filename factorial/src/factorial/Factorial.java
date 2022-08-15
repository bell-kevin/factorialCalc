package factorial;

import java.util.Scanner;
import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {
        Scanner computerKeyboardInput = new Scanner(System.in);
        long num;
        System.out.println("Enter a non-negative number: ");
        num = computerKeyboardInput.nextInt();
        if (num >= 0) {
            System.out.println(factorial(num));
        }
    }

    private static long factorial(long n) {
        long nF; //n factorail
        if (n == 1 || n == 0) //stopping condition
        {
            nF = 1;
        } else {
            nF = n * factorial(n - 1); //recursive method call
        }
        return nF;
    }
}
