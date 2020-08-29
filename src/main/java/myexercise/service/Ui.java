package myexercise.service;

import myexercise.model.Algorithms;
import myexercise.model.ArrayExercises;
import myexercise.model.PasswordGenerator;
import myexercise.model.StackVersion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ui {
    public void Menu() {
        System.out.println("Simple algorithms");
        System.out.println("-----------------");
        System.out.println("1. Calculate the factorial of a number\n" +
                "2. Check if a number is prime\n" +
                "3. Calculate the value 1 + ½ + ⅓ + … + 1/n\n" +
                "4. Count the digits of a long number\n" +
                "5. Print the decimal part of a float number\n");

        System.out.println("Exercises on arrays, collections");
        System.out.println("--------------------------------");
        System.out.println("6. Sub list with the prime numbers\n" +
                "7. List without duplicate values\n" +
                "8. Digits of a number in descending order\n" +
                "9. My own version of a stack\n" +
                "10. Reverse a string using a stack\n" +
                "11. Check if a word is symmetric\n");

        System.out.println("String class exercise");
        System.out.println("---------------------");
        System.out.println("12. Generate a Password");

        do {
            getOption();
        } while (wantContinue());
    }

    private void getOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a number from menu 1-12: ");
        int number = Integer.parseInt(scanner.nextLine());
        while (number < 1 || number > 12) {
            System.out.print("Please enter a valid number: ");
            number = Integer.parseInt(scanner.nextLine());
        }
        selectOption(number);
    }

    private boolean wantContinue() {
        System.out.print("\nDo you want to try another option? (y/Y=yes) ");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        return response.equals("y") || response.equals("Y");
    }

    private void selectOption(int number) {
        if (number == 1) {
            Algorithms algorithms = new Algorithms();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Give an integer number: ");
            int input = Integer.parseInt(scanner.nextLine());
            System.out.println("Factorial of " + input + " is: " + algorithms.factorial(input));

            algorithms.findMaxValue(algorithms.factorial(input));
        } else if (number == 2) {
            Algorithms algorithms = new Algorithms();
            if (algorithms.isPrime())
                System.out.println("The number is Prime");
            else
                System.out.println("The number isn't Prime");
        } else if (number == 3) {
            Algorithms algorithms = new Algorithms();
            algorithms.series();
        } else if (number == 4) {
            Algorithms algorithms = new Algorithms();
            algorithms.digitsCount();
        } else if (number == 5) {
            Algorithms algorithms = new Algorithms();
            algorithms.decimalPart();
        } else if (number == 6) {
            ArrayExercises arrayExercises = new ArrayExercises();
            List<Integer> numbersArr = new ArrayList<>(Arrays.asList(1, 3, 2, 4, 7, 10, 5, 16, 13));
            System.out.println(arrayExercises.listOfPrime(numbersArr));
        } else if (number == 7) {
            ArrayExercises arrayExercises = new ArrayExercises();
            List<Object> duplicates = new ArrayList<>(Arrays.asList(1, 2, "a", 1, "b", "a"));
            arrayExercises.eliminateDuplicates(duplicates);
        } else if (number == 8) {
            ArrayExercises arrayExercises = new ArrayExercises();
            arrayExercises.descendingDig();
        } else if (number == 9) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Give the integer size of stack: ");
            int stack_size = Integer.parseInt(scanner.nextLine());
            StackVersion stackVersion = new StackVersion(stack_size);
            int response;
            System.out.println("Please select\n1. Push\n2. Pop\n3. peek\n4. Exit");
            do {
                response = Integer.parseInt(scanner.nextLine());
                if (response == 1) {
                    System.out.print("Give the integer number to push: ");
                    stackVersion.push(Integer.parseInt(scanner.nextLine()));
                } else if (response == 2) {
                    stackVersion.pop();
                } else if (response == 3) {
                    System.out.println("Peek element is: " + stackVersion.peek());
                } else if (response > 4 || response < 1){
                    System.out.println("Not valid option");
                }
            } while (response != 4);
            stackVersion.printStack();
        } else if (number == 10) {
            ArrayExercises arrayExercises = new ArrayExercises();
            arrayExercises.reverseStack();
        } else if (number == 11) {
            ArrayExercises arrayExercises = new ArrayExercises();
            if (arrayExercises.isSymmetric())
                System.out.println("The word is symmetric");
            else
                System.out.println("The word isn't symmetric");
        } else if (number == 12) {
            PasswordGenerator passwordGenerator = new PasswordGenerator();
            passwordGenerator.PasswordChecker();
        }
    }
}
