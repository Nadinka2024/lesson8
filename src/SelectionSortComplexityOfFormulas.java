import java.util.ArrayList;
import java.util.List;

public class SelectionSortComplexityOfFormulas {
    public static void main(String[] args) {
        List<String> formulas = new ArrayList<>();
        formulas.add("5+6+32=43");
        formulas.add("1+1=2");
        formulas.add("(3+5)*4*21=483");
        formulas.add("((21-20)*(32-30))/2=1");

        selectionSort(formulas);

        System.out.println("Формулы, отсортированные по сложности:");
        for (String formula : formulas) {
            System.out.println(formula);
        }
    }

    public static void selectionSort(List<String> formulas) {
        int k = formulas.size();

        for (int i = 0; i < k - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < k; j++) {
                if (countOperations(formulas.get(j)) < countOperations(formulas.get(minIndex))) {
                    minIndex = j;
                }
            }

            String temp = formulas.get(minIndex);
            formulas.set(minIndex, formulas.get(i));
            formulas.set(i, temp);
        }
    }

    public static int countOperations(String formula) {
        int count = 0;
        for (char c : formula.toCharArray()) {
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                count++;
            }
        }
        return count;
    }
}
