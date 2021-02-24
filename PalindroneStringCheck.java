public class PalindroneStringCheck {
    
    public boolean solution1(String input){
        int i = 0;
        int j = input.length() - 1;
        while(i < j){
            char left = input.charAt(i);
            char right = input.charAt(j);
            if(left != right){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args){
        PalindroneStringCheck obj = new PalindroneStringCheck();

        String inputs[] = {"pawan", "dalda", "xoox", "madam", "malayalam"};
        boolean outputs[] = {false, false, true, true, true};
        System.out.println("Solution 1");
        for(int i=0; i<inputs.length; i++){
            String input = inputs[i];
            boolean output = obj.solution1(input);
            boolean expectedOutput = outputs[i];
            if(output == expectedOutput){
                System.out.println(String.format("Success -> input :%s, output:%s", input, output));
            }else {
                System.out.println(String.format("Failed -> input :%s, output:%s, expected:%s", input, output, expectedOutput));
            }
        }
    }
    
}
