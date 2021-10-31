/*
Sarah Fox
Geometry.java
10/25/2021
*/

import java.util.Scanner;
import java.lang.System;

public class Geometry {

    //String formatting to make the terminal output print neatly with line separators and titles
    public static void header(String name) {
        String line = "-"; 
        System.out.println(line.repeat(55) + "\nPYTHON PROGRAM TO FIND " + name + "\n" + line.repeat(55));
    }

    //Main menu for user to select which geometric shape they'd like to run calculations on
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        //The menu will run repeatedly until the user quits, giving them the chance to select more than 1 option
        while(true) {
            
            System.out.println("\nWelcome to the Java Geometry Program!\nSelect from these Options");
            System.out.println("1. Cylinder");
            System.out.println("2. Sphere");
            System.out.println("3. Cone");
            System.out.println("0. Quit");

            //Ge input from the user
            System.out.print("Please enter your selection: ");
            int userInput = reader.nextInt();
            
            //If user enters 0 the program will close
            if (userInput == 0){
                break;
            }
            //Run the cylinder program if input is 1
            else if (userInput == 1){
                header("GEOMETRIC CALCULATIONS OF A CYLINDER");
                Cylinder.prompt();
            }
            //Run the sphere program if input is 2
            else if (userInput == 2){
                header("GEOMETRIC CALCULATIONS OF A SPHERE");
                Sphere.prompt();
            }
            //Run the cone program if user input is 3
            else if (userInput == 3){
                header("GEOMETRIC CALCULATIONS OF A CONE");
                Cone.prompt();
            }
            //If user enteres a number outside of 0-3 give them an error message
            else {
                System.out.println("Invalid selection, please try again.");
            }

            
        }//End of while loop
        reader.close(); //It is good practice to close the reader object to avoid data leak
    }//End of main program
    
}