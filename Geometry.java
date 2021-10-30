import java.util.Scanner;
import java.lang.System;

public class Geometry {

    public static void header(String name) {
        String line = "-"; 
        System.out.println(line.repeat(55) + "\nPYTHON PROGRAM TO FIND" + name + "\n" + line.repeat(55));
    }

    //put the main menu in a separate method & call it multiple times 
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        //The menu will run repeatedly until the user quits, giving them the chance to select more than 1 option
        while(true) {
            
            System.out.println("\nWelcome to the Java Geometry Program!\nSelect from these Options");
            System.out.println("1. Cylinder");
            System.out.println("2. Sphere");
            System.out.println("3. Cone");
            System.out.println("0. Quit");

            System.out.print("Please enter your selection: ");
            int userInput = reader.nextInt();
            

            if (userInput == 0){
                break;
            }

            else if (userInput == 1){
                header("VOLUME & SURFACE AREA OF CYLINDER");
                Cylinder.prompt();
            }
            
            else if (userInput == 2){
                header("VOLUME & SURFACE AREA OF SPHERE");
                Sphere.prompt();
            }
            
            else if (userInput == 3){
                header("VOLUME & SURFACE AREA OF CONE");
                Cone.prompt();
            }
            else {
                System.out.println("Invalid selection, please try again.");
            }

            
        }//End of while loop
        reader.close(); //It is good practice to close the reader object to avoid data leak
    }//End of main program
    
}