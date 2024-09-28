import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the month (name, abbreviation, or number): ");
            String monthInput = scanner.next();

            System.out.print("Enter the year (4 digits, non-negative number): ");
            int year = scanner.nextInt();

            if (year < 0) {
                System.out.println("Invalid year. Please enter a valid non-negative number.");
                continue;
            }

            int days = getDaysInMonth(monthInput, year);

            if (days > 0) {
                System.out.println("Number of days in " + monthInput + " " + year + " is: " + days);
                break;  
            } else {
                System.out.println("Invalid month. Please enter again.");
            }
        }

        scanner.close();
    }

    public static int getDaysInMonth(String month, int year) {
        int days = -1;

        month = month.toLowerCase();

        switch (month) {
            case "1":
            case "january":
            case "jan.":
            case "jan":
                days = 31;
                break;
            case "2":
            case "february":
            case "feb.":
            case "feb":
                days = isLeapYear(year) ? 29 : 28;
                break;
            case "3":
            case "march":
            case "mar.":
            case "mar":
                days = 31;
                break;
            case "4":
            case "april":
            case "apr.":
            case "apr":
                days = 30;
                break;
            case "5":
            case "may":
                days = 31;
                break;
            case "6":
            case "june":
            case "jun":
                days = 30;
                break;
            case "7":
            case "july":
            case "jul":
                days = 31;
                break;
            case "8":
            case "august":
            case "aug.":
            case "aug":
                days = 31;
                break;
            case "9":
            case "september":
            case "sep.":
            case "sep":
                days = 30;
                break;
            case "10":
            case "october":
            case "oct.":
            case "oct":
                days = 31;
                break;
            case "11":
            case "november":
            case "nov.":
            case "nov":
                days = 30;
                break;
            case "12":
            case "december":
            case "dec.":
            case "dec":
                days = 31;
                break;
            default:
                days = -1;  
        }

        return days;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
