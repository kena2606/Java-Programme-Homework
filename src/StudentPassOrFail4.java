import java.util.Scanner;

public class StudentPassOrFail4 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String name;
        double rollnumber;
        int Maths,Science,English,total;
        float  Percentage, Average;
        for (int i=1;i<2; i++){
            System.out.println("Enter RollNumber");
            rollnumber = scanner.nextDouble();
            System.out.println("Enter Student Name");
            name=scanner.next();
            System.out.println("Please Enter the Maths Marks");
            Maths = scanner.nextInt();
            System.out.println("Please Enter the Science Marks");
            Science= scanner.nextInt();
            System.out.println("Plesae Enter the English Marks");
            English = scanner.nextInt();
            total = Maths+Science+English;
            Percentage =(total)/3f;
            System.out.println(" Total Marks =  " + total);
            System.out.println(" Marks Percentage =  " + Percentage);
            System.out.println("Student Grade is:  ");

            if (Percentage>=35){
                System.out.println("pass");
            }
            else {
                System.out.println(" fail");

            }
        }
    }
}
