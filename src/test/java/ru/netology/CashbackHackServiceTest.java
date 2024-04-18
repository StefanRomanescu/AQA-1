package ru.netology;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void testBoundaryValuesOne() {
        org.junit.Assert.assertEquals(service.remain(0), 1000);
    }

    @org.junit.Test
    public void testBoundaryTwo() {
        org.junit.Assert.assertEquals(service.remain(1), 999);
    }

    @org.junit.Test
    public void testBoundaryThree() {
        org.junit.Assert.assertEquals(service.remain(999), 1);
    }

    @org.junit.Test
    public void testBoundaryFour() {
        org.junit.Assert.assertEquals(service.remain(1000), 0);
    }

    @org.junit.Test
    public void testBoundaryFive() {
        org.junit.Assert.assertEquals(service.remain(1001), 999);
    }
}