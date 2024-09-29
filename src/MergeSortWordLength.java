import java.util.Arrays;

public class MergeSortWordLength {
    public static void main(String[] args) {
        String[] words = {
                "cat",
                "orange",
                "elephant",
                "bird"
        };

        mergeSort(words, 0, words.length - 1);

        System.out.println("Отсортированный массив по длине слов: " + Arrays.toString(words));
    }

    public static void mergeSort(String[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            merge(array, left, middle, right);
        }
    }

    private static void merge(String[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        String[] leftArray = new String[n1];
        String[] rightArray = new String[n2];

        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, middle + 1, rightArray, 0, n2);

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i].length() <= rightArray[j].length()) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}

