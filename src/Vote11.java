import java.util.Scanner;

public class Vote11 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int age;
        System.out.println("Enter your age");
        age= sc.nextInt();
        if(age>=18){
            System.out.println("You are eligible for Voting");
        }
        else {
            System.out.println("You are not eligible for Voting");
        }
    }

}
