package myexercise.model;

import java.util.Scanner;

public class PasswordGenerator {

    public void PasswordChecker() {
        int count;
        do {
            count = countCriteriaMatch(getString());
            printMessage(count);
        } while (count < 3);
    }

    private String getString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a password with at least 8 characters long:");
        return scanner.nextLine();
    }

    private int countCriteriaMatch(String password){
        int count = 1;
        String criteria1 = "^(?=.*[A-Z])(?=\\S+$).{8,}$";
        if (password.matches(criteria1))
            count++;
        String criteria2 = "^(?=.*[a-z])(?=\\S+$).{8,}$";
        if (password.matches(criteria2))
            count++;
        String criteria3 = "^(?=.*[0-9])(?=\\S+$).{8,}$";
        if (password.matches(criteria3))
            count++;
        String criteria4 = "^(?=.*[@#$%^&!.+=])(?=\\S+$).{8,}$";
        if (password.matches(criteria4))
            count++;
        String criteria5 = "^(?!.*?([A-Za-z])\\1{2})(?!.*?(abc|bcd|" +
                "cde|def|efg|fgh|ghi|hij|ijk|jkl|klm|lmn|mno|nop|opq|" +
                "pqr|qrs|rst|stu|tuv|uvw|vwx|wxy|xyz))(?=\\S+$).{8,}$";
        if (password.matches(criteria5))
            count++;
        return count;
    }

    private void printMessage(int count){
        if (count == 6)
            System.out.println("Very Strong Password!");
        else if (count == 5)
            System.out.println("Strong Password!");
        else if (count >= 3)
            System.out.println("Password OK!");
        else {
            System.out.println("Invalid Password\nPassword must contain:\n" +
                    "1. At least one uppercase character\n" +
                    "2. At least one lowercase character\n" +
                    "3. Contains at least one number\n" +
                    "4. Contains at least one special character (e.g., !, _ etc)\n" +
                    "5. Password length must be at least 8 characters long\n" +
                    "6. Cannot contain a sequence of 3 same characters (i.e.\n" +
                    "aaa) or a sequence of 3 consecutive characters (i.e abc)\n");
        }
    }

}

