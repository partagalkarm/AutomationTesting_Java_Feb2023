package Assignment_1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter year");
        int year = sc.nextInt();

        boolean l = (year % 4) == 0;
        boolean m = (year % 100) != 0;
        boolean n = (year % 100 == 0) && (year % 400 == 0);

        if (l && (m || n)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
