package Exercise_6_2;

public class Exercise_6_2_Calculations {

    public static int sumDigits( long n ) {

        int sum = 0;
        do {
            sum += n % 10;

        } while ((n = n / 10) != 0);

        return sum;

    }


    }

