import java.util.Scanner;

public class Main7 {
    //создаем сканер
    //вводим три переменные через сканер a,b,c
    //если a< b+c and b<a+c and c<a+b sout(Yes) else (No)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a < b + c && b < a + c && c < b + a) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
