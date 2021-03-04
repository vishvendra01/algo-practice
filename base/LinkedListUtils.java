package base;

import java.util.List;


public class LinkedListUtils {

    public static LinkedList createLinkedList(List<Integer> list){
        if(list.isEmpty()) return null;

        LinkedList head = new LinkedList(0);
        LinkedList cur = head;
        for(int number : list){
            cur.next = new LinkedList(number);
            cur = cur.next; 
        }
        return head.next;
    }

    public static LinkedList getNode(LinkedList head, int index){
        if(head == null) return null;

        LinkedList cur = head;
        int i = 0;
        while(cur != null){
            if(i == index){
                return cur;
            }
            cur = cur.next;
            i++;
        }

        return null;
    }

    public static void printLinkedList(LinkedList head){
        if(head == null) System.out.println("NULL->");

        LinkedList cur = head;
        while(cur != null){
            System.out.print(cur.value);
            System.out.print("->");
            cur = cur.next;
        }
    }
}
