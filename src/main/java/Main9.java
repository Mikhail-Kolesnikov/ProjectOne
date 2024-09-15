import java.util.Scanner;

public class Main9 {
    //Создаем сканер
    //Вводим переменные a и b через сканер
    //через цикл for(int=a; i<=b; i++)
    // if(i%2==0) sout(i)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
        }
    }
}
