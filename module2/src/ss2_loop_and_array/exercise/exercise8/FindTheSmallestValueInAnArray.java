package ss2_loop_and_array.exercise.exercise8;
import java.util.Arrays;
import java.util.Scanner;

public class FindTheSmallestValueInAnArray {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài của mảng ");
        int num = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[num];
        int min ;
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("nhập phần tử thứ "+i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        min = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("số bé nhất trong mảng là : "+min);
    }
}
