package ss1_introduction_java.bai_tap;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        System.out.println("Rate VND to USD is 1$ -> 23.000Vnd");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount (USD): ");
        double usd = Double.parseDouble(scanner.nextLine());

        double result = usd * 23000;
        System.out.println(usd + "$" + " = " + result + "vnd");
    }
}
