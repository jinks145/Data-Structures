package DLinkedList;

public class DLinkedlist {
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
            p.prev = tail;
            tail = p;
        }
    }

    public void remove(Node p){
        Node prev = null;
        Node curr = head;
        while(curr != null){
            if (curr.equals(p)){
                if(prev == null){
                    head = head.next;
                    head.prev = null;
                    break;
                   }
                   else if(curr.next == null){
                       tail = curr.prev;
                       tail.next = null;
                }
                else{
                    prev.next = curr.next;
                    curr.prev = prev.prev;
                    break;
                }
                }else{
                head = null;
                tail = null;
                break;
            }



                prev = curr;
                curr = curr.next;
            }
    }
}
