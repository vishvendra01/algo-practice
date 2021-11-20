package array;

public class MaximumSubArray {
    public static void main(String[] args){
        int[] array = new int[]{
            1, 2, 3, -3, 7, -2
        };
        int output = solution2(array);
        System.out.println(output);
    }

    // kadane's algorithm // O(n)
    public static int solution2(int[] array){
        int currentSum = 0;
        int maxSum = 0;
        for(int i=0; i<array.length; i++){
            currentSum = currentSum + array[i];
            if(currentSum > maxSum){
                maxSum = currentSum;
            }

            if(currentSum < 0){
                currentSum = 0;
            }
        }

        return maxSum;
    }
}
