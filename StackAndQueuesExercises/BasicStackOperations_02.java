package JavaProModule.JavaAdvanced.StackAndQueuesExercises;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.stream.IntStream;

public class BasicStackOperations_02 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // N --> number of elements to push onto the stack
        // S --> number of elements to pop from the stack
        // X --> check whether is present in the stack

        // "5 2 13" --> command

        Deque<Integer> numbers = new ArrayDeque<>(/*Stack*/);
        String [] input = read.nextLine().split("\\s+");

        int n = Integer.parseInt(input [0]);
        int s = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);

        String [] inputNumbers = read.nextLine().split("\\s+");

        for (int index1 = 0; index1 < n; index1++) {
            numbers.push(Integer.parseInt(inputNumbers[index1]));
        }
        for (int index2 = 0; index2 < s; index2++) {
            numbers.pop();
        }
        if (numbers.contains(x)){
            System.out.println("true");
        }else{
            System.out.println(numbers.stream().mapToInt(e->e).min().orElse(0));// напиши и без стриим
        }




    }
}
