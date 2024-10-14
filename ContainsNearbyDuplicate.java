import java.util.*;

public class ContainsNearbyDuplicate {

    /*
    Problem: Given an array of integers and an integer k,
     find out if there are two distinct indices i and j in the array
      such that nums[i] == nums[j] and the absolute difference between i and j is at most k.
     */
    static List<Integer> numbers = List.of(5, 3, 8, 10, 5, 3, 1);
    static Set<Integer> numberSet = new HashSet<>();
    static Integer k = 4;

    public static void main(String[] args) {
        for (Integer i = 0; i < numbers.size() - k; i++) {
            for (Integer j = i + 1; j <= k+1; j++) {
                if (numbers.get(i) == numbers.get(j) && Math.abs(i - j) == k) {
                    numberSet.add(numbers.get(i));
                    numberSet.add(numbers.get(j));
                    break;
                }
            }
        }
        System.out.println(numberSet);
    }
}
