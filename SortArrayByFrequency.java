import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class SortArrayByFrequency {

    public static int[] solution1(int[] nums){
        Map<Integer, Integer> map = new HashMap();
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            list.add(nums[i]);
            int frequencey = map.getOrDefault(nums[i], 0);
            map.put(nums[i], frequencey + 1);
        }

        Collections.sort(list, new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                if(map.get(a) == map.get(b)){
                    if(a == b){
                        return 0;
                    }else if(a > b){
                        return -1;
                    }else{
                        return 1;
                    } 
                }else{
                    if(map.get(a) > map.get(b)){
                        return 1;
                    }else if(map.get(a) == map.get(b)){
                        return 0;
                    }else {
                        return -1;
                    }
                }
            }
        });

        for(int i=0; i<list.size(); i++){
            nums[i] = list.get(i);
        }

        return nums;
    }
}
