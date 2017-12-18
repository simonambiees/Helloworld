import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        /*
        a
        a
        a
        a+2
        a+2+2
        a+2+2+2
        a+2+2+2+(2+2)
        a+2+2+2+2+2+(2+2)
        a+2+2+2+2+2+2+2+((2+2)+2)
                 */
        System.out.println("This program is designed to calculate the number of rabbits in a certain month.\nThere are initially 2 rabbits.\nThese rabbits start to give birth to two more rabbits 3 months after their birth.\nThe newly born rabbits will also repeat the process.");
        System.out.println("Input a month number that you want to calculate:");
        Scanner input = new Scanner(System.in);
        int numberOfMonth = input.nextInt();
        int numberOfLoops;
        int numberOfRabbits = 2;
        ArrayList<Integer> rabbits = new ArrayList<Integer>();
        rabbits.add(0);
        rabbits.add(2);
        rabbits.add(2);
        rabbits.add(2);
        for (int month = 3; month < 100; month++) {
            numberOfLoops = ((month - (month % 3)) / 3);
            numberOfRabbits = numberOfRabbits + numberOfLoops*2;
            //System.out.println(numberOfRabbits);
            rabbits.add(numberOfRabbits);

        }
        System.out.println("Number of rabbits in month "+numberOfMonth+" is "+rabbits.get(numberOfMonth)+".");
        //System.out.println();
        System.out.println("Solved!");

    }
}
