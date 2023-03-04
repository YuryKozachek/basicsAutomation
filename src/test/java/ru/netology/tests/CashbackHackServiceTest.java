package ru.netology.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void purchaseOnMinSumNoBonus() {

        int actual = service.remain(1);
        int expected = 999;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void purchaseOnMaxSumNoBonus() {

        int actual = service.remain(999);
        int expected = 1;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void purchaseOnBoundary() {

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(expected,actual);
    }
}
