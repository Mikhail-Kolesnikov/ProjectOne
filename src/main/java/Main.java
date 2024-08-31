import java.util.Scanner;

public class Main {
    //1.Создам сканер
    //2.Создаем переменную int и вводим в нее scanner.nextint
    //3.Через if проверяем значение переменной(равна ли нулю), если равна нулю - через sout ("Равна нулю")
    //4.Через if проверяем значение переменной(больше нуля), если больше - через sout ("Больше нуля")
    //5.Через if проверяем значение переменной(меньше нуля), если меньше - через sout ("Меньше нуля")

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x == 0) {
            System.out.println(0);
        }
        if (x > 0) {
            System.out.println(1);
        }
        if (x < 0) {
            System.out.println(-1);
        }
    }
}


