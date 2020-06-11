import java.util.Scanner;

public class Symbols13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 100, y = 50;
        int a = x+y,b = x-y,c = x*y, d= x/y;

        int number=b ; // put a,b,c or d for result

        if (number ==x+y){
            System.out.println(" Addition of Two number is: "+a);
         }
        else if (number ==x-y) {
            System.out.println("Subtraction of Two number is: " + b);
         }
         else if (number ==x*y){
             System.out.println("Multiplication of Two number is: "+c);
         }
         else if(number==x/y){
            System.out.println(" Division of Two number is: "+d);
        }
         else{
            System.out.println("not calculated");

        }
    }

}
