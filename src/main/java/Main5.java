import java.util.Scanner;

public class Main5 {

    //Создаем сканер
    //Вводим одну пременную числа int = scanner.next.Int
    //если число делится на 4 пишем yes

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        if (number % 4 == 0 || number == 1) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }
}
