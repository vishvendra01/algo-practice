import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {

    public int[] solution1(int[] input, int sum){
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<input.length; i++){
            int number = input[i];
            int secondNumber = sum - number;
            if(set.contains(secondNumber)){
                return new int[]{number, secondNumber};
            }
            set.add(input[i]);
        }

        return new int[]{};
    } 
    
    public int[] solution2(int[] input, int sum){
        Arrays.sort(input);
        int left = 0;
        int right = input.length - 1;
        while(left < right){
            int targetSum = input[left] + input[right];
            if(targetSum == sum){
                return new int[]{input[left], input[right]};
            }else if(targetSum < sum){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args){
        TwoSum twoSum = new TwoSum();

        int inputs1[][] = {
            {2, 1, 5, 7, 9},
            {3, 4, -2, 3},
            {5, 4, 9, 7, 1},
            {5, 4, 9, 7, 1, 8}
        };
        int inputs2[] = {3, 1, 11, 25};
        int ouputs[][] = {
            {1, 2}, {-2, 3}, {7, 4}, {}
        };
        System.out.println("Solution 1");
        for(int i=0; i<inputs1.length; i++){
            int[] input1 = inputs1[i];
            int input2 = inputs2[i];
            int[] output = ouputs[i];
            int[] algoOutput = twoSum.solution2(input1, input2);
            if(Arrays.equals(output, algoOutput)){
                System.out.println(String.format("Success -> input1 :%s, input2: %s, output:%s", Arrays.toString(input1), input2, Arrays.toString(output)));
            }else {
                System.out.println(String.format("Failed -> input1 :%s, input2: %s, output:%s, expected:%s", Arrays.toString(input1), inputs2, Arrays.toString(algoOutput), Arrays.toString(output)));
            }
        }
    }
}
