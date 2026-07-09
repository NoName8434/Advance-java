import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which month that you want to count days? ");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.println("thang 1 co 30 ngay");
                break;
            case 2:
                System.out.println("thang 2 co 29 ngay");
                break;
            case 3:
                System.out.println("Thang 3 co 31 ngay");
                break;
            case 10:
                System.out.println("Thang 10 co 30 ngay");
                break;
            case 12:
                System.out.println("thang 12 co 31 ngay");
            default:
                System.out.print("Invalid input!");
                break;
        }
    }
}
