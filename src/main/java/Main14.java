import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int sum = 0;

        while (number != 0) {
            int rest = number % 10;
            number = number / 10;
            sum += rest;




        }System.out.println(sum);


    }


}


