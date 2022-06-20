package array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args){
        System.out.println(solution1(new int[]{1, 2, 3, 1}));
    }

    public static boolean solution1(int[] input){
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<input.length; i++){
            if(set.contains(input[i])){
                return true;
            }
            set.add(input[i]);
        }
        return false;
    }
}
