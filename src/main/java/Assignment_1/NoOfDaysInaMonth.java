package Assignment_1;

import java.util.Scanner;

public class NoOfDaysInaMonth {
    public static void main(String[] args) {
        int month;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter month number from 1 to 12");
        month = sc.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 Days in a month");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 Days in a month");
                break;
            case 2:
                System.out.println("28 Days in a month");
                break;
            default:
                System.out.println("Please enter a valid number between 1 to 12");

        }
    }
}
