package Exercise_6_2;

import java.util.Scanner;

import static Exercise_6_2.Exercise_6_2_Calculations.sumDigits;

public class Exercise_6_2_Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an integer to sum");

        long n = input.nextInt();

        System.out.println("The sum is " + Exercise_6_2_Calculations.sumDigits(n));




    }
}
