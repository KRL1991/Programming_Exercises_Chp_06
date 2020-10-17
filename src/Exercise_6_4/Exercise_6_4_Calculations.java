package Exercise_6_4;

public class Exercise_6_4_Calculations {

    public static int reverse (int number ) {

        int reverse = 0;
        int digit;

        do {
            digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        } while (number != 0);

        return reverse;
    }

    }


