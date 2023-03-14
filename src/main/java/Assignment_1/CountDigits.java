package Assignment_1;

public class CountDigits {
    public static void main(String[] args) {
        int count = 0;
        int num = 76493;
        while (num != 0) {
            num /= 10;
            ++count;
        }
        System.out.println("Number if digits:" + count);
    }
}
