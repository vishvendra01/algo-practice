import java.util.*;

public class RemoveDuplicatesFromLinkedList {
    static class LinkedList{
        public int value;
        public LinkedList next;

        public LinkedList(int value){
            this.value = value;
        }
    }

    public static LinkedList solution1(LinkedList linkedList){
        LinkedList head = linkedList;
		if(head == null || head.next == null) return linkedList;
		
		Set<Integer> set = new HashSet<Integer>();
		LinkedList pre = head;
		LinkedList cur = head.next;
		set.add(head.value);
		
		while(cur != null){
			if(set.contains(cur.value)){
				pre.next = cur.next;
				cur = pre.next;
			}else{
				set.add(cur.value);
				pre = cur;
				cur = cur.next;
			}
		}
		
		return head;
    }

    public static void main(String[] args){

    }
}
