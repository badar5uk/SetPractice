import java.util.*;

public class UnionOfSets {
    /*
    Adds two sets together
     */
    static List<Integer> array1 = Arrays.asList(1,2,3,4,5);
    static List<Integer> array2 = Arrays.asList(6,7,8,9,10);
    static Set<Integer> setA = new HashSet<>(array1);
    static Set<Integer> setB = new HashSet<>(array2);

    public static void main(String[]args){
        union();
    }
    public static void union(){
        Set<Integer> intersection = new HashSet<>(setA);
        intersection.addAll(setB);
        System.out.println("The union of the two sets is:  " + intersection);
    }
}
