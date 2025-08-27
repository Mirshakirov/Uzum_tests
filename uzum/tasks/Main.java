package uzum.tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        System.out.println(main.wordCounter("Hello world qwerty world", 2));

        System.out.println(Arrays.toString(main.twoSum(new int[]{1, 2, 5, 6, 7, 8}, 11)));

        System.out.println(Arrays.toString(main.twoPointers(new int[]{1, 1, 1, 2, 2, 3, 3, 3, 3})));

        Library library = new Library();

        Book firstBook = new Book("The Alchemist", "Paulo Coelho", 200, true);
        Book secondBook = new Book("Clean Code", "Robert C. Martin", 450, false);
        Book thirdBook = new Book("Effective Java", "Joshua Bloch", 380, true);

        UUID firstId = library.add(firstBook);
        UUID secondId = library.add(secondBook);
        UUID thirdId = library.add(thirdBook);

        System.out.println("\nAll books in library:");
        library.getAll().forEach(System.out::println);

        System.out.println("\nBook with ID " + secondId + ":");
        System.out.println(library.getBookById(secondId));

        System.out.println("\nRemoving book with ID " + firstId + "...");
        library.remove(firstId);

        System.out.println("\nAll books in library after removal:");
        library.getAll().forEach(System.out::println);
    }


    public String wordCounter(String string, int num){
        HashMap<String, Integer> map = new HashMap<>();
        String target = "";
        String[] words = string.split(" ");
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == num) {
                target = entry.getKey();
            }
        }

        return target;
    }

    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        int dif;
        for (int i = 0; i < nums.length; i++) {
            dif = target - nums[i];
            if(map.containsKey(dif)){
                return new int[]{map.get(dif), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public int[] twoPointers(int[] nums){
        int pointer = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[pointer] != nums[i]){
                pointer++;
                nums[pointer] = nums[i];
            }
        }

        return Arrays.copyOf(nums, pointer + 1);
    }

}
