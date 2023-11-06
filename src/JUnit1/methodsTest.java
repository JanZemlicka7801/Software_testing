package JUnit1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class methodsTest {
    @Test
    public void testMultipleOf3() {
        assertTrue(methods.multiple(3));
        assertTrue(methods.multiple(9));
        assertFalse(methods.multiple(7));
    }

    @Test
    public void testMultipleOf5() {
        assertTrue(methods.multiple(5));
        assertTrue(methods.multiple(10));
        assertFalse(methods.multiple(11));
    }

    @Test
    public void testMultipleOf3And5() {
        assertTrue(methods.multiple(15));
        assertTrue(methods.multiple(30));
        assertFalse(methods.multiple(16));
    }

    @Test
    public void testNonMultiple() {
        assertFalse(methods.multiple(7));
        assertFalse(methods.multiple(11));
        assertFalse(methods.multiple(14));
    }

    @Test
    public void testLargest(){
        assertEquals(1, methods.checkLargest(1,1,1));
        assertEquals(-1, methods.checkLargest(-1,-1,-1));
        assertEquals(0, methods.checkLargest(0,0,0));
        assertEquals(0, methods.checkLargest(0,-7,-1));
        assertEquals(3, methods.checkLargest(1,2,3));
        assertEquals(3, methods.checkLargest(2,3,1));
        assertEquals(3, methods.checkLargest(3,2,1));
    }

    @Test
    public void testSwap(){
        assertEquals("CDAB", methods.swap("ABCD"));
        assertEquals("ERROR", methods.swap("ACD"));
        assertEquals("ERROR", methods.swap("123"));
        assertEquals("ERROR", methods.swap(""));

    }

    @Test
    public void testTempConvertToFahrenheit() {
        assertEquals("The Celsius equivalent of 32 Fahrenheit is 0.0", methods.tempConvert(32, "F"));
        assertEquals("The Fahrenheit equivalent of 0 Celsius is 32.0", methods.tempConvert(0, "C"));
        assertEquals("ERROR", methods.tempConvert(100, "K"));
    }

    @Test
    public void testHours(){
        assertEquals(5.5,methods.chargeCounter(10));
        assertEquals(2.00,methods.chargeCounter(2.5));
        assertEquals(4.00,methods.chargeCounter(6.2));
        assertEquals(10.00,methods.chargeCounter(23.5));
    }

    @Test
    void studentMark() {
        int [] mark = {80,95,91,90,78,96};
        assertEquals("Your award is 1.1.",methods.studentMark(mark));
        int [] mark2 = {69,64,68,62,64,60};
        assertEquals("Your award is 2.1.",methods.studentMark(mark2));
        int [] mark3 = {60,50,51,58,59,51};
        assertEquals("Your award is 2.2.",methods.studentMark(mark3));
        int [] mark4 = {40,50,48,45,42,46};
        assertEquals("You passed the module.",methods.studentMark(mark4));
        int [] mark5 = {19,30,5,30,10,20};
        assertEquals("You failed the module.",methods.studentMark(mark5));
    }
}
