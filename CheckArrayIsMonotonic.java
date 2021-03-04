public class CheckArrayIsMonotonic {
    public static boolean isMonotonic(int[] array) {
		if(array.length == 0 || array.length == 1) return true;
    
		int i = 1;
		boolean increasing = true;
		while(i < array.length){
			int preNumber = array[i - 1];
			int curNumber = array[i];
			
			if(curNumber < preNumber){
				increasing = false;
				break;
			}
			
			i++;
		}
		
		if(increasing) return true;
		
		i = 1;
		boolean decreasing = true;
		while(i < array.length){
			int preNumber = array[i - 1];
			int curNumber = array[i];
			
			if(curNumber > preNumber){
				decreasing = false;
				break;
			}
			
			i++;
		}
		
		if(decreasing) return true;
		
		return false;
  }
}
