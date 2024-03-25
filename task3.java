public class task3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        printArray(array);
    }

    // Метод для виведення масиву на консоль
    public static void printArray(int[] arr) {
        System.out.print("Масив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", "); // Виведення коми між елементами, крім останнього
            }
        }
        System.out.println(); // Перехід на новий рядок після виведення масиву
    }
}
