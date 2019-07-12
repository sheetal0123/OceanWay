package interview;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;


/**
 *  Ask number of input count from user and as per given data print their binary form
 *  
 *  1st user input : 3
 *  2nd user input : 10  20  30
 *  
 *  No print binary form of 10,20,30
 *
 */
public class BinaryPrint {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numberOfTc = sc.nextInt();
        Queue<Integer> tcData = new PriorityQueue<>();
        for (int i = 1; i <= numberOfTc; i++) {
            int data = sc.nextInt();
            tcData.add(data);
        }
        for(Integer i : tcData){
            printTheBinaryNumbers(i);
        }

    }

    public static void printTheBinaryNumbers(int number){
        for (int i = 1; i <= number; i++) {
            System.out.print(Integer.toBinaryString(i) +" ");
        }
        System.out.println();
    }
}
