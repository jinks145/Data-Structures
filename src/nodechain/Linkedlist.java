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

    public void remove(Node p){
        Node prev = null;
        Node curr = head;
        while(curr != null){
            if (curr.equals(p)){
                if(prev == null){
                    head = head.next;
                    break;
                   }
                   else if(curr.next == null){
                       tail = prev;
                }
                else{
                    prev.next = curr.next;
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
