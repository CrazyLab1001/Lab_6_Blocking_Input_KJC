import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        double length = 0;
        double width = 0;
        double diagonal = 0;
        double area = 0;
        double perimeter = 0;
        String trash = "";
        do {
            System.out.println("What is the length of your rectangle?");
            Scanner in = new Scanner(System.in);
            if (in.hasNextDouble()) {
                length = in.nextDouble();
                in.nextLine();
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input of " + trash + ", try a number!");
            }
        } while (length == 0);
        do {
            System.out.println("What is the width of your rectangle?");
            Scanner in = new Scanner(System.in);
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input of " + trash + ", try a number!");
            }
        } while (width == 0);
        area = length * width;
        perimeter = (2 * length) + (2 * width);
        diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2)); // squareroot(length^2 + width^2); Pythagorean theorem
        System.out.println("The area of your rectangle is: " + area);
        System.out.println("The perimeter of your rectangle is: " + perimeter);
        System.out.println("The diagonal length of your rectangle is: " + diagonal);
    }
}
