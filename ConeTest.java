import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ConeTest {

    @Test //syntactial sugar
    public void surfaceAreaTest(){

        //Not neccessary to instantiate an object for static methods
        Cone coneVar = new Cone();
        double result = coneVar.surfaceAreaCalc(5,4);
        assertEquals(179.12, result, 178);

    }
    
}
