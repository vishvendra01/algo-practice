import java.util.Stack;

public class BalanceBrackets {
    public static boolean solution1(String str){
        Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			//System.out.println(ch);
			switch(ch){
				case '(':
				case '[':
				case '{':
					stack.push(ch);
					break;
				case ')':
					if(!stack.isEmpty() && stack.peek() == '('){
						stack.pop();
					}else{
						stack.push(ch);
					}
					break;
				case ']':
					if(!stack.isEmpty() && stack.peek() == '['){
						stack.pop();
					}else{
						stack.push(ch);
					}
					break;
				case '}':
					if(!stack.isEmpty() && stack.peek() == '{'){
						stack.pop();
					}else{
						stack.push(ch);
					}
					break;
			}
			//System.out.println(stack.size());
		}
        boolean empty = stack.isEmpty();
		//System.out.println(empty);
		return empty;
    }
}
