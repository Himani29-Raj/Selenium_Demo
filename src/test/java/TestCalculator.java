import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {
    @Test
    public void test(){
        Calculator c = new Calculator();
        assertEquals(8,c.add(5,3));
    }
}
