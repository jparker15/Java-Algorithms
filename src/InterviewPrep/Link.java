package InterviewPrep;

import org.w3c.dom.Node;

public class Link {
    public static Node insert(Node head, int data) {
        //Complete this method
        //create a Node
        //if head == null then head = new node
        //else head.next

        Node newNode = new Node(data);
        if(head == null){
            return newNode;
        }
        Node trav = head;
        while(trav.next != null){
            trav = trav.next;
        }
        trav.next = newNode;
        return head;

    }
}
