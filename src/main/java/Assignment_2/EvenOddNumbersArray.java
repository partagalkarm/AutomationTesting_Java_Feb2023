package Assignment_2;

public class EvenOddNumbersArray {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 8, 9, 14};
        System.out.println("Odd Numbers:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
        System.out.println("Even Numbers:");
        for (int i =0; i< arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
