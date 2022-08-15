package factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner computerKeyboardInput = new Scanner(System.in);
        int num;
        System.out.println("Enter a non-negative number: ");
        num = computerKeyboardInput.nextInt();
        if (num >= 0) {
            System.out.println(factorial(num));
        }
    }

    private static int factorial(int n) {
        int nF; //n factorail
        if (n == 1 || n == 0) {
            nF = 1;
        } else {
            nF = n * factorial(n - 1);
        }
        return nF;
    }
}