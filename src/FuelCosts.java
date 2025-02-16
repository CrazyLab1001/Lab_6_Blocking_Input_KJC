import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        double gallonsInTankMax = 0;
        double fuelEfficiencyMPG = 0;
        double pricePerGallon = 0;
        String trash = "";
        do {
            System.out.println("How many gallons, at maximum, can be in the tank? ");
            Scanner in = new Scanner(System.in);
            if (in.hasNextDouble()){
                gallonsInTankMax = in.nextDouble();
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + "; Try a number!");
            }
        } while (gallonsInTankMax == 0);

        do {
            System.out.println("What is your car's fuel efficiency (in Miles per Gallon)? ");
            Scanner in = new Scanner(System.in);
            if (in.hasNextDouble()){
                fuelEfficiencyMPG = in.nextDouble();
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + "; Try a number!");
            }

        } while (fuelEfficiencyMPG == 0);

        do {
            System.out.println("What is the gas price per gallon? ");
            Scanner in = new Scanner(System.in);
            if (in.hasNextDouble()){
                pricePerGallon = in.nextDouble();
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + "; Try a number!");
            }
        } while (pricePerGallon == 0);

            double costToDrive100 = 100 * ((double)1/fuelEfficiencyMPG) * pricePerGallon;
            double fullTankMiles = gallonsInTankMax * fuelEfficiencyMPG;
        System.out.println("The cost to drive 100 miles would be $" + costToDrive100 + ".");
        System.out.println("You can drive " + fullTankMiles + " miles with a full tank.");
    }
}
