package myexercise.model;

import java.util.Scanner;

public class Algorithms {

    public int factorial(int number) {
        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public void findMaxValue(int factorial) {
        int res = 2;
        int fact = factorial;
        while (fact >= 0) {
            res++;
            fact = fact * res;
        }
        res -= 1;
        System.out.println("Max value is: " + res);
    }

    public boolean isPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give an integer number: ");
        int number = Integer.parseInt(scanner.nextLine());

        if (number <= 1)
            return false;

        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public void series() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give an integer number: ");
        int number = Integer.parseInt(scanner.nextLine());

        double sum = 1;
        for (int i = 2; i <= number; i++) {
            sum += (double) 1 / i;
        }
        System.out.format("Sum of the series is: %.3f \n", sum);
    }

    public void digitsCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a long number: ");
        long number = Long.parseLong(scanner.nextLine());

        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        System.out.println("Number of Digits are: " + count);
    }

    public void decimalPart() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a positive float number: ");
        float number = Float.parseFloat(scanner.nextLine());

        String new_number = String.valueOf(number);
        String[] parts = new_number.split("\\.");
        System.out.println("The decimal part is: 0." + parts[1]);

        /*
         Second way to calculate decimal part but prints more digits
         int intPart = (int) number;
         float decPart = number - intPart;
         System.out.print("The decimal part is: " + decPart);
*/
    }
}
