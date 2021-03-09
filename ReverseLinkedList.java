import base.LinkedList;

public class ReverseLinkedList {

    public static LinkedList solution1(LinkedList head){
        LinkedList pre = null;
		LinkedList cur = head;
		LinkedList next = head;
		while(next != null){
			next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		return pre;
    }

    public static void main(String[] args){
        
    }
}
