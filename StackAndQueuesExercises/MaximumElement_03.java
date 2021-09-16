package JavaProModule.JavaAdvanced.StackAndQueuesExercises;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MaximumElement_03 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // "1 X" - Push the element X into the stack.
        // "2" - Delete the element present at the top of the stack.
        // "3" - Print the maximum element in the stack.


        Deque<Integer> numbers = new ArrayDeque<>(/*Stack*/);

        int cycle = Integer.parseInt(read.nextLine());

        while (cycle > 0){
        String [] input = read.nextLine().split("\\s+");
            int command = Integer.parseInt(input[0]);

            switch (command){
                case 1 :
                    int numToAdd = Integer.parseInt(input[1]);
                    numbers.push(numToAdd);
                    break;
                case 2 :
                    numbers.pop();
                    break;
                case 3:
                    System.out.println(numbers.stream().mapToInt( e -> e ).max().getAsInt());
                    break;
            }

            cycle -- ;
        }





    }
}
