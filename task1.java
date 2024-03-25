import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("Введіть довжину сторони квадрата: ");
        Scanner scanner = new Scanner(System.in);
        double sideLength = scanner.nextDouble();

        double squareArea = areaOfSquare(sideLength);

        System.out.println("Площа квадрата зі стороною " + sideLength + " дорівнює " + squareArea + " квадратних одиниць");
    }

    private static double areaOfSquare(double sideLength) {
        return sideLength * sideLength;
    }
}