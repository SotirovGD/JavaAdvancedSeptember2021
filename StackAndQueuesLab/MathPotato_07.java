package JavaProModule.JavaAdvanced.StackAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class MathPotato_07 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String[] children = read.nextLine().split("\\s+");
        Deque<String> players = new ArrayDeque<>();
        Collections.addAll(players, children);
        int loop = Integer.parseInt(read.nextLine());

        int cycle = 1;
        boolean isPrime = false;


        while (players.size() > 1) {

            for (int index = 1; index < loop; index++) {
                players.offer(players.poll());
            for (int i = 2; i <= cycle / 2; i++) {
                if (cycle % i == 0) {
                    isPrime = true;
                }
            }

            if (isPrime) {
                System.out.println("Prime" + players.peek());
            } else {

                System.out.println("Removed " + players.poll());
            }


                isPrime = false;
            cycle++;
            }
        }
            System.out.println("Last is " + players.poll());


    }
}
