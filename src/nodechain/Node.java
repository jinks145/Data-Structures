package nodechain;


     class Node{
        int n;
        Node next;

        Node(int num){
            n = num;
        }

         @Override
         public boolean equals(Object obj) {
             if(obj instanceof Node)
             return ((Node)obj).n == this.n;
             else
                 return false;
         }
     }

