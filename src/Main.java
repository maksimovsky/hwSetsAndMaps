import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println();
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        List<Integer> nums = new ArrayList<>(List.of(20, 1, 0, 1, 12, 2, 3, 4, 4, 5, 12, 5, 6, 7));

        Set<Integer> nums2 = new TreeSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                nums2.add(num);
            }
        }
        System.out.println(nums2);

        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");

        Set<String> words = new HashSet<>(List.of("one", "two", "one", "three", "two", "four", "one"));
        System.out.println(words);

        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        List<String> strings = new ArrayList<>(List.of("один", "один", "два", "два", "два",
                "три", "три", "три", "четыре"));

        Set<String> strings2 = new HashSet<>(strings);
        for (String s : strings2) {
            int i = -1;
            for (String string : strings) {
                if (string.equals(s)) {
                    i++;
                }
            }
            if (i > 0) {
                System.out.print(i + "  ");
            }
        }
    }
}