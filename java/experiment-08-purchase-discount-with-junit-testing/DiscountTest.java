import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiscountTest {

    Discount d = new Discount();

    @Test
    public void testBelow1000() {
        assertEquals(900, d.calculate(900), 0.01);
    }

    @Test
    public void testEqual1000() {
        assertEquals(900, d.calculate(1000), 0.01);
    }

    @Test
    public void testAbove1000() {
        assertEquals(1350, d.calculate(1500), 0.01);
    }
}
