package JavaProModule.JavaAdvanced.StackAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Date;
import java.util.Deque;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        new Date(); // ----> probe
        Date start = new Date();

        String input = read.nextLine();
        Deque<String> names = new ArrayDeque<>();

       while (!input.equals("end")){
           names.addFirst(input);
           input = read.nextLine();
       }
        names.clear();
        System.out.println("error");
        Date end = new Date();
        System.out.println(end.getTime() - start.getTime());
    }
}
