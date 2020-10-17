package Exercise_6_6;

import java.util.Scanner;

import static Exercise_6_6.Exercise_6_6_Calculations.displayPattern;

public class Exercise_6_6_Main {

    public static void main(String[] args) {

        System.out.print("Enter the number of lines: ");
        Scanner input = new Scanner(System.in);

        // get the total number of lines n.
        int n = input.nextInt();
        displayPattern(n);
    }
}
