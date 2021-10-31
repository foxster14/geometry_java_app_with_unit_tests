/*
Sarah Fox
Cylinder.java
10/30/2021
*/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ConeTest {

    @Test //syntactial sugar
    public void surfaceAreaTest(){

        //Not neccessary to instantiate an object for static methods
        Cone coneVar = new Cone();
        //Use 5 as the radius and 4 as the height to calculate the surface area
        double result = coneVar.surfaceAreaCalc(5,4);
        //Test will be successful if the calculation returns a number between 179.12 and 178
        assertEquals(179.12, result, 178);

    }
    
}
