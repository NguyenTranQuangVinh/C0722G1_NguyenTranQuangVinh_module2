package ss1_introduction_into_java.exercise.exercise3;

import java.util.Scanner;

public class CurrencyConverterApp {
    public static void main(String[] args) {
        double vnd = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền USD: ");
        double usd = Double.parseDouble(scanner.nextLine());
        double currencyConverter =usd*vnd;
        System.out.println("Giá trị VND: "+ currencyConverter );
    }
}
