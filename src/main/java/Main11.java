import java.util.Scanner;

public class Main11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            double c = Math.sqrt(i);
            double d = Math.floor(c);

            if (c == d) {
                System.out.println(i);
            }
        }
    }
}