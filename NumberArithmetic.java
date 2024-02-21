// MUNIKOUSICKUMARREDDYT-23MIS7091


import java.util.Scanner;

public class NumberArithmetic {
    private int number;

    public NumberArithmetic(int number) {
        this.number = number;
    }

     public int factorial() {
        int fact = 1;
        for (int i = 2; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    public int fibonacci() {
        if (number <= 1) {
            return number;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }

    private int fibonacci(int n) { // Helper method for recursion
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public boolean isPrime() {
        if (number <= 1) return false;
        for (long i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public long digitSum() {
        long sum = 0, n = number;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();

        NumberArithmetic numArithmetic = new NumberArithmetic(inputNumber);
        System.out.println("Factorial of " + inputNumber + ": " + numArithmetic.factorial());
        System.out.println("Fibonacci number at position " + inputNumber + ": " + numArithmetic.fibonacci());
        System.out.println(inputNumber + " is Prime: " + numArithmetic.isPrime());
        System.out.println("Sum of digits of " + inputNumber + ": " + numArithmetic.digitSum());

       
    }
}
