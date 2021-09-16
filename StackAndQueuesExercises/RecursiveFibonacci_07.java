package JavaProModule.JavaAdvanced.StackAndQueuesExercises;

import java.util.Scanner;

public class RecursiveFibonacci_07 {
    public static long [] fibonacciArray;
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = Integer.parseInt(read.nextLine());
        fibonacciArray = new long[number + 1];
        System.out.println(fib(number));

    }
    public static long fib (int number){
        if (number <= 1){
            return 1;
        }
        if (fibonacciArray [number] != 0){
            return fibonacciArray [number];
        }else{
            return fibonacciArray[number] = fib(number - 1) + fib(number - 2);
        }
    }
}
