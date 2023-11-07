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
    @Test
    public void passwordNumberCheck() {
        //given
        String password = "12345678";

        //when
        boolean result = passwordvalidation.checkNumber(password);


        //then
        assertEquals(true, result);
    }
    @Test
    public void passwordNumberCheckfalse() {
        //given
        String password = "testtest";

        //when
        boolean result = passwordvalidation.checkNumber(password);


        //then
        assertEquals(false, result);



    }
@Test
    public void passwordcheckcase() {

    //give
    String password = "TESTtest";

    //when
    boolean result = passwordvalidation.checkcase(password);

    //then
    assertEquals(true, result);


    }

    @Test
    public void passwordcheckcasefalse() {

        //give
        String password = "testtest";

        //when
        boolean result = passwordvalidation.checkcase(password);

        //then
        assertEquals(false, result);


    }
    @Test
    public void passwordcheckcaseuppercase() {

        //give
        String password = "TESTTEST";

        //when
        boolean result = passwordvalidation.checkcase(password);

        //then
        assertEquals(false, result);


    }


}

