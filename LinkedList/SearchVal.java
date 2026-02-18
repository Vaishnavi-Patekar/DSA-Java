public class SearchVal {
     public static class Node{

       int data;
       Node next;

       Node (int val){
        this.data = val;
        this.next = null;
       }

    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        Node head = n1;
           
    
        System.out.println(searchK(head, 30));
    
    
    }

    public static boolean searchK(Node head, int K){
      
       Node temp = head;

       while(temp != null){
        if(temp.data == K) {
            return true;
        }
         temp = temp.next; 
       }
       return false;

    }



}
