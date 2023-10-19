package test;

import org.junit.jupiter.api.Test;
import src.NextDayCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextDayCalculatorTest {
    @Test
    public void testInputDayNotExactlyWithLessThanMin() {
        int day = 0;
        int month = 3;
        int year = 2023;

        String expected = "Data day not exactly";
        String actual = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void testInputDayNotExactlyWithBiggerThanMax() {
        int day = 32;
        int month = 3;
        int year = 2023;

        String expected = "Data day not exactly";
        String actual = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void testInputMonthNotExactlyWithLessThanMin() {
        int day = 10;
        int month = 0;
        int year = 2023;

        String expected = "Data day not exactly";
        String actual = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void testInputMonthNotExactlyWithBiggerThanMax() {
        int day = 20;
        int month = 13;
        int year = 2023;

        String expected = "Data day not exactly";
        String actual = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void testInputYearNotExactlyWithLessThanMin() {
        int day = 10;
        int month = 4;
        int year = -1;

        String expected = "Data day not exactly";
        String actual = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void testInputDayExactlyMinWithCommonYear() {
        int day = 1;
        int month = 1;
        int year = 2023;

        String expected = "Next day is: 2/1/2023";
        String actual = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void test1InputDayExactlyMax30WithCommonYear() {
        int day = 30;
        int month = 4;
        int year = 2023;

        String expected = "Next day is: 1/5/2023";
        String actual = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void test2InputDayExactlyMax30WithCommonYear() {
        int day = 30;
        int month = 6;
        int year = 2023;

        String expected = "Next day is: 1/7/2023";
        String actual = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void test3InputDayExactlyMax30WithCommonYear() {
        int day = 30;
        int month = 9;
        int year = 2023;

        String expected = "Next day is: 1/10/2023";
        String actual = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void test1InputDayExactlyMax31WithCommonYear() {
        int day = 31;
        int month = 3;
        int year = 2023;

        String expected = "Next day is: 1/4/2023";
        String actual = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void test2InputDayExactlyMax31WithCommonYear() {
        int day = 31;
        int month = 8;
        int year = 2023;

        String expected = "Next day is: 1/9/2023";
        String actual = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void test3InputDayExactlyMax31WithCommonYear() {
        int day = 31;
        int month = 1;
        int year = 2023;

        String expected = "Next day is: 1/2/2023";
        String actual = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void test1InputDayMaxOfMonthFebruaryWithCommonYear() {
        int day = 29;
        int month = 2;
        int year = 2023;

        String expected = "Data day not exactly";
        String actual = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void test2InputDayMaxOfMonthFebruaryWithCommonYear() {
        int day = 28;
        int month = 2;
        int year = 2023;

        String expected = "Next day is: 1/3/2023";
        String actual = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void testInputDayMinOfMonthFebruaryWithCommonYear() {
        int day = 1;
        int month = 2;
        int year = 2023;

        String expected = "Next day is: 2/2/2023";
        String actual = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void testInputDayMaxOfMonthFebruaryWithLeapYear() {
        int day = 29;
        int month = 2;
        int year = 2024;

        String expected = "Next day is: 1/3/2024";
        String actual = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void test2InputDayMaxOfMonthFebruaryWithLeapYear() {
        int day = 30;
        int month = 2;
        int year = 2024;

        String expected = "Data day not exactly";
        String actual = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void testInputDayExactlyMaxOfYear() {
        int day = 31;
        int month = 12;
        int year = 2023;

        String expected = "Next day is: 1/1/2024";
        String actual = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }
}
