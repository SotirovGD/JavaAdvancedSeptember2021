package JavaProModule.JavaAdvanced.StackAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SimpleTextEditor_08 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int loop = Integer.parseInt(read.nextLine());
        StringBuilder text = new StringBuilder();
        Deque<String> textInStack = new ArrayDeque<>();

        for (int index = 0; index < loop; index++) {
            String [] input = read.nextLine().split("\\s+");
            int command = Integer.parseInt(input[0]);

            switch (command){
                case 1 : // --> append

                    String toAppend = input[1];
                    textInStack.push(text.toString());
                    text.append(toAppend);

                    break;
                case 2: // --> deletes

                    textInStack.push(text.toString());
                    int elementToDelete = Integer.parseInt(input[1]);
                    text.delete(0,elementToDelete);


                    break;
                case 3: // --> show element;  info :  print only the third command !!!

                    int toShow = Integer.parseInt(input[1]);
                    System.out.println(text.toString().charAt(toShow -1));

                    break;
                case 4:
                    text = new StringBuilder(textInStack.pop());
                    break;
            }



        }






    }
}







