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
    static Set<Character> stringArray1 = new HashSet<>();
    static Set<Character> stringArray2 = new HashSet<>();

    public static void main(String[] args) {
        System.out.println("Enter the first String: ");
        Scanner scanner1 = new Scanner(System.in);
        String firstInp = scanner1.nextLine();
        System.out.println("Enter the second String: ");
        Scanner scanner2 = new Scanner(System.in);
        String secondInp = scanner2.nextLine();
        charSet(firstInp,secondInp);
    }

    public static void charSet(String x, String y){
        x.toLowerCase();
        y.toLowerCase();
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