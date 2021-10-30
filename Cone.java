import java.lang.Math;  //This library is included by default typically and gives access to special arithmetic functions like pi & exponents
import java.util.Scanner;  //This library allows user input to be read from the terminal

public class Cone {

    //Compute the slant of a cone & pass in values for radius & height that will be chosen by the user when the main program is run
    //Method is static so that a new object doesn't need to be created each time because this is a "one-off" type of object
    public static double slantCalc (int radius, int height) {
        double slant = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return slant;
    }

    //Compute the surface area of a cone passing in values for radius & height that will be chosen by the user when the main program is run
    //Each of the methods needs to be of type double because the Math.PI function is of type double
    public static double surfaceAreaCalc (int radius, int height) {
        double surfaceArea = Math.PI * radius * (radius + Math.sqrt(Math.pow(height,2) + Math.pow(radius, 2)));
        return surfaceArea;
    }

    public static double volumeCalc (int radius, int height) {
        double volume = Math.PI * Math.pow(radius, 2) * (height/3);
        return volume;
    }

    public static double lateralCalc (int radius, int height){
        double lateral = Math.PI * radius * Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2));
        return lateral;
    }

    //This is the method that will be called when this class is run in main program
    public static void prompt(){
        Scanner reader = new Scanner(System.in);
        System.out.print("\nPlease Enter the Radius of a Cone: ");
        int radius = reader.nextInt(); 
        System.out.print("Please Enter the Height of a Cone: ");
        int height = reader.nextInt();

        System.out.printf("\nLength of a Side (slant) of a Cone = %.2f", slantCalc(radius, height));
        System.out.printf("\nThe Surface Area of a Cone = %.2f", surfaceAreaCalc(radius, height));
        System.out.printf("\nThe Volume of a Cone = %.2f", volumeCalc(radius, height));
        System.out.printf("\nThe Lateral Surface Area of a Cone = %.2f\n", lateralCalc(radius, height));
    }
    
}
