import java.util.Scanner;

public class OddEven1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Number");

        int num= scanner.nextInt();
        String results= (num % 2==0) ? "Even" : "Odd";
        System.out.println("This Number is : "+ results);
    }

    }


