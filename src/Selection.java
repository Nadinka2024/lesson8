import java.util.Arrays;

public class Selection {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //pos - индекс наименьшего элемента
            int pos = i;
            //pos - наименьший элемент
            int min = arr[i];
            //цикл выбора наименьшего элемента
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    pos = j;
                    min = arr[j];
                }
            }
            //меняем местами наименьший с arr[i]
            arr[pos] = arr[i];
            arr[i] = min;
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String args[]) {
        int[] arr = {12, 6, 4, 1, 15, 10};
        System.out.println(Arrays.toString(arr));
        System.out.println("____________________");
        selectionSort(arr);
        System.out.println("____________________");
        System.out.println(Arrays.toString(arr));
    }
}
