package homeWork;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a value as Integer");
        int n = Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.println("Loop Factorial calculation: of " + n + " is " + CalculateFactorial(n));
        System.out.println("Loop Factorial2 calculation: of " + n + " is " + CalculateFactorial2(n));
        System.out.println("Recursion Factorial calculation: of " + n + " is " + CalculateFactorialRecursion(n));
    }

    private static int CalculateFactorialRecursion(int n) {
        if (n == 1)
            return 1;
        return n * CalculateFactorialRecursion(n - 1);

    }
    private static int CalculateFactorial2(int n){
        int factorial = n;
        for (int i = 1; i < n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    private static int CalculateFactorial(int n) {
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }
}