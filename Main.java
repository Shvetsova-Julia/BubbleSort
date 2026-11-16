import java.util.Scanner;

public class Main {

    public static void bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Ошибка: размер массива должен быть больше нуля.");
            scanner.close();
            return;
        }

        int[] array = new int[n];

        System.out.println("Введите элементы массива:");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Исходный массив:");

        for (int number : array) {
            System.out.print(number + " ");
        }

        bubbleSort(array);

        System.out.println("\nОтсортированный массив:");

        for (int number : array) {
            System.out.print(number + " ");
        }

        System.out.println();
        scanner.close();
    }
}