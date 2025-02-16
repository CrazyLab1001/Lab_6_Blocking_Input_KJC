import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        double tempC = -1;
        double tempF = 0;
        String trash = "";
        do {
            System.out.println("What is the temperature (in Celsius)? ");
            Scanner in = new Scanner(System.in); // input
            if (in.hasNextDouble()){
                tempC = in.nextDouble();
                in.nextLine();
                tempF = (tempC * ((double) 9 /5) + 32);
                System.out.println("The temperature in Fahrenheit is " + tempF + " degrees!");

            } else {
                trash = in.nextLine();
                System.out.println("Invalid input. " + trash + ". Try entering a number!");
            }
        } while (tempC == -1);
    }
}