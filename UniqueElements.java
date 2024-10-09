import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueElements {

    /*
    Input: An array of numbers added to the set
    output: The set with no duplicate elements
     */

    public static void main(String[]args){
        Set<Integer> numbers = new HashSet<>(Arrays.asList(1,2,2,2,2,3,3,3,4,5,6,7,8,9,2,4));
        System.out.println(numbers);
    }
}
