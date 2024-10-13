import java.util.*;

public class PairWithSum {

    /*
    Input: Take an Integer Array into a set, A user input of an integer
    Output: tries to find 2 integers from the array that can be summed to get the user input
    Process: - Taking an integer array as a set
             - A for loop that goes through the numbers and sums them
             - if statement to return true or false
     */

    static Set<Integer> numbers = new TreeSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
    public static void main(String[]args){
        System.out.println(sumChecker());
    }

    public static Integer scannerInp(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your set of numbers are: " + numbers);
        System.out.print("Enter target sum: ");
        Integer userInp = scanner.nextInt();
        return userInp;
    }

    public static Boolean sumChecker(){
        Integer targetSum = scannerInp();
        for (Integer num : numbers){
            Integer diff = targetSum - num;

            if(numbers.contains(diff)){
                return true;
            }
            numbers.add(num);
        }
        return false;
    }
}
