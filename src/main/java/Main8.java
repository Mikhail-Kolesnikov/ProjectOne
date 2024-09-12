import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = scanner.nextInt();
        int time = scanner.nextInt();
        int distance = 109;

        int res = (speed * time) % distance;
        System.out.println(res);
    }
}
