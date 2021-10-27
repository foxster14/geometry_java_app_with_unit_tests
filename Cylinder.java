 //This library gives access to pi & exponents
import java.util.Scanner;

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

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("\nPlease enter the radius: ");
        int radius = int(input("\nPlease enter the radius: "))
        int height = int(input("Please enter the height: "))   

    print("The surface area of a cylinder =", round(surfaceArea(radius, height), 2))
    print("The volume of a cylinder =", round(volume(radius, height), 2))
    print("The lateral surface area of a cylinder =", round(lateral(radius, height), 2))
    print("The top OR bottom surface area of a cylinder =", round(base(radius), 2))
    }

}