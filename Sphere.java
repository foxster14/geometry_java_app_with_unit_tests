import java.lang.Math;  //This library is included by default typically and gives access to special arithmetic functions like pi & exponents
import java.util.Scanner;  //This library allows user input to be read from the terminal

public class Sphere {

    public static double surfaceArea(int radius){
        double surface = 4 * Math.PI * Math.pow(radius, 2);
        return surface;
    }

    public static double volumeCalc(int radius){
        double volume = (4/3) * Math.PI * Math.pow(radius, 3);
        return volume;
    }

    public static void prompt(){

        Scanner reader = new Scanner(System.in); //The reader object is never closed, but the program doesn't run if it's closed within the Sphere Class
        System.out.print("\nPlease enter the radius: ");
        int radius1 = reader.nextInt(); 
        
        System.out.printf("\nThe Surface area of a Sphere = %.2f", surfaceArea(radius1));
        System.out.printf("\nThe Volume of a Sphere = %.2f\n", volumeCalc(radius1));
    }
    
}

