import java.util.Scanner;

public class Interchanged5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1979, rem, rev = 0;
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println(rev);


       /* int a=10,b=20;
        int c;
        c = a;//c=10 now
        a = b;// a=20 now
        b = c; // b=10 now

        System.out.println("a: "+a);
        System.out.println("b: "+b);

        int x=10,y=20;
        x = x+y; // 30
        y = x-y; // 30-20=10
        x = x-y; // 30-10=20

        System.out.println("x: "+x);
        System.out.println("y: "+y);
    */
    }
}
