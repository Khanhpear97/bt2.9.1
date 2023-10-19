import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day;
        int month;
        int year;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập ngày: ");
            day = scanner.nextInt();
            System.out.println("Nhập tháng: ");
            month = scanner.nextInt();
            System.out.println("Nhập năm: ");
            year = scanner.nextInt();
        } while (day < 1 || day > 31 || month < 1 || month > 12 ||
                month == 2 && isLeapYear(year) && day > 29 ||
                month == 2 && !isLeapYear(year) && day > 28);

        NextDayCalculator nextDayCalculator = new NextDayCalculator(day, month, year);
        System.out.println(nextDayCalculator.getNextDay());
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
