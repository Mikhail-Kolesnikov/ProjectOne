import java.util.Scanner;

public class Main16 {
    //На поверхности пруда плавает одна кувшинка, которая постоянно делится и разрастается. Таким образом,
    // каждый день площадь, которую занимают кувшинки, увеличивается в два раза. Через n дней (вводится с консоли)
    // покрытой оказывается вся поверхность пруда. За сколько времени половина пруда покроется кувшинками?

    //1. Вводим через сканер переменнюу колво дней
    //1/1 Вводим переменную колво кувшинок =1
    //2.for(i=1; i<=days.lenght;i++)
    //3. кув *=2
    //4. колво кув/2
    //5

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int plants = 1;
        for (int i = 1; i < days; i++) {
            plants *= 2;
        }


        int half = plants / 2;
        plants = 1;


        //System.out.println(half);
        int count = 1;
        while (plants != half) {
            plants *= 2;
            count ++;

        }
        System.out.println(count);
    }

}
