import java.util.Arrays;

public class Insertion {
    public static void insertionSort(int[] arr) {
        int j;
        //сортировку начинаем со второго элемента, т.к. считается, что первый элемент уже отсортирован
        for (int i = 1; i < arr.length; i++) {
            //сохраняем ссылку на индекс предыдущего элемента
            int swap = arr[i];
            for (j = i; j > 0 && swap < arr[j - 1]; j--) {
                //элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
                arr[j] = arr[j - 1];
            }
            arr[j] = swap;
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String args[]) {
        int[] arr = {12, 6, 4, 1, 15, 10};
        System.out.println(Arrays.toString(arr));
        System.out.println("____________________");
        insertionSort(arr);
        System.out.println("____________________");
        System.out.println(Arrays.toString(arr));
    }
}
