package JavaProModule.JavaAdvanced.StackAndQueuesExercises;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BalancedParentheses_06 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // (  {  and [ --> possible parenthesis --> {[()]} <- This is a balanced parenthesis.

        String input = read.nextLine();
        Deque<Character> openBrackets = new ArrayDeque<>(/*Stack*/);
        //Deque<Character> closedBrackets = new ArrayDeque<>(/*Queue*/);

        boolean areSame = true;


        for (int index = 0; index < input.length(); index++) {
            char current = input.charAt(index);

            if (current == '{' || current == '[' || current == '(') {
                openBrackets.push(current);
            } else if (current == '}' || current == ']' || current == ')'){
                if (openBrackets.isEmpty()){
                    areSame = false;
                    break;
                }
                char open = openBrackets.pop();
                if (open != '{' && current == '}'){
                    areSame = false;
                }else if (open != '[' && current == ']'){
                    areSame = false;
                }else if (open != '(' && current == ')'){
                    areSame = false;
                }
            }
        }

        System.out.println(areSame ? "YES" : "NO");

    }

}


