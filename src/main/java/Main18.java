public class Main18 {

    //Задача легкого уровня:
    //Напишите метод, который принимает массив целых чисел и возвращает среднее арифметическое элементов массива.
    //
    //Задача среднего уровня:
    //Напишите метод, который принимает строку и возвращает количество гласных букв в этой строке.
    // Считайте, что строка содержит только символы английского алфавита.
    //
    //Задача средне-сложного уровня:
    //Напишите метод, который принимает два списка целых чисел и возвращает новый список,
    // содержащий общие элементы обоих списков без дубликатов.
    //Пишем массив
    //Через цикл прогоняем данный массив
    //Ищем сумму всех элементов в массиве

    public static void main(String[] args) {
        int[] array = null;


        double resultOfMethod = methodOfArray(array);
        System.out.println(resultOfMethod);

    }

    public static double methodOfArray(int[] array) {
        if (array == null) {
            return 0;
        }
        int lengthOfArray = array.length;

        if (lengthOfArray == 0) {
            return 0;
        }
        double sum = 0;

        for (int i = 0; i < lengthOfArray; i++) {
            sum += array[i];

        }
        double result = sum / lengthOfArray;

        return result;
    }


}

