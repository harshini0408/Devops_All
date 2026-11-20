import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {

    LeapYear l = new LeapYear();

    @Test
    public void testLeapYear() {
        assertTrue(l.check(2024));
    }

    @Test
    public void testNonLeapYear() {
        assertFalse(l.check(2023));
    }

    @Test
    public void testCenturyLeapYear() {
        assertTrue(l.check(2000));
    }

    @Test
    public void testCenturyNonLeapYear() {
        assertFalse(l.check(1900));
    }
}
