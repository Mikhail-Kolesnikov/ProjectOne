public class Main3 {

    //Входные данные
    //Даны три целых числа, каждое записано в отдельной строке.
    //
    //Выходные данные
    //Выведите наибольшее из данных чисел (программа должна вывести ровно одно целое число).

    //1.создаем массив из трех чисел
    //2.создаем переменную int max=0
    //3.создаем цикл на длину этого массива
    //4.через if выводим наибольшее число (if(i>max) -> max = [i]

    public static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 5;
        array[1] = 7;
        array[2] = 9;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }


        }
        System.out.println(max);

    }
}
