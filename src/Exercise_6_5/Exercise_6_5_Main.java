package Exercise_6_5;

import java.sql.SQLOutput;
import java.util.Scanner;

import static Exercise_6_5.Exercise_6_5_Calculations.displaySortedNumbers;

public class Exercise_6_5_Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter numbers to sort: ");

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();



        displaySortedNumbers( (int)num1, (int)num2, (int)num3);
    }
}
