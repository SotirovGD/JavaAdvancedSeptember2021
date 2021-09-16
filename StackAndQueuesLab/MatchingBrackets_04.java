package JavaProModule.JavaAdvanced.StackAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets_04 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // 1 + (2 - (2 + 3) * 4 / (3 + 1)) * 5
        String expression = read.nextLine();
        ArrayDeque <Integer> stack = new ArrayDeque<>();
        StringBuilder output = new StringBuilder();

        for (int index = 0; index < expression.length(); index++) {
            char bracket = expression.charAt(index);
            if (bracket == '('){
                stack.push(index);
            }else if (bracket == ')'){
                int startIndex = stack.pop();
                int endIndex = index +1;
                 output = new StringBuilder(expression.substring(startIndex,endIndex));

                System.out.println(output.toString());
            }
        }







    }
}
