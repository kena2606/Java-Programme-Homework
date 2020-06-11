import java.util.Scanner;

public class AutoCityName10 {

    public static void main(String[] args) {

        String cityName ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Alphabet From A to F");
        cityName =sc.next();

        if (cityName.equals("a") ) {

            System.out.println("Ahmedabad");

        } else if (cityName.equals("b")) {

            System.out.println("Baroda");

        } else if (cityName.equals("c")) {

            System.out.println("Cochin");

        } else if (cityName.equals("d")) {

            System.out.println("Dubai");

        } else if (cityName.equals("e")) {

            System.out.println("England");

        } else if (cityName.equals("f")) {

            System.out.println("France");

        } else{
            System.out.println("Invalid CityName");
        }
    }
}
