package ru.netology.tests;

import org.junit.jupiter.api.Test;
import ru.netology.service.CashbackHackService;
import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTestJUnit5 {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void purchaseOnMinSumNoBonus() {

        int actual = service.remain(1);
        int expected = 999;

       assertEquals(actual, expected);
    }

    @Test
    public void purchaseOnMaxSumNoBonus() {

        int actual = service.remain(999);
        int expected = 1;

        assertEquals(actual, expected);

    }

    @Test
    public void purchaseOnBoundary() {

        int expected = 0;
        int actual = service.remain(1000);

       assertEquals(expected,actual);
    }

}