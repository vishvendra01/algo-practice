public class RunLengthEncoding {

    public String solution1(String input){
        StringBuilder sb = new StringBuilder();
        int counter = 1;
        for(int i=1; i<input.length(); i++){
            char pre = input.charAt(i - 1);
            char cur = input.charAt(i);
            if(pre == cur){
                counter ++;
            }else {
                sb.append(counter);
                sb.append(pre);
                counter = 1;
            }
        }
        sb.append(counter).append(input.charAt(input.length() - 1));
        return sb.toString();
    }       

    public static void main(String[] args){
        RunLengthEncoding obj = new RunLengthEncoding();

        String inputs[] = {
            "aaaaaaaaaaaaabbbbbbbbbbbbbbc", "aabbcc", "aaacccddd", "cccddddffffjjj"
        };

        String expectedOutputs[] = {
            "13a14b1c","2a2b2c", "3a3c3d", "3c4d4f3j"
        };

        for(int i=0; i<inputs.length; i++){
            String input = inputs[i];
            String output = obj.solution1(input);
            String expectedOutput = expectedOutputs[i];
            if(output.equals(expectedOutput)){
                System.out.println(String.format("Success -> input :%s, output:%s", input, output));
            }else {
                System.out.println(String.format("Failed -> input :%s, output:%s, expected:%s", input, output, expectedOutput));
            }
        }
    }
}