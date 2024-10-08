import java.util.Arrays;

public class QuickSortFruits {
    public static void main(String[] args) {
        String[] fruits = {
                "apple",
                "orange",
                "grape",
                "banana"
        };
        quickSort(fruits, 0, fruits.length - 1);
        System.out.println("Отсортированный список фруктов: " + Arrays.toString(fruits));
    }

    public static void quickSort(String[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(String[] array, int low, int high) {
        String pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j].compareTo(pivot) <= 0) {
                i++;
                String temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        String temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}
