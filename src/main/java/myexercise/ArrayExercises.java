package myexercise;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class ArrayExercises {

    public List<Integer> listOfPrime(List<Integer> numbersArr) {
        List<Integer> primeArr = new ArrayList<>();
        boolean isPrime = true;

        for (int number : numbersArr) {
            if (number <= 1)
                isPrime = false;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                primeArr.add(number);
            isPrime = true;
        }
        return primeArr;
    }


    public void eliminateDuplicates() {
        List<Object> duplicates = new ArrayList<>(Arrays.asList(1, 2, "a", 1, "b", "a"));
//        List<Object> noDuplicates = new ArrayList<>();
//
//        for (Object duplicate : duplicates) {
//            if (!noDuplicates.contains(duplicate))
//                noDuplicates.add(duplicate);
//        }

        Set<Object> hashSet = new LinkedHashSet<>(duplicates);
        ArrayList<Object> noDuplicates = new ArrayList<>(hashSet);
        System.out.println(noDuplicates);
    }


    public void descendingDig() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int input = Integer.parseInt(scanner.nextLine());

        List<Integer> numbers = new LinkedList<>();

        for (int i = input; i > 0; i /= 10)
            numbers.add(i % 10);

        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);

//        String input = scanner.nextLine();
//        ArrayList<Character> digits = new ArrayList<>();
//        for (int i = 0; i< input.length(); i++)
//            digits.add(input.charAt(i));
//
//        digits.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    public void reverseStack() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++)
            stack.push(input.charAt(i));

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop());

        System.out.println("The reversed String using stack is: " + sb.toString());

    }

    public boolean isSymmetric() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String input_string = input.toLowerCase().replace(" ", "");
        String reverse_string = new StringBuilder(input_string).reverse().toString();
        return input_string.equals(reverse_string);
    }
}
