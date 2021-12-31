package strings;

public class Urlify{
    public static String solution(String s, int length){
        char[] output = s.toCharArray();
        int i = output.length - 1;
        for(int j = length - 1; j >= 0; j--){
            if(output[j] == ' '){
                output[i] = '0';
                output[i-1] = '2';
                output[i-2] = '%';
                i -= 3;
            }else{
                output[i] = output[j];
                i--;
            }
        }
        return new String(output);
    }

    public static void main(String[] args){
        String output = solution("how are you    ", 11);
        String output2 = solution("how do you do      ", 13);
        System.out.println(output);
        System.out.println(output2);
    }
}