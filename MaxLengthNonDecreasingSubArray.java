import java.util.Arrays;

public class MaxLengthNonDecreasingSubArray {

    public static int solution(int[] array){
        int maxSubArrayLength = Integer.MIN_VALUE;
        int currentSubArrayLength = 1;
        for(int i=1; i<array.length; i++){
            int preNumber = array[i - 1];
            int curNumber = array[i];
            if(curNumber >= preNumber){
                currentSubArrayLength++;
                if(currentSubArrayLength > maxSubArrayLength){
                    maxSubArrayLength = currentSubArrayLength;
                }
            }else{
                currentSubArrayLength = 1;
            }
        }
        return maxSubArrayLength;
    }

    public static void main(String[] args){
        int inputs1[][] = {
            {9, 1, 5, 7, 9},
            {3, 4, -2, 3},
            {5, 4, 9, 7, 1},
            {15, 4, 9, 7, 11, 8}
        };
        int ouputs[] = {
            4, 2, 2, 2
        };
        System.out.println("Solution 1");
        for(int i=0; i<inputs1.length; i++){
            int[] input1 = inputs1[i];
            int output = ouputs[i];
            int algoOutput = MaxLengthNonDecreasingSubArray.solution(input1);
            if(output == algoOutput){
                System.out.println(String.format("Success -> input1 :%s, output:%s", Arrays.toString(input1), output));
            }else {
                System.out.println(String.format("Failed -> input1 :%s, output:%s, expected:%s", Arrays.toString(input1), algoOutput, output));
            }
        }
    }
}
