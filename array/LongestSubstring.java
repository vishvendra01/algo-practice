package array;

import java.util.*;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <= 0) return s.length();
        
        int ans = 1;
        int i = 0;
        int j = 1;
        while(j < s.length()){
            System.out.println("i:"+i);
            boolean unique = isUnique(i, j, s);
            if(unique){
                int length = (j - i) + 1;
                if(length > ans){
                    ans = length;
                }
                j++;
            }else{
                i++;
                j++;
            }
        }
        
        return ans;
    }
    
    private boolean isUnique(int left, int right, String s){
        Set<Character> set = new HashSet<Character>();
        for(int i = left; i<=right; i++){
            if(set.contains(s.charAt(i))){
                return false;
            }else{
                set.add(s.charAt(i));
            }
        }
        return true;
    }

    public static void main(String[] args){
        LongestSubstring obj = new LongestSubstring();
        obj.lengthOfLongestSubstring("abcabcbb");
    }
}
