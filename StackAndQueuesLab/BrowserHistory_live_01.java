package JavaProModule.JavaAdvanced.StackAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowserHistory_live_01 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String command = read.nextLine();

        Deque<String> browser = new ArrayDeque<>();

        while (!command.equals("Home")) {

            if (!command.equals("back")) {
                browser.push(command);
                System.out.println(browser.peek());
            }
            switch (command){
                case"back":
                    if (browser.size() <= 1) {
                        System.out.println("no previous URLs");

                    }else{
                        browser.pop();
                        System.out.println(browser.peek());
                    }
                    break;
            }


            command = read.nextLine();
        }



    }
}
