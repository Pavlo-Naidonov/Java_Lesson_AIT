package app;

public class Main {

    public static void main(String[] args) {

        int day = 17;
        int month = 9;
        int year = 2025;

        System.out.println("Дата корректна: " + isDateValid(day,month,year));

    }

    private static boolean isDateValid(int day, int month, int year) {
        return isYearValid(year) && isMonthValid(month) && isDayValid(day,month,year);
    }

    private static boolean isDayValid(int day, int month, int year) {
        return day >= 1 && day <= dayInMonth(month,year);
    }

    private static boolean isMonthValid(int month) {
        return month >= 1 &&  month <= 12;
    }

    private static boolean isYearValid(int year) {
        return year > 0;
    }

    private static int dayInMonth(int month, int year){
        switch (month){
            case 1,3,5,7,8,10,12: return 31;
            case 4,6,9,11: return 30;
            case 2: return 28;
        }
        return 0;
    }
}