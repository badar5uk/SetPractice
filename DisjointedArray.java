import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DisjointedArray {
    /*
    Input: Two arrays as a list
    Output:  A boolean to check if they are different (Disjointed)
    Process: - Create an Array of integers using Arrays.asList
             - convert it into a Set.
             - compare if set 1 is equals to set 2
     */
    static Set<Integer> numberSet1 = new HashSet<>(Arrays.asList(5, 6, 0));
    static Set<Integer> numberSet2 = new HashSet<>(Arrays.asList(1, 2, 3));

    public static void main(String[] args) {

        Set<Integer> intersection = new HashSet<>(numberSet1);

        intersection.retainAll(numberSet2);
        if (intersection.isEmpty() == false) {
            System.out.println("The repeating elements are: " + intersection);
        } else if (intersection.isEmpty() == true) {
            System.out.println("The two arrays are disjointed");
        }
    }
}
