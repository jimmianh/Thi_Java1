package thi;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank aBank = new Bank();
        System.out.println("Vui lòng nhập số dư");
        aBank.setBalance(scanner.nextDouble());
        aBank.calculateInterest();
    }
}
