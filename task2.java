public class task2 {
    public static void main(String[] args) {
        // Приклад використання методу findMinNumber
        int a = 5, b = 3, c = 7;
        int min = findMinNumber(a, b, c);
        System.out.println("Найменше число: " + min);
    }

    // Метод для знаходження найменшого числа серед трьох чисел
    public static int findMinNumber(int a, int b, int c) {
        int min = a; // Припускаємо, що перше число - найменше
        if (b < min) {
            min = b; // Якщо друге число менше за перше, то воно стає найменшим
        }
        if (c < min) {
            min = c; // Якщо третє число менше за мінімальне, то воно стає найменшим
        }
        return min; // Повертаємо найменше число
    }
}
