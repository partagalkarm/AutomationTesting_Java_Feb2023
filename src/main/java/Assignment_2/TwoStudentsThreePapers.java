package Assignment_2;

public class TwoStudentsThreePapers {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        int count = 1;

        //use for loop to assign value to an array
        for (int r = 0; r < 2; r++){
            for (int c = 0; c < 3; c++) {
                arr[r][c] = count;
                count++;
            }
        }
                //print the value of the array
        for (int r = 0; r <2; r++){
            for (int c = 0; c < 3; c++){
                System.out.println("arr[" + r + "][" + c + "]= " + arr[r][c]+ "");
            }
            System.out.println();
        }
    }
}
