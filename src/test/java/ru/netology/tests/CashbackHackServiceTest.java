package ru.netology.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    @Test
    public void purchaseOnMinSumNoBonus() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1);
        int expected = 999;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void purchaseOnMaxSumNoBonus() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(999);
        int expected = 1;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void purchaseOnBoundary() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }
}
