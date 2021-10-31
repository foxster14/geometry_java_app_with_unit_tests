import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SphereTest {

    @Test //syntactial sugar
    public void volumeTest(){

        //Note -- it is not neccessary to instantiate an object for static methods
        Sphere sphereVar = new Sphere();
        //Mocking user input for volume with a radius of 4 and height of 5
        double result = sphereVar.volumeCalc(4);
        //The test will be successful if the method returns back a number between 201.06.33 and 201.99
        //We do this to account for rounding differences that can happen with doubles
        assertEquals(201.06, result, 201.99);

    }
    
}
