package absoluteNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberTest {

    @Test
    void getAbsoluteNumberTest1() {
        int number = 1;
        int expected = 1;
        int result = AbsoluteNumber.getAbsoluteNumber(number);
        assertEquals(expected, result);
    }
    @Test
    void getAbsoluteNumberTest2() {
        int number = -1;
        int expected = 1;
        int result = AbsoluteNumber.getAbsoluteNumber(number);
        assertEquals(expected, result);
    }
    @Test
    void getAbsoluteNumberTest3() {
        int number = 0;
        int expected = 0;
        int result = AbsoluteNumber.getAbsoluteNumber(number);
        assertEquals(expected, result);
    }
}