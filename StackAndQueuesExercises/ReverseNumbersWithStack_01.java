package JavaProModule.JavaAdvanced.StackAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersWithStack_01 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);


        ArrayDeque <String> numbers = new ArrayDeque<>();

        Arrays.stream(read.nextLine().split("\\s+")).forEach(numbers :: push);

        numbers.forEach(n -> System.out.print(n + " "));





    }
}
