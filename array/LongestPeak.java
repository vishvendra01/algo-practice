package array;

public class LongestPeak {
    public static void main(String[] args){
        longestPeak(new int[]{1, 2, 3, 2, 1});
    }

    public static int longestPeak(int[] array) {
		if(array.length < 3) return 0;
		
        int largest = 0;
		int i = 1;
		while(i < array.length - 1){
			if(array[i] > array[i + 1] && array[i] > array[i - 1]){ // peak found
				
				int count = 1;
				int j = i;
				while(j > 0 && array[j] > array[j - 1]){
					j--;
					count++;
				}
				
				while(i < array.length - 1 && array[i] > array[i + 1]){
					i++;
					count++;
				}
				
				if(count > largest){
					largest = count;
				}
				
			}else{
				i++;
			}
		}
		
		return largest;
  }
}
