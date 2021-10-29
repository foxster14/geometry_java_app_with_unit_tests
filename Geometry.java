import java.util.Scanner;
import java.lang.System;

public class Geometry {

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
                Cylinder.prompt();
            }
            
            else if (userInput == 2){
                Sphere.prompt();
            }
            
            else if (userInput == 3){

            }
            else {
                System.out.println("Invalid selection, please try again.");
            }

            
        }//End of while loop
        reader.close(); //It is good practice to close the reader object to avoid data leak
    }//End of main program
    
}