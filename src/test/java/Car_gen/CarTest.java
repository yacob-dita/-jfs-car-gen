package Car_gen;
import org.junit.Assert;

import Car_gen.Honda;
import  org.junit.Test;

public class CarTest {
    Honda civic= new Honda(true, "Black", 2015, 190);
    @Test
    public void testAccelaratedSpeed(){
        Assert.assertEquals(5 ,civic.acceleratedSpeed());

    }

}