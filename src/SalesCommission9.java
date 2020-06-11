import java.util.Scanner;

public class SalesCommission9 {
    public static void main(String[] args) {
        int salesid, salesamount, salarybasic, salescommission, TotalSales;
        double CommissionRate = 0.0, Commission;
        String name;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Salesperson Name");
        name= sc.next();
        System.out.println("Enter the Sales Id");
        salesid = sc.nextInt();
        System.out.println("Please Enter the Salesamount");
        salesamount = sc.nextInt();
        System.out.println("Please Enter the Salarybasic");
        salarybasic = sc.nextInt();
        System.out.println("Please enter total sales");
        TotalSales = sc.nextInt();
        if (TotalSales >= 50000) {
            CommissionRate = 35;
            Commission = CommissionRate + TotalSales;
            System.out.println("Total Commission is: " + Commission);
        } else if (TotalSales >= 30000) {
            CommissionRate = 20;
            Commission = CommissionRate + TotalSales;
            System.out.println("Total Commission is: " + Commission);
        } else if (TotalSales >= 20000) {
            CommissionRate = 10;
            Commission = CommissionRate + TotalSales;
            System.out.println("Total Commission is: " + Commission);

        } else if (TotalSales >= 10000) {
            CommissionRate = 5;
            Commission = CommissionRate + TotalSales;
            System.out.println("Total Commission is: " + Commission);
        } else if (TotalSales < 10000) {
            CommissionRate = 2;
            Commission = CommissionRate + TotalSales;
            System.out.println("Total Commission is: " + Commission);
        } else {
            System.out.println("Employee is not eligible for commission ");
        }
    }

}
