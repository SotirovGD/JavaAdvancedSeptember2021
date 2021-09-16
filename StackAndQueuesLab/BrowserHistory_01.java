package JavaProModule.JavaAdvanced.StackAndQueuesLab;
// 100/100
import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory_01 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String input = read.nextLine();

        ArrayDeque<String> browser = new ArrayDeque<>();



        while (!input.equals("Home")){
            if (!input.equals("back")) {
                browser.push(input);
                System.out.println(browser.peek());
            }else{
                if (browser.size() <= 1) {
                    System.out.println("no previous URLs");
                }else{
                    browser.pop();
                    System.out.println(browser.peek());
                }
            }

            input = read.nextLine();
        }







    }
}
