package ss2_ss3_loop_and_array.exercise.exercise6;
import java.util.Arrays;
public class ArrayMerge {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr1 = {6,7,8,9,10};
        int[] arr2 = new int[arr.length+arr1.length];
        int index = 0;
        int j = 0;
        for (int i = 0; i <arr.length ; i++) {
            arr2[i]=arr[i];
            index = i;
        }
        System.out.print(index+"\n");
        for (int i = index+1; i < arr2.length ; i++) {
            arr2[i]=arr1[j];
            j++;
        }
        System.out.print(Arrays.toString(arr2));
    }
}
