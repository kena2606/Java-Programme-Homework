import java.time.Year;
import java.util.Scanner;

public class LeapYear2 {
    public static void main(String[] args) {
        System.out.println("Enter year");
        Scanner Scanner = new Scanner(System.in);
        int year = Scanner.nextInt();

        if ((year % 400 == 0) || (year%4==0 && year %100!=0)){
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
      }
   }
}


