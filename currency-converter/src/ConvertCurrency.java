import java.util.Scanner;

public class ConvertCurrency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd, usd;
        System.out.print("Nhập số tiền cần chuyển đổi: ");
        usd = scanner.nextDouble();
        vnd = usd * 23000;
        System.out.printf("Giá trị: %.0f VND", vnd);
    }
}
