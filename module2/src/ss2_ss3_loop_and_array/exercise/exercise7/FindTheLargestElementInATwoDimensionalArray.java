package ss2_ss3_loop_and_array.exercise.exercise7;

public class FindTheLargestElementInATwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,3},{2,3,1,3},{57,8,6,6,9,4}};
        int max = arr[0][0];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("số lớn nhất trong mảng hai chiều là : "+max);
    }
}
