import java.util.*;

public class UnionOfSets {
    /*
    Adds two sets together
     */
    static Set<Integer> setA = new HashSet<>(Arrays.asList(1,2,3,4,5));
    static Set<Integer> setB = new HashSet<>(Arrays.asList(6,7,8,9,10));

    public static void main(String[]args){
        union(setA,setB);
    }
    public static void union(Set<Integer> set1, Set<Integer> set2 ){
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.addAll(set2);
        System.out.println("The union of the two sets is:  " + intersection);
    }
}
