package ru.netology.unit;

import org.junit.Test;
import ru.netology.service.CashbackHackerP2;

import static org.junit.Assert.*;

public class CashbackHackerP2Test {


    @Test
    public void shouldAdd100WhenAmount900() {
        CashbackHackerP2 cashbackHacker = new CashbackHackerP2();
        int actual = cashbackHacker.remain(900);
        int expected = 100;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldAdd0WhenAmount1000() {
        CashbackHackerP2 cashbackHacker = new CashbackHackerP2();
        int actual = cashbackHacker.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldAdd1WhenAmount999() {
        CashbackHackerP2 cashbackHacker = new CashbackHackerP2();
        int actual = cashbackHacker.remain(999);
        int expected = 1;
        assertEquals(expected, actual);
    }

}