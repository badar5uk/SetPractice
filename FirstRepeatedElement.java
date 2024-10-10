import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstRepeatedElement {

    /*
    Input: A set of Integers with repeated elements
    Output: The first repeating element and the original set
    Process: - Take elements as a List
             - use a for loop to go through the list of elements
             - use an if statement to check if the number after index i is equal to i ( i == i+1 )
             - Change boolean to true and return than element
     */
    static List<Integer> numbers = Arrays.asList(1,2,2,3,3,3,3,3,4,5,6,7);
    static Set<Integer> numberSet = new HashSet<>(numbers);

    public static void main(String[]args){
        Integer x = 0;
        for (Integer i = 0; i < numbers.size(); i++){
            if(numbers.get(i) == numbers.get(i+1)){
                x = numbers.get(i);
                break;
            }
        }
        for (Integer arrayAdd:numbers){
            numberSet.add(arrayAdd);
        }

        System.out.println("First repeating element is: " + x );
        System.out.println("Our Set is: " + numberSet);
        System.out.println("The original List is: " + numbers );

    }
}
