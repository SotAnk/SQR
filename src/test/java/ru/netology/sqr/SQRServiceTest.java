package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldcalculateNumberSQRT() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calculateNumberSQRT(200, 300);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberSQRTOneSQRT() {
        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.calculateNumberSQRT(10, 100);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberSQRTBig() {
        SQRService service = new SQRService();

        int expected = 90;
        int actual = service.calculateNumberSQRT(10, 2000000000);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberSQRTMin() {
        SQRService service = new SQRService();

        int expected = 2;
        int actual = service.calculateNumberSQRT(150, 200);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberSQRTZero() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calculateNumberSQRT(10, 20);
        assertEquals(expected, actual);
    }
}

}