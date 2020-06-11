import java.util.Scanner;

public class Positive8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number;
        System.out.println("Enter the Number");
        number =sc.nextInt();
        sc.close();
        if(number>0) {
            System.out.println("This Number is positive number");
        }
        else if(number<0){
            System.out.println("This Number is negative number");
        }
        else {
            System.out.println("This is Zero number");
        }
    }
}


