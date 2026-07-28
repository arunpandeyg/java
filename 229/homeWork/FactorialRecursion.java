package homeWork;

import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a value as Integer");
        int n = Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.println("Recursion Factorial calculation: of " + n + " is " + CalculateFactorialRecursion(n));

    }
    private static int CalculateFactorialRecursion(int n) {
        if (n == 1)
            return 1;
        return n * CalculateFactorialRecursion(n  -1);

    }
}
