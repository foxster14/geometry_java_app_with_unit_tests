import java.util.Scanner;

public class Geometry {
    public static void main(String[] args){
       
        //The menu will run repeatedly until the user quits, giving them the chance to select more than 1 option
        while(true) {
            Scanner reader = new Scanner(System.in);
            System.out.println("Welcome to the Java Geometry Program!\nSelect from these Options");
            System.out.println("1. Cylinder");
            System.out.println("2. Sphere");
            System.out.println("3. Cone");
            System.out.println("0. Quit");
		    int userInput = reader.nextInt(); 

            if (userInput == 0){
                break;
            }

            else if (userInput == 1){

            }
            else if (userInput == 2){

            }
            else if (userInput == 3){

            }

            reader.close(); //It is good practice to close the reader object to avoid data leake
        }//End of while loop
    

        
      }
}