import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    Main main = new Main();

    @Test
    void additional(){
        assertEquals(2, main.add(1,1));
    }
    @Test
    void difference() {
        assertEquals(1, main.diff(3,2));
    }
    @Test
    void multiplication(){
        assertEquals(6, main.multiplication(2,3));
    }
    @Test
    void division() {
        assertEquals(3, main.division(6,2));
    }
}
