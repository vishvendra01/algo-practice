/**
 * Reverse words which are separated by space
 */

public class ReverseWords {

    public String solution1(String input){
        String trimmedInput = input.trim();
        String[] splitArray = trimmedInput.split(" ");
        int i = 0;
        int j = splitArray.length - 1;
        while(i < j){
            String temp = splitArray[j];
            splitArray[j] = splitArray[i];
            splitArray[i] = temp;
            i++;
            j--;
        }
        StringBuilder sb = new StringBuilder();
        for(i=0; i<splitArray.length - 1; i++){
            sb.append(splitArray[i]);
            sb.append(" ");
        }
        sb.append(splitArray[splitArray.length - 1]);
        return sb.toString();
    }

    public String solution2(String input){
        return null;
    }

    public String solution3(String input){
        return null;
    }

    public static void main(String[] args){
        ReverseWords reverseWords = new ReverseWords();

        String inputs[] = {"This is pawan", " Pawan is King "};
        String outputs[] = {"pawan is This", "King is Pawan"};
        System.out.println("Solution 1");
        for(int i=0; i<inputs.length; i++){
            String input = inputs[i];
            String output = reverseWords.solution1(input);
            String expectedOutput = outputs[i];
            if(output.equals(expectedOutput)){
                System.out.println(String.format("Success -> input :%s, output:%s", input, output));
            }else {
                System.out.println(String.format("Failed -> input :%s, output:%s, expected:%s", input, output, expectedOutput));
            }
        }
    }
}
