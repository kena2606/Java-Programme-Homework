import java.util.Scanner;

public class Average7 {
    public static void main(String[]args){
        int FirstNumber =100, SecondNumber =200,ThirdNumber=300,FourthNumber=400,FifthNumber=500;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int num1= sc.nextInt();
        System.out.println(" Enter Second number");
        int num2 =sc.nextInt();
        System.out.println("Enter Third number");
        int num3= sc.nextInt();
        System.out.println("Enter Forth number");
        int num4= sc.nextInt();
        System.out.println("Enter Fifth number");
        int num5= sc.nextInt();

        System.out.println("Average of five number is: "+(num1+num2+num3+num4+num5)/5);

    }
}

