package JavaProModule.JavaAdvanced.StackAndQueuesExercises;

import java.util.*;

public class Robotics_05 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // save all robots in Map -> split them by "-"
        // we have time work -> split the time by ":"
        // we save all products into a Queue !

        String [] robotInput = read.nextLine().split(";"); // --> all robots

        Map<String,Integer> robots = new LinkedHashMap<>();

        for (int index = 0; index <= robotInput.length -1; index++) {
            String [] robotInfo = robotInput[index].split("-");
            String robotName = robotInfo[0];
            int time = Integer.parseInt(robotInfo[1]);
            robots.put(robotName,time);
        }

        Deque<String> products = new ArrayDeque<>(/*Queue*/);
        String [] time = read.nextLine().split(":");
        int hours = Integer.parseInt(time[0]);
        int min = Integer.parseInt(time[1]);
        int sec = Integer.parseInt(time[2]);

        long timeInSeconds = hours * 3600 + min * 60 + sec;

        int [] robotWorkingTime = new int[robots.size()];
        StringBuilder current = new StringBuilder();

        String command = read.nextLine();
        while (!command.equals("End")){
            products.offer(command);
            command = read.nextLine();
        }
        while (!products.isEmpty()){
            current = new StringBuilder(products.poll());
            timeInSeconds ++;
            boolean isFree = false;
            for (int robotIndex = 0; robotIndex <= robotWorkingTime.length -1; robotIndex++) {
                if (robotWorkingTime[robotIndex] > 0){
                    robotWorkingTime[robotIndex]--;
                }
            }
            for (int robot = 0; robot <= robotWorkingTime.length -1; robot++) {
                if (robotWorkingTime[robot] == 0){
                    int robotCounter = 0;
                    for (Map.Entry<String, Integer> robotEntry : robots.entrySet()) {
                        if (robotCounter == robot){
                            robotWorkingTime[robot] = robotEntry.getValue();
                            long h = timeInSeconds / 3600;
                            long minutes = timeInSeconds % 3600 / 60;
                            long seconds = timeInSeconds % 60;
                            System.out.printf("%s - %s [%02d:%02d:%02d]%n",robotEntry.getKey(),current
                            ,h,minutes,seconds);
                            isFree = true;
                            break;
                        }
                        robotCounter ++;
                    }
                    break;
                }
            }
            if (!isFree){
                products.offer(current.toString());
            }
        }

    }
}
