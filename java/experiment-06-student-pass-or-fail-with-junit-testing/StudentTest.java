import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    Student s = new Student();

    @Test
    public void test35() {
        assertEquals("Fail", s.checkResult(35));
    }

    @Test
    public void test50() {
        assertEquals("Pass", s.checkResult(50));
    }

    @Test
    public void test75() {
        assertEquals("Pass", s.checkResult(75));
    }

    @Test
    public void test100() {
        assertEquals("Pass", s.checkResult(100));
    }
}
