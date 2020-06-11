import java.util.Scanner;

public class EmployeeSalary6 {

    public static void main(String[] args) {
        int  DA, TA, PF, HRA, BasicSalary, GrossSalary,employeeid;
        String name;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Employee Id");
        employeeid= sc.nextInt();
        System.out.println("Enter Your Name");
        name =sc.next();
        System.out.println("Enter Your Basic Salary");
        BasicSalary = sc.nextInt();
        HRA = (10 * BasicSalary) / 100;
        DA = (8 * BasicSalary) / 100;
        TA = (9 * BasicSalary) / 100;
        PF = (20 * BasicSalary) / 100;
        GrossSalary = BasicSalary + HRA + DA + TA + PF;
        System.out.println("BasicSalary: " + BasicSalary);
        System.out.println("HRA:  " + HRA);
        System.out.println("DA:  " + DA);
        System.out.println("TA:  " + TA);
        System.out.println("PF:   " + PF);
        System.out.println(".......................................");
        System.out.println("GrossSalary= " + GrossSalary);
    }
}

