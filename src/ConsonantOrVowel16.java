import java.util.Scanner;

public class ConsonantOrVowel16 {
    public static void main(String args[]){
        System.out.println("Enter a character :");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
          System.out.println("Given character is an vowel");
      }
      else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
          System.out.println("Entered character "+ch+" is Consonent");
      else{
          System.out.println(" Error message display");
      }

    }
}
