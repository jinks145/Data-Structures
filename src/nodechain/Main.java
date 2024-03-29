package nodechain;

public class Main {

    public static void main(String[] args) {

    Linkedlist list = new Linkedlist();
    list.addFirst(new Node(3));
        list.addFirst(new Node(5));
        list.addFirst(new Node(3));
        list.addFirst(new Node(7));


        list.addLast(new Node(2));
        list.addLast(new Node(4));
        list.addLast(new Node(8));
        printlist(list.head);

        while(list.head != null){
             list.remove(list.head);
        }
        printlist(list.head);
    }


    public static void printlist(Node head){
        Node p = head;

        if(p == null){
            System.out.println("empty");
            return;
        }

        while(p != null){
            System.out.println(p.n);
            p = p.next;
        }
    }
}
