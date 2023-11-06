package FirstWeek;

import org.junit.jupiter.api.Test;

import org.w3c.dom.ls.LSOutput;

import static org.junit.jupiter.api.Assertions.*;

class today091923Test {
    @Test
    void SimpleCalculator(){
        today091923 t = new today091923 ();
        assertEquals (5, t.sumDouble(2, 3));
    }

    @Test
    void SleepinIdentifier(){
        today091923 p = new today091923();
        assertTrue(p.sleepIn(false, true));
    }

    @Test
    void troubleExpector(){
        today091923 a = new today091923();
        assertTrue(a.monkeyTrouble(false,false));
    }

    @Test
    void SleepInIdentifier(){
        today091923 l = new today091923();
        assertTrue(l.sleepIn2(true,true));
    }

    @Test
    void love6Identifier(){
        today091923 p = new today091923();
        assertTrue(p.love6(10,4));
    }
}