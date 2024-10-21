import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CommonCharacters {
    /*
    Input: 2 Strings
    Output: The characters that appear in both strings
    Process: - Take an input string as a Scanner
             - convert the strings into character array
             - add the elements of the string ( as characters) into 2 sets
             - use an intersection function for characters
             - print the intersecting characters ( elements)
     */


    public static void main(String[] args) {
        System.out.println("Enter the first String: ");
        Scanner scanner = new Scanner(System.in);
        String firstInp = scanner.nextLine();
        System.out.println("Enter the second String: ");
        String secondInp = scanner.nextLine();
        charSet(firstInp,secondInp);
    }

    public static void charSet(String x, String y){
        // initializing Sets
        Set<Character> stringArray1 = new HashSet<>();
        Set<Character> stringArray2 = new HashSet<>();

        x = x.toLowerCase();
        y = y.toLowerCase();
        char[] firstArray = x.toCharArray();
        char[] secondArray = y.toCharArray();

        for (Character testarray: firstArray){
            stringArray1.add(testarray);
        }
        for (Character testarray: secondArray){
            stringArray2.add(testarray);
        }
        Set<Character> intersection = new HashSet<>(stringArray1);
        intersection.retainAll(stringArray2);
        System.out.println("The letters: "+intersection+ " appear in both strings");
    }
}