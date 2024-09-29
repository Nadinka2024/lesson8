import java.util.Arrays;

public class Quick {
    public static void quickSort(int[] arr, int low, int high) {
        //завершить,если массив пуст или уже нечего делить
        if (arr.length == 0 || low >= high) return;

        //выбираем опорный элемент
        int middle = low + (high - low) / 2;
        int border = arr[middle];

        //разделияем на подмассивы и меняем местами
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < border) {
                i++;
            }
            while (arr[j] > border) {
                j--;
            }
            if (i <= j) {
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
                i++;
                j--;
                System.out.println(Arrays.toString(arr));
            }
        }

        //рекурсия для сортировки левой и правой части
        if (low < j) quickSort(arr, low, j);
        if (high > i) quickSort(arr, i, high);
    }

    public static void main(String args[]) {
        int[] arr = {12, 6, 4, 1, 15, 10};
        System.out.println(Arrays.toString(arr));
        System.out.println("____________________");
        quickSort(arr, 0, arr.length - 1);
        System.out.println("____________________");
        System.out.println(Arrays.toString(arr));
    }
}
