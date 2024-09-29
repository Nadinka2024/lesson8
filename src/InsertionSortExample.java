import java.util.ArrayList;
import java.util.List;

public class InsertionSortExample {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("cat");
        words.add("orange");
        words.add("elephant");
        words.add("bird");

        insertionSort(words);

        System.out.println("Слова, отсортированные по количеству гласных букв:");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void insertionSort(List<String> words) {
        for (int i = 1; i < words.size(); i++) {
            String key = words.get(i);
            int j = i - 1;

            while (j >= 0 && countVowels(words.get(j)) > countVowels(key)) {
                words.set(j + 1, words.get(j));
                j--;
            }
            words.set(j + 1, key);
        }
    }

    public static int countVowels(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}
