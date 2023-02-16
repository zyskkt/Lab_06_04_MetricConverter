import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Init variables
        Scanner in = new Scanner(System.in);
        double meters = 0;
        double miles = 0;
        double feet;
        double inches;
        String trash = "";
        //Prompt for input
        System.out.println("Enter a distance in meters:");
        //If statement to check for valid entry and if none return error
        if (in.hasNextDouble()) {
            meters = in.nextDouble(); // set variable from input
            in.nextLine(); // Clear buffer
        } else {
            trash = in.nextLine();
            System.out.println("Your entry, " + trash + " is not valid measurement. Restart program and enter a number."); // Let user know the error.
            System.exit(0); // Close program.
        }


        //Calculate miles
        miles = meters * 0.000621371;
        //Calculate feet
        feet = miles * 5280;
        //Calculate inches
        inches = feet * 12;


        //Print results
        System.out.println(meters + " meters is equal to:");
        System.out.println(miles + " miles");
        System.out.println(feet + " feet");
        System.out.println(inches + " inches");
    }
}