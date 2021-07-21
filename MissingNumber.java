import java.util.Arrays;

public class MissingNumber {

    public static int solution1(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        if(nums[0] != 0){
            return 0;
        }

        if(nums[length-1] != length){
            return length;
        }

        int pre = nums[0];
        for(int i=1; i<=nums.length - 1; i++){
            int cur = nums[i];
            if(cur - pre != 1){
                return pre + 1;
            }
            pre = cur;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = new int[]{0, 5, 3, 2, 4};
        int result = solution1(arr);
        System.out.println(result);
    }
}
