package JavaProModule.JavaAdvanced.StackAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class SimpleCalculator_live_02 {
    public static void main(String[] args) {
        // read input split by \\s+
        // init. Deque number in Stack
        // add input to variable using : Collections.addAll(var,input);
        // using for loop parse digit1 , take sign , parse digit2

        Scanner read = new Scanner(System.in);
        String[] input = read.nextLine().split("\\s+");
        Deque<String> characters = new ArrayDeque<>(); // stack

        Collections.addAll(characters, input);

        while (characters.size() > 1) {



            int firstDigit = Integer.parseInt(characters.pop());
            String sign = characters.pop();
            int secondDigit = Integer.parseInt(characters.pop());

            switch (sign) {
                case "+":
                    characters.push(String.valueOf(firstDigit + secondDigit));
                    break;
                case "-":
                    characters.push(String.valueOf(firstDigit - secondDigit));
                    break;
            }


        }
        System.out.println(characters.pop());


    }
}
