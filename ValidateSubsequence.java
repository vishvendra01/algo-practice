import java.util.Arrays;
import java.util.List;

public class ValidateSubsequence {
    public boolean solution1(List<Integer> array, List<Integer> subsequence){
        int seqX = 0;
        for(int i=0; i<array.size(); i++){
            if(array.get(i) == subsequence.get(seqX)){
                seqX++;

                if(seqX == subsequence.size()){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        ValidateSubsequence obj = new ValidateSubsequence();


        List<Integer> array = Arrays.asList(1, 3, 4, 7, 9, 11);
        List<Integer> sequence = Arrays.asList(1, 4, 9);

        boolean output = obj.solution1(array, sequence);
        boolean expectedOutput = true;

        if(output == expectedOutput){
            System.out.println(String.format("Success -> array :%s, sequence:%s, output : %s", array.toString(), sequence.toString(), output));
        }else {
            System.out.println(String.format("Failed -> array :%s, sequence:%s, output :%s, expectedOuput : %s", array.toString(), sequence.toString(), output, expectedOutput));
        }
    }
}
