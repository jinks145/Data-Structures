package nodechain;

public class Linkedlist {
    Node head, tail;
    public void addFirst(Node p){
        Node temp = head;
        if(temp == null){
            head = p;
            tail = p;
        }

        else{
            p.next = head;
            head = p;
        }
    }

    public void addLast(Node p){
        Node temp = tail;

        if(temp == null){
            head = p;
            tail = p;
        }

        else{
            tail.next = p;
            tail = p;
        }
    }
}
