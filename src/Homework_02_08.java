import java.util.Locale;
import java.util.Scanner;

public class Homework_02_08 {

    public static void main(String[] args) {


        //        Create the algorithm which will process the sentence and return the result -
//        is this sentence a palindrome or not.
//
//        a.      Mom
//
//        b.      Was it a car or a cat I saw?
//
//        c.      Madam, in Eden, I’m Adam.
//
//        d.      Yo, banana boy!

        String mom = "Mom";




        String lowerCase = mom.toLowerCase(Locale.ROOT);

        for (int i = 0; i < mom.length(); i++) {


            char originalToChar = lowerCase.charAt(i);
            char[] charArray = {originalToChar};

            String originalString = new String(charArray);
        }
        StringBuilder reverseString = new StringBuilder();
        reverseString.append(lowerCase);
        reverseString.reverse();

        String toCompareMom = reverseString.toString();

        if (lowerCase.equals(toCompareMom)) {
            System.out.println("The string - " + mom + "- IS a palindrome!");
        } else {
            System.out.println("The string - " + mom + " - is NOT a palindrome!");
        }

        String catSaw = "Was it a car or a cat I saw?";


        String lowerCaseCat = catSaw.toLowerCase(Locale.ROOT);

        for (int i = 0; i < catSaw.length(); i++) {


            char originalToCharCat = lowerCaseCat.charAt(i);
            char[] charArrayCat = {originalToCharCat};

            String originalStringCat = new String(charArrayCat);
        }

        String noSpaceOriginalCat = lowerCaseCat.replaceAll("\\s", "");
        String noOddSymbolsCat = noSpaceOriginalCat.replaceAll("%3F", "")
                .replaceAll("[?]", "");

        StringBuilder reverseStringCat = new StringBuilder();
        reverseStringCat.append(noOddSymbolsCat);
        reverseStringCat.reverse();


        String toCompareCat = reverseStringCat.toString();

        if (noOddSymbolsCat.equals(toCompareCat)) {
            System.out.println("The string - " + catSaw + " - IS a palindrome!");
        } else {
            System.out.println("The string - " + catSaw + " - is NOT a palindrome!");

        }

        String eden = "Madam, in Eden, I’m Adam.";

        String lowerCaseEden = eden.toLowerCase(Locale.ROOT);

        for (int i = 0; i < eden.length(); i++) {


            char originalToCharEden = lowerCaseEden.charAt(i);
            char[] charArrayEden = {originalToCharEden};

            String originalStringEden = new String(charArrayEden);
        }

        String noSpaceOriginalEden = lowerCaseEden.replaceAll("\\s", "");
        String noOddSymbolsEden = noSpaceOriginalEden.replaceAll("%3F", "")
                .replaceAll("[$&+,:;=?@#,.|'<’>.-^*()%!]", "");

        StringBuilder reverseStringEden = new StringBuilder();
        reverseStringEden.append(noOddSymbolsEden);
        reverseStringEden.reverse();


        String toCompareEden = reverseStringEden.toString();

        if (noOddSymbolsEden.equals(toCompareEden)) {
            System.out.println("The string - " + eden + " - IS a palindrome!");
        } else {
            System.out.println("The string - " + eden + " - is NOT a palindrome!");

        }


        String banana = "Yo, banana boy!";

        String lowerCaseBanana = banana.toLowerCase(Locale.ROOT);

        for (int i = 0; i < banana.length(); i++) {


            char originalToCharBanana = lowerCaseBanana.charAt(i);
            char[] charArrayBanana = {originalToCharBanana};

            String originalStringBanana = new String(charArrayBanana);
        }

        String noSpaceOriginalBanana = lowerCaseBanana.replaceAll("\\s", "");
        String noOddSymbolsBanana = noSpaceOriginalBanana.replaceAll("%3F", "")
                .replaceAll("[$&+,:;=?@#|'<>.-^*()%!]", "");

        StringBuilder reverseStringBanana = new StringBuilder();
        reverseStringBanana.append(noOddSymbolsBanana);
        reverseStringBanana.reverse();


        String toCompareBanana = reverseStringBanana.toString();

        if (noOddSymbolsBanana.equals(toCompareBanana)) {
            System.out.println("The string - " + banana + " - IS a palindrome!");
        } else {
            System.out.println("The string - " + banana + " - is NOT a palindrome!");

        }

        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you know what is a palindrome?");
        System.out.println("It is a text identical from both sides!");
        System.out.println();
        System.out.println("Insert a text and find out if it is a palindrome : ");
        String userInput = scanner.next();




        String lowerCaseUserInput = userInput.toLowerCase(Locale.ROOT);

        for (int i = 0; i < userInput.length(); i++) {


            char originalToCharUserInput = lowerCaseUserInput.charAt(i);
            char[] charArrayUserInput = {originalToCharUserInput};

            String originalStringBanana = new String(charArrayUserInput);
        }

        String noSpaceOriginalUserInput = lowerCaseUserInput.replaceAll("\\s", "");
        String noOddSymbolsUserInput = noSpaceOriginalUserInput.replaceAll("%3F", "")
                .replaceAll("[$&+,:;=?@#,.|'<’>.-^*()%!]", "");

        StringBuilder reverseStringUserInput = new StringBuilder();
        reverseStringUserInput.append(noOddSymbolsUserInput);
        reverseStringUserInput.reverse();


        String toCompareUserInput = reverseStringUserInput.toString();

        if (noOddSymbolsUserInput.equals(toCompareUserInput)) {
            System.out.println("The string - " + userInput + " - IS a palindrome!");
        } else {
            System.out.println("The string - " + userInput + " - is NOT a palindrome!");

        }





    }
}
