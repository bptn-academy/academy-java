package week3.monday.arraylists;
import java.util.List;
import java.util.ArrayList;

public class Test1 {
    public static void shiftLeftOne(ArrayList<Integer> list) {
        //code here
        Integer firstElement = list.get(0);
        
        // Shift elements left by one position
        for (int i = 1; i < list.size(); i++) {
            list.set(i - 1, list.get(i));
        }
        
        // Place the first element at the end
        list.set(list.size() - 1, firstElement);
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        shiftLeftOne(values);
        System.out.println("Expected Result:\t [2, 3, 4, 5, 1]");
        System.out.println("Your Result:\t\t " + values);
    }
}
