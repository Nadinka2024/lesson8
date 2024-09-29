import java.util.ArrayList;

public class Array {
    public static class Main {
        public static void main(String[] args) {
            ArrayList<String> flowers = new ArrayList<String>();

            flowers.add("Роза");
            flowers.add("Тюльпан");

            for (String element : flowers) {
                System.out.println(element);
            }

            flowers.set(0, "Ромашка");

            System.out.println("Результат после добавления");
            for (String element : flowers) {
                System.out.println(element);
            }
        }
    }


}

