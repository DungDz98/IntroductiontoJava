import java.util.Scanner;

public class ConvertNumberToLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String result = "";

        if (number >= 0 && number < 10) {
            result = convertNumber(number);
        } else if (number < 20) {
            result = " Mười " + convertNumber(number % 10);
        } else if (number < 100) {
            result = convertNumber(number / 10) + " mươi " + convertNumber(number % 10);
        } else if (number < 1000 && number % 100 < 10) {
            result = convertNumber(number / 100) + " trăm linh " + convertNumber(number % 10);
        } else if (number < 1000 && number % 100 < 20) {
            result = convertNumber(number / 100) + " trăm mười " + convertNumber(number % 10);
        } else if (number < 1000) {
            result = convertNumber(number / 100) + " trăm " + convertNumber((number / 10) % 10) + " mươi " + convertNumber(number % 10);
        } else {
            result = "Quá khả năng rồi";
        }
        System.out.println("Số đó đọc là: " + result);
    }

    public static String convertNumber(int number) {
        String result = "";
        switch (number) {
            case 0:
                result = "Không";
                break;
            case 1:
                result = "Một";
                break;
            case 2:
                result = "Hai";
                break;
            case 3:
                result = "Ba";
                break;
            case 4:
                result = "Bốn";
                break;
            case 5:
                result = "Năm";
                break;
            case 6:
                result = "Sáu";
                break;
            case 7:
                result = "Bảy";
                break;
            case 8:
                result = "Tám";
                break;
            case 9:
                result = "Chín";
                break;
        }
        return result;
    }
}


