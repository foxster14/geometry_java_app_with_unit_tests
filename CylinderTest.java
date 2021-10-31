/*
Sarah Fox
CylinderTest.java
10/30/2021
*/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CylinderTest {

    @Test //syntactial sugar
    public void volumeTest(){

        //Note -- it is not neccessary to instantiate an object for static methods
        Cylinder cylVar = new Cylinder();
        //Mocking user input for volume with a radius of 4 and height of 5
        double result = cylVar.volume(4,5);
        //The test will be successful if the method returns back a number between 251.33 and 252
        //We do this to account for rounding differences that can happen with doubles
        assertEquals(251.33, result, 252);

    }
    
}
