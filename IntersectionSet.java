import java.util.*;

public class IntersectionSet {
    /*
    Problem: Write a function that takes two arrays and returns an array containing
    the intersection of the two arrays (elements that appear in both arrays).
Input: [1, 2, 2, 3], [2, 2]
Output: [2]
     */
    static List<Integer> array1 = Arrays.asList(1,2,3,4,5,6);
    static List<Integer> array2 = Arrays.asList(6,7,8,9,10);
    static Set<Integer> setA = new HashSet<>(array1);
    static Set<Integer> setB = new HashSet<>(array2);

    public static void main(String[]args){
        checker();
    }
    public static void checker(){
        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        System.out.println("The intersection of the 2 sets is at: " + intersection);
    }
}
