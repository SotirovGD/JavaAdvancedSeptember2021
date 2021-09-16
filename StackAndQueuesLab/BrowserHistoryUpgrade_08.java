package JavaProModule.JavaAdvanced.StackAndQueuesLab;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowserHistoryUpgrade_08 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String command = read.nextLine();
        Deque<String> browser = new ArrayDeque<>(/*Stack*/);
        Deque<String> forwardCommand = new ArrayDeque<>(/*Queue*/);
        StringBuilder current = new StringBuilder();

        while (!command.equals("Home")) {
            switch (command) {
                case "forward":
                    if (forwardCommand.size() < 1) {
                        System.out.println("no next URLs");
                    } else {
                        //current = new StringBuilder(forwardCommand.pop());
                        System.out.println(forwardCommand.peek());
                        browser.push(forwardCommand.pop());// преливам от стек в опашка !!!
                    }
                    break;
                case "back":
                    if (browser.size() < 2) {
                        System.out.println("no previous URLs");
                    } else {
                        //current = new StringBuilder(browser.pop());
                        forwardCommand.addFirst(browser.peek());
                        browser.pop();
                        System.out.println(browser.peek());

                    }


                    break;

                default:
                    browser.push(command);
                    System.out.println(command);
                    forwardCommand.clear();
            }


            command = read.nextLine();
        }


    }
}
