import java.lang.Math;  //This library is included by default typically and gives access to special arithmetic functions like pi & exponents
import java.util.Scanner;  //This library allows user input to be read from the terminal

//This class needs to be public so our main class can access it
public class Cylinder {
    
    //The Pi that the Math library imports is of type double
    //So these methods need to be of type double as well to store the calculations
    public static double volume (int radius, int height){
        //Math.pow(base, power) <-- this function is how to do an exponent in Java
        double volumeCalc = Math.PI * Math.pow(radius, 2) * height;
        return volumeCalc;
    }

    public static double surfaceArea (int radius, int height){
        double surfArea = (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
        return surfArea;
    }

    public static double lateralSurfaceArea (int radius, int height){
        double lateral = 2 * Math.PI* radius * height;
        return lateral;
    }

    public static double baseSurfaceArea (int radius){
        double base = Math.PI * Math.pow(radius, 2);
        return base;
    }

    public static void prompt() {

        Scanner reader = new Scanner(System.in);
        System.out.print("\nPlease enter the radius: ");
        int radius = reader.nextInt(); 
        System.out.print("Please enter the height: ");
        int height = reader.nextInt(); 

        //double actualSurfArea = (surfaceArea(radius, height));

        //The %.2f formats the double to be rounded off after 2 decimal places
        System.out.printf("\nThe surface area of a cylinder = %.2f", (surfaceArea(radius, height)));
        System.out.printf("\nThe volume of a cylinder = %.2f", (volume(radius, height)));
        System.out.printf("\nThe lateral surface area of a cylinder = %.2f", (lateralSurfaceArea(radius, height)));
        System.out.printf("\nThe top OR bottom surface area of a cylinder = %.2f\n", (baseSurfaceArea(radius)));
    
        
    }

    //Always good coding practice to close the reader object
    // reader.close();
}