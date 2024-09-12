import java.util.Scanner;

public class Main6 {
    //Вводим сканнер
    //переменная int со сканер
    //если не равно числам 1,2,4,7 - yes, else no

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number != 1 && number != 2 && number != 4 && number != 7){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
