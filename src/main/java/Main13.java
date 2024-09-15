import java.util.Scanner;

public class Main13 {
    //вводим число через сканер
    //задаем три прееменных
    //1. Для первого числа делим на 100 без остатка
    //2. для второго числа делим на 100 с остаком и остатк делим на 10
    //3. для третьего числа делим на 10 с остатком
    //4. складываем все переменные
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
//        if (a > 999 || a < 100) {
//            System.out.println("fail");
//            return;

        int b = a / 10 / 10 / 10 % 10;

        int first = a / 10 / 10 % 10;
        int second = a / 10 % 10;
        int third = a % 10;
        int res = first + second + third + b;

        System.out.println(res);
    }
}
