package JavaProModule.JavaAdvanced.StackAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SimpleCalculator_02 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String [] input = read.nextLine().split("\\s+");
        ArrayDeque<String> numbers = new ArrayDeque<>();
        Collections.addAll(numbers,input);


        while (numbers.size() > 1) {
            int digit1 = Integer.parseInt(numbers.pop());// вадя ги и приемам числото в променливата
            String sign = numbers.pop(); // вадя знака и го приемам в променливата
            int digit2 = Integer.parseInt(numbers.pop()); // вадя ги и приемам числото в променливата

            switch(sign){
                case "+":
                    numbers.push(String.valueOf(digit1 + digit2)); // приетите в променливите числа ги събирам и ги вкарвам като резултат в numbers !

                    break;
                case "-":
                    numbers.push(String.valueOf(digit1 - digit2)); // приетите в променливите числа ги изваждам и ги вкарвам като резултат в numbers !
                    break;

            }
        }
        System.out.println(numbers.pop()); // вадя сбора от числата и ги принтирам


    }
}
