import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap  so tien: ");
        money = scanner.nextDouble();
        System.out.println("Nhap so thang: ");
        month = scanner.nextInt();
        System.out.println("Nhap lai suat %");
        interestRate = scanner.nextDouble();
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println(totalInterest);
    }
}
