package Exercise_6_1;

import static Exercise_6_1.Exercise_6_1_Calculations.getPentagonalNumber;

public class Exercise_6_1_Main {

    public static void main(String[] args) {

        System.out.println("The firs 100 numbers are:");
        for (int i = 1; i <100 ; i++) {
            System.out.printf("%7d ", getPentagonalNumber(i));
            if (i % 10 == 0)
                System.out.println("");

        }


    }
}
