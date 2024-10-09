import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateChecker {
    /*
    Input: Takes an Array of integers as a list
    Output:  A boolean to check if any duplicates exit
    Process: - Create an Array of integers using Arrays.asList
             - convert it into a Set ( it will remove duplicates)
             - compare the size of the list to the Set.
     */
    static List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
    static Set<Integer> numberSet = new HashSet<>(numbers);
    public static void main(String[]args){
        Boolean checker = true;
        if(numberSet.size() == numbers.size() ){
            checker = false;
        }
        System.out.println("Does the Set contain duplicates: " + checker);
    }
}
