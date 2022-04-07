public class Main {
    public static void main(String[] args) {
        /**Создайте класс ArrayInt.
         У класса Array должно быть 1 поле: private ArrayList<Integer> array;
         Добавьте конструктор (с параметром opacity для коллекции), сеттер, геттер.
         Добавьте функцию в класс ArrayInt для добавления и измения элементов в коллекции.
         *Этот класс ArrayInt используйте в задании 6 и 7 вместо класса Array.
         * Задание 6
         * Создайте интерфейс IMath. В нём должно быть три
         * метода:
         * ■ int Max()  — возвращает максимум;
         * ■ int Min() — возвращает минимум;
         * ■ float Avg() — возвращает среднеарифметическое.
         * Класс Array, созданный ранее, должен имплементировать интерфейс IMath.
         * Метод Max — возвращает максимум среди элементов массива.
         * Метод Min — возвращает минимум среди элементов массива.
         * Метод Avg — возвращает среднеарифметическое среди элементов массива.
         * Напишите код для тестирования полученной функциональности.
         * Задание 7
         * Создайте интерфейс ISort. В нём должно быть два метода:
         * ■ void SortAsc() — сортировка по возрастанию;
         * ■ void SortDesc() — сортировка по убыванию.
         * Класс Array, созданный ранее, должен имплементировать интерфейс ISort.
         * Метод SortAsc — сортирует массив по возрастанию.
         * Метод SortDesc — сортирует массив по убыванию.
         * Напишите код для тестирования полученной функциональности.
         */
        ArrayInt a = new ArrayInt(5);
        a.addArray(90);
        a.addArray(3);
        a.addArray(555);
        a.addArray(7);
        System.out.println(a);
        a.replaceArray(7,77);
        System.out.println(a);
        int z = a.Max();
        System.out.println("MAX = " + z);
        int z1 = a.Min();
        System.out.println("MIN = " + z1);
        float z2 = a.Avg();
        System.out.println("AVG = " + z2);
        a.SortAsc();
        System.out.println("Сортировка по возрастанию: " + a);
        a.SortDesc();
        System.out.println("Сортировка по убыванию: " + a);




    }
}