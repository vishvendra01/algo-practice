import java.util.Arrays;

public class MajorityElement {

    public static int solution1(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static void main(String[] args){
        int[] nums1 = new int[] {1, 2, 3, 1, 1, 1};
        int result1 = solution1(nums1);
        System.out.println(result1);
    }
}
