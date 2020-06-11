import java.util.Scanner;

public class UppercaseToLowercase12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char ch;
        int value;
        System.out.println("Enter a Character in Upper Case: ");
        ch=sc.next().charAt(0);
        value=(int)ch;
        value=value+32;// A-65 B-66 c-67 and a with 97
        ch=(char)value;
        System.out.println("Lower Case is:" +ch);
    }
}
