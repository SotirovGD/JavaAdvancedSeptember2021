package JavaProModule.JavaAdvanced.StackAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PrinterQueue_05 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String command = read.nextLine();
        Deque <String> printer = new ArrayDeque<>();

        while (!command.equals("print")){
            if (!command.equals("cancel")){
                printer.offer(command);
            }else{
                if (printer.isEmpty()){
                    System.out.println("Printer is on standby");
                }else{
                    System.out.println("Canceled " + printer.poll());
                }
            }
            command = read.nextLine();
        }
        while (!printer.isEmpty()){
            System.out.println(printer.poll());
        }







    }
}
