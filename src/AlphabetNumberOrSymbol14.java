import java.util.Scanner;

public class AlphabetNumberOrSymbol14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any caracter : ");
        char ch = scanner.next().charAt(0);

        // Using character class
        if (Character.isAlphabetic(ch)) {

            System.out.println(ch + " It is A ALPHABET.");

        } else if (Character.isDigit(ch)) {

            System.out.println(ch + " It is A DIGIT.");

        } else {

            System.out.println(ch + "It is A SPECIAL CHARACTER.");

        }

    }
}
