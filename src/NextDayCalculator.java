package src;

public class NextDayCalculator implements MonthOfYear {

    public static String getNextDay (int day, int month, int year) {
        if (day < 1 || day > 31) {
            return "Data day not exactly";
        }

        if (month < 1 || month > 12) {
            return "Data day not exactly";
        }

        if (year < 0) {
            return "Data day not exactly";
        }

        if (day > 28 && month == 2 && !isLeapYear(year)) {
            return "Data day not exactly";
        } else if (day > 29 && month == 2 && isLeapYear(year)) {
            return "Data day not exactly";
        }

        if (day < lastDayOfMonth(month, year)) {
            day++;
        } else if (day == lastDayOfMonth(month, year) && month < 12) {
            day = 1;
            month++;
        } else if (day == lastDayOfMonth(month, year) && month == 12) {
            day = 1;
            month = 1;
            year++;
        }
        return "Next day is: " + day + "/" + month + "/" + year;
    }

    public static int lastDayOfMonth (int month, int year) {
        int dayOfMonth;
        switch (month) {
            case January:
            case March:
            case May:
            case July:
            case August:
            case October:
            case December:
                dayOfMonth = 31;
                break;
            case April:
            case June:
            case September:
            case November:
                dayOfMonth = 30;
                break;
            case February:
                if (isLeapYear(year)) {
                    dayOfMonth = 29;
                    break;
                }
                dayOfMonth = 28;
                break;
            default:
                dayOfMonth = 0;
        }
        return dayOfMonth;
    }

    public static Boolean isLeapYear (int year) {
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    return true;
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
