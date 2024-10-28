import java.util.ArrayList;

public class Main20 {
    ////Задача средне-сложного уровня:
    //    //Напишите метод, который принимает два списка целых чисел и возвращает новый список,
    //    // содержащий общие элементы обоих списков без дубликатов.

    //1.Создаем два массива
    //2юЧерез foreach прогоняем првый массив
    //2. Чеез if сравниваем элементы первого через массив со вторым, если равны, выводим в консоль

    public static void main(String[] args) {
        int[] first = {2, 7, 8, 1, 79, 5, 11, 38, 94};
        int[] second = {4, 5, 11, 0, 3, 8, 16, 99, 54};
        ArrayList<Integer> result = new ArrayList<>();

        for (int number : first) {
            for (int number2 : second) {
                if (number == number2) {
                    result.add(number);


                }


            }
            System.out.println(result);

        }

    }
}

