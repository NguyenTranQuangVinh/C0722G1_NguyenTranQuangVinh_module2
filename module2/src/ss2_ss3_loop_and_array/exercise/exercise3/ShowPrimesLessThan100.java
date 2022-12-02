package ss2_ss3_loop_and_array.exercise.exercise3;



public class ShowPrimesLessThan100 {
    public static void main(String[] args) {
        int num = 2;
        while (num < 100) {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(num + ", ");
            }
            num++;
        }
    }
}