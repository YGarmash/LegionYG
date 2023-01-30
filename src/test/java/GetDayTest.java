import lesson8.M8;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class GetDayTest {
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all method");
    }

    @BeforeEach
    public void beforeTest() {
        System.out.println("Before each method");

    }


    @AfterAll
    public static void afterAll() {
        System.out.println("After all method");

    }

    @AfterEach
    public void afterTest() {
        System.out.println("after each method");

    }


    @Test
    public void positiveTests1() {
        M8 mmm = new M8();
        String day = mmm.arrayDaysOfTheWeek(3);
        System.out.println(day);
        assertEquals("Tuesday", day);
    }
    @Test
    public void positiveTests3() {
        M8 mmm = new M8();
        String day = mmm.arrayDaysOfTheWeek(1);
        System.out.println(day);
        assertEquals("Sunday", day);
    }

    @Test
    public void NullPointerExceptionTest() {
        M8 mmm = new M8();
        assertThrows(NullPointerException.class, () -> mmm.arrayDaysOfTheWeek(null));
    }

    @Test
    public void negativeTests() {
        M8 mmm = new M8();
        String day = mmm.arrayDaysOfTheWeek(-1);
        System.out.println(day);
        assertEquals("The number should be equal or larger than 1", day);
        day = mmm.arrayDaysOfTheWeek(0);
        System.out.println(day);
        assertEquals("The number should be equal or larger than 1", day);
    }
}