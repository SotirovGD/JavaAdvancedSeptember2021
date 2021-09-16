package JavaProModule.JavaAdvanced.StackAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PrinterQueue_live_05 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String input = read.nextLine();
        Deque<String> printer = new ArrayDeque<>();

        while(!input.equals("print")){

            if (!input.equals("cancel")) {
                printer.offer(input);
            }
            switch (input){
                case "cancel":
                    if (printer.size() < 1) {
                        System.out.println("Printer is on standby");
                    }else{
                        System.out.println("Canceled " + printer.poll());
                    }
                    break;

            }
            input = read.nextLine();
        }
        while (!printer.isEmpty()){
            System.out.println(printer.poll());
        }











    }
}
