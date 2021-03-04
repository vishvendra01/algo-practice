public class FindLoopInLinkedList {
    static class LinkedList{
        public int value;
        public LinkedList next;

        public LinkedList(int value){
            this.value = value;
        }
    }

    public static boolean solution1(LinkedList linkedList){
        LinkedList head = linkedList;
		if(head == null || head.next == null) return false;
		
        LinkedList slow = head;
        LinkedList fast = head.next;
		
		while(fast != null){
            if(slow == fast){
                return true;
            }

            slow = slow.next;
            fast = fast.next.next;
        }
		
		return false;
    }

    public static void main(String[] args){

    }
}
