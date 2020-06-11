import java.util.Scanner;

public class StudentResults3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        double rollnumber;
        int Maths,Science,English;
        double marks;
        float total, Percentage, Average;
        for (int i=1;i<2; i++){
            System.out.println("Enter RollNumber");
            rollnumber = scanner.nextDouble();
            System.out.println("Enter Student Name");
            name=scanner.next();
            System.out.println("Please Enter Three Subject Marks");
            Maths = scanner.nextInt();
            Science= scanner.nextInt();
            English = scanner.nextInt();

            total = Maths + English+ Science;
            Average = total / 3;
            Percentage = (total / 300) * 100;

            System.out.println(" Total Marks =  " + total);
            System.out.println(" Average Marks =  " + Average);
            System.out.println(" Marks Percentage =  " + Percentage);

            System.out.println("Student Grade is: ");

            if (Percentage>= 80){
                System.out.println(" Your Name is:"+ name + " Your Grade is: A+");
            }
            else if (Percentage>=60){
                System.out.println(" Your Name is:"+ name + " Your Grade is:  A");
            }
            else if (Percentage>=50){
                System.out.println(" Your Name is:"+ name + " Your Grade is:  B");
            }
            else if (Percentage>=35){
                System.out.println(" Your Name is:"+ name + " Your Grade is:  C");
            }
            else{
                System.out.println(" You are not Enroll in this School");

           }
        }
    }

}
