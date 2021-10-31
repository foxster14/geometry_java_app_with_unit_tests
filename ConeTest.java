/*
Sarah Fox
ConeTest.java
10/30/2021
*/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ConeTest {

    @Test //syntactial sugar
    public void surfaceAreaTest(){

        //Not neccessary to instantiate an object for static methods
        Cone coneVar = new Cone();
        //Use 5 as the radius and 4 as the height to calculate surface area of a cone
        double result = coneVar.surfaceAreaCalc(5,4);
        //Return a successful test if the result of the surface area calculation is between 179.12 and 178
        assertEquals(179.12, result, 178);

    }
    
}
