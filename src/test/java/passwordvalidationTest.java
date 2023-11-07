import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class passwordvalidationTest {
    @Test
    public void passwordvalidationTest() {
        //given
        String password = "test1234";

        //when
        boolean actual = passwordvalidation.checklenght(password);

        //then
        assertEquals(true, actual);

    }

    @Test
    public void passwordvalidationTestfalse() {
        //given
        String password = "test";

        //when
        boolean actual = passwordvalidation.checklenght(password);

        //then
        assertEquals(false, actual);

    }
}

