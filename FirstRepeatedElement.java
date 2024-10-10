import java.util.*;

public class FirstRepeatedElement {

    /*
    Input: A set of Integers with repeated elements
    Output: The first repeating element and the original set
    Process: - Take elements as a List
             - use a for loop to go through the list of elements
             - use an if statement to check if the number after index i is equal to i ( i == i+1 )
             - Change boolean to true and return than element
     */
    static List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 3, 3, 4, 5, 6, 7);
    static Set<Integer> numberSet = new HashSet<>();
    static Set<Integer> displaySet = new HashSet<>(numbers);

    public static void main(String[] args) {

        for (Integer x : numbers) {
            if (false == numberSet.add(x)) {
                System.out.println("Duplicate found: " + x);
                break;
            }
        }

        System.out.println("Our Set is: " + displaySet);
        System.out.println("The original List is: " + numbers);

    }
}
