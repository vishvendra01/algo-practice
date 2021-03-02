import java.util.*;

public class FirstDuplicateValue {

    public static int solution1(int[] array){
        Set<Integer> set = new HashSet<Integer>();
        for(int i : array){
            if(set.contains(i)){
                return i;
            }
            set.add(i);
        }
        return -1;
    }

    public static void main(String[] args){
        int inputs1[][] = {
            {5,1,2,5,2},
            {1,2,3,4,5},
            {1,2,1,2,3,3}
        };
        int ouputs[] = {
            5, -1, 1
        };
        System.out.println("Solution 1");
        for(int i=0; i<inputs1.length; i++){
            int[] input1 = inputs1[i];
            int output = ouputs[i];
            int algoOutput = FirstDuplicateValue.solution1(input1);
            if(output == algoOutput){
                System.out.println(String.format("Success -> input1 :%s, output:%s", Arrays.toString(input1), output));
            }else {
                System.out.println(String.format("Failed -> input1 :%s, output:%s, expected:%s", Arrays.toString(input1), algoOutput, output));
            }
        }
    }
}
