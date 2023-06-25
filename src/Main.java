import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static int generateFourDigitNumber() {
        List<Integer> digits = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            digits.add(i);
        }
        Collections.shuffle(digits);
        int result = 0;
        int placeValue = 1000;
        for (int i = 0; i < 4; i++) {
            result += digits.get(i) * placeValue;
            placeValue /= 10;
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("yo");
        }
        return result;
//small change
        //second change

        //this is my sixth commit testggg
    }
    public static void getNums(String numString) {
        Scanner scanner = new Scanner(System.in);
        boolean trueorfalse = true;
        while (trueorfalse == true) {
            boolean Check = true;
            List<Integer> bulls = new ArrayList<>();
            List<Integer> cows = new ArrayList<>();
            List<String> Digits = new ArrayList<>();
            System.out.println("Въведете число");
            int guess = scanner.nextInt();
            String guessString = Integer.toString(guess);
            for (int i = 0; i < guessString.length(); i++) {
                Digits.add(String.valueOf(guessString.charAt(i)));
            }
            //2673
            for (int i = 0; i < Digits.size(); i++) {
                for (int j = i + 1; j < Digits.size(); j++) {
                    if (Digits.get(i).equals(Digits.get(j))) {
                        Check = false;

                    }
                }
            }
            for (int i = 0; i < 20; i++) {
                System.out.println("yoo");
            }
            if(guessString.equals(numString)) {
                System.out.println("Спечелихте!");
                System.exit(0);
            }
            boolean trueorfalse2 = true;
            try {
                for (int i = 0; i < guessString.length(); i++) {
                    if (numString.charAt(i) == guessString.charAt(i)) {
                        bulls.add(Character.getNumericValue(numString.charAt(i)));
                    } else if (numString.contains(Character.toString(guessString.charAt(i)))) {
                        cows.add(Character.getNumericValue(guessString.charAt(i)));
                    }
                }

            } catch (IndexOutOfBoundsException e) {
                System.out.println(e);
                if(Check == false) {
                    System.out.print("Въвели сте еднакви цифри, опитайте пак");
                }
                trueorfalse2 = false;
            }
            if(Check == false) {
                System.out.println("Въвели сте еднакви цифри, опитайте пак");
            }
            if(Check == true && trueorfalse2 == true) {
                System.out.println("Imate " + bulls.size() + " bika");
                System.out.println("Imate " + cows.size() + " kravi");
            }
        }
    }
    public static boolean checkDigits(int num)  {
        List<String> Digits = new ArrayList<>();
        String numString = Integer.toString(num);
        for (int i = 0; i < numString.length(); i++) {
            Digits.add(String.valueOf(numString.charAt(i)));
        }
        //2673
        for (int i = 0; i < Digits.size(); i++) {
            for (int j = i+1; j < Digits.size(); j++) {
                if(Digits.get(i)== Digits.get(j)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void ShowMenu() {

    }
    public static void main(String[] args) {
        int num = generateFourDigitNumber();
        String numString = Integer.toString(num);

        System.out.println(num);
        getNums(numString);
    }
}