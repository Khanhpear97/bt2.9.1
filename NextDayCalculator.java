public class NextDayCalculator {
    private int day;
    private int month;
    private int year;

    public NextDayCalculator(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getNextDay () {
        if (this.day < checkDayOfMonth()) {
            this.day++;
        } else if (this.day == checkDayOfMonth() && this.month < 12) {
            this.day = 1;
            this.month++;
        } else if (this.day == checkDayOfMonth() && this.month == 12) {
            this.day = 1;
            this.month = 1;
            this.year++;
        }
        return "Next day is: " + this.day + "/" + this.month + "/" + this.year;
    }

    public int checkDayOfMonth () {
        int dayOfMonth;
        switch (this.month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayOfMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayOfMonth = 30;
                break;
            case 2:
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
