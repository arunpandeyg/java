package homeWork;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("For Loop solution...");

        String text;
        //for(int i = 100; i >= 1; i--){
        for(int i = 1; i <= 100; i++) {
            if(i % 15 ==0)
                text = "FizzBuzz";
            else if(i % 3 == 0)
                text = "Fizz";
            else if(i % 5 == 0)
                text = "Buzz";
            else
                text = Integer.toHexString(i);
            System.out.println(text);
            System.out.println("Recursive Solution");
            RecursiveSolution(100);
        }
    }
    private static void RecursiveSolution(int n) {
        String text = "";
        if(n < 1)
            return;
        if(n % 15 ==0)
            text = "FizzBuzz";
        else if(n % 3 == 0)
            text = "Fizz";
        else if(n % 5 == 0)
            text = "Buzz";
        else
            text = Integer.toHexString(n);
        System.out.println(text);
        RecursiveSolution(n -1);
    }
}
