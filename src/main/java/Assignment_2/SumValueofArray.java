package Assignment_2;

public class SumValueofArray {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 8, 9, 14};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum value of an array:"+ sum);
    }
}
