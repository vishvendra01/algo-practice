import java.util.Arrays;

import base.LinkedList;
import base.LinkedListUtils;

public class FindLoopInLinkedList {

    public static boolean solution1(LinkedList linkedList){
        LinkedList head = linkedList;
		if(head == null || head.next == null) return false;
		
        LinkedList slow = head;
        LinkedList fast = head.next;
		
		while(fast != null && fast.next != null){
            if(slow == fast){
                return true;
            }

            slow = slow.next;
            fast = fast.next.next;
        }
		
		return false;
    }

    public static void main(String[] args){
        solution1_test1();
        solution1_test2();
    }

    public static void solution1_test1(){
        LinkedList input = LinkedListUtils.createLinkedList(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        if(solution1(input) == false){
            System.out.print("No Loop found in %s ");
            LinkedListUtils.printLinkedList(input);
        }else{
            System.out.print("Loop Found");
        }
        System.out.println();
    }

    public static void solution1_test2(){
        LinkedList input = LinkedListUtils.createLinkedList(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        LinkedListUtils.getNode(input, 6).next = LinkedListUtils.getNode(input, 2);

        if(solution1(input) == false){
            System.out.print("No Loop found in %s ");
            LinkedListUtils.printLinkedList(input);
        }else{
            System.out.print("Loop Found");
        }
        System.out.println();
    }
}
