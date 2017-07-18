
import java.util.Scanner;

/**
 * Created by TACasey-Calhoun on 7/16/2017.
 */
public class LabNumber6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Pig Latin Translator!");

        String answer;
        do {
        System.out.print("Please enter a word to be translated here: ");
        String userInput = scan.nextLine();
        userInput = userInput.toLowerCase();
        userInput = userInput.trim();

        // Determine whether the first character in word is a vowel
        char firstChar = userInput.charAt(0);  // First index is 0
        String vowels = "aeiou";

        // If firstChar is a vowel then indexOf will return at which index
        // it appears in the String vowels, otherwise it returns -1
        int vowel = vowels.indexOf(firstChar);
        boolean firstVowel = (vowel >= 0);

        System.out.print("\n\"" + userInput + "\" in Pig Latin is ");



        if (firstVowel) {
            System.out.println("\"" + userInput + "-hay\"");
        }
        else {
            String wordRemainder = userInput.substring(1);
            System.out.println("\"" + wordRemainder + "-" + firstChar + "ay\"");
        }

/*
        if (answer == 'y')
            System.out.println(userInput);
            answer = (int) scan.nextLine();
        else
            System.out.println("Thank you for visiting!");
*/
     //   String answer = "";
        System.out.println("Translate another line? (y/n):   ");

        answer = scan.nextLine();

    } while (answer.equalsIgnoreCase("y"));
  }
}


