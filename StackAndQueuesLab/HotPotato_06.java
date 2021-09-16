package JavaProModule.JavaAdvanced.StackAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class HotPotato_06 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String [] children = read.nextLine().split("\\s+");

        Deque<String> players = new ArrayDeque<>(); // queue !
        Collections.addAll(players,children);

        int loop = Integer.parseInt(read.nextLine());
        /*for (String child : children) {
            players.offer(child);
        }*/

        while (players.size() > 1){
            for (int index = 1; index < loop; index++) {
                players.offer(players.poll());
            }
                System.out.println("Removed " + players.poll());
        }
            System.out.println("Last is " + players.poll());






    }
}
