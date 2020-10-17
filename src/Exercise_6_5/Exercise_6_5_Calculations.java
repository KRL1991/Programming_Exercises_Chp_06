package Exercise_6_5;

public class Exercise_6_5_Calculations {

    public static void displaySortedNumbers (double num1, double num2, double num3) {

            if (num3 < num2) {
                double temp = num2;
                num2 = num3;
                num3 = temp;
            }

            if (num2 < num1) {
                double temp = num1;
                num1 = num2;
                num2 = temp;
            }

            if (num3 < num2) {
                double temp = num2;
                num2 = num3;
                num3 = temp;
            }

            System.out.println("The numbers in decreasing order is " + num3 + " "
                    + num2 + " " + num1);

        }


    }


