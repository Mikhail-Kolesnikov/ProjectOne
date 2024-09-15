import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            double c = Math.sqrt(i);
            int d = (int) c;
            double f = c - d;
            if (f == 0.0) {
                System.out.println(i);
            }





        }
    }
}



