package ss2_loop_and_array.exercise.exercise11;


import java.util.Scanner;

public class CountTheNumberOfOccurrencesOfACharacterInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();
        System.out.print("Nhập ký tự:");
        char characters = scanner.nextLine().charAt(0);

        int count = 0;
        for (int i = 0; i <str.length() ; i++) {
          if(characters == str.charAt(i)){
              count++;
          }
        }
        System.out.println("Số kí tự đếm được là: "+count);
    }
}
