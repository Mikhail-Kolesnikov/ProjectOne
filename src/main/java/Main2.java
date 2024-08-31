import java.util.Scanner;

public class Main2 {
    //Cоздаем сканнер
    //Создаем четыре переменных со scaner nextInt
    // Создаем if, с условием (x=x1||y=y1)->sout(yes)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        if (x == x1 || y == y1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
