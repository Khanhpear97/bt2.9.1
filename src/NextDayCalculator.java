package src;

public class NextDayCalculator implements MonthOfYear {
    private int day;
    private int month;
    private int year;

    public NextDayCalculator(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNextDay () {
        if (this.day < lastDayOfMonth()) {
            this.day++;
        } else if (this.day >= lastDayOfMonth() && this.month < 12) {
            this.day = 1;
            this.month++;
        } else if (this.day >= lastDayOfMonth() && this.month == 12) {
            this.day = 1;
            this.month = 1;
            this.year++;
        }
        return "Next day is: " + this.day + "/" + this.month + "/" + this.year;
    }

    public int lastDayOfMonth () {
        int dayOfMonth;
        switch (this.month) {
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
                if (isLeapYear()) {
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

    public Boolean isLeapYear () {
        boolean isDivisibleBy4 = this.year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = this.year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = this.year % 400 == 0;
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
