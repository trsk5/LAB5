public class task4 {
    public static void main(String[] args) {
        int[] array = {10, 5, 20, 15, 25};
        int max = findMaxNumber(array);
        System.out.println("Найбільше число в масиві: " + max);
    }

    // Метод для пошуку найбільшого числа в масиві
    public static int findMaxNumber(int[] arr) {
        int max = arr[0]; // Припускаємо, що перший елемент масиву - найбільший
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Якщо знайдено число, більше поточного максимуму, замінюємо його
            }
        }
        return max; // Повертаємо найбільше число
    }
}
