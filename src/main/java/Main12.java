import java.util.Scanner;

public class Main12 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 1; i <= b; i++) {
//            double c = Math.pow(i, 2);
            int c = i * i;
            if (c >= a && c <= b) {
                System.out.println(c);
            }

        }
    }
}

