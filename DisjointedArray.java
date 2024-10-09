import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DisjointedArray {
    /*
    Input: Two arrays as a list
    Output:  A boolean to check if they are different (Disjointed)
    Process: - Create an Array of integers using Arrays.asList
             - convert it into a Set.
             - compare if set 1 is equals to set 2
     */
    static List<Integer> List1 = Arrays.asList(1,2,3,4,5,6,7);
    static List<Integer> List2 = Arrays.asList(1,2,3,4,5,6,7);
    static Set<Integer> numberSet1= new HashSet<>(List1);
    static Set<Integer> numberSet2= new HashSet<>(List2);
    public static void main(String[]args){
        Boolean checker = true;
        if(numberSet1.equals(numberSet2)){
            checker = false;
        }
        System.out.println("Are the two arrays Disjointed?  " + checker);
    }
}
