public class Main19 {
    //Напишите метод, который принимает строку и возвращает количество гласных букв в этой строке.
    // Считайте, что строка содержит только символы английского алфавита.

    //Вводим переменную string со строкой
    //Через цикл прогоняем строку
    //Через иф, если елемент равняется а = выводим на экран

    public static void main(String[] args) {
        String string = "";
        int resultOfMethod = methodOfString(string);
        System.out.println(resultOfMethod);


    }

    public static int methodOfString(String string) {
        if (string == null) {
            return 0;
        }
        string = string.toLowerCase();

        int countOfSymbols = 0;

        for (int i = 0; i < string.length(); i++) {


            char symbol = string.charAt(i);
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u' || symbol == 'y') {
                countOfSymbols++;
            }
        }
        return countOfSymbols;
    }
}
