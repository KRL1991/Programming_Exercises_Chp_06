package Exercise_6_4;

import java.util.Scanner;

import static Exercise_6_4.Exercise_6_4_Calculations.reverse;

public class Exercise_6_4_Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to reverse: ");
        int number = input.nextInt();

        System.out.print("The reversal is " + reverse(number));
    }
}
