public class RemoveAt {
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
           
        head = removeAtIndex(head,3);
        
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }


    
    }

    public static Node removeAtIndex(Node head, int index){
         if(head == null){
            return null;
         }

         if(index == 0){
            return head.next;
         }


         Node temp = head;
         
        for(int i = 0;i<index-1;i++){
            if(temp.next == null) return head;
            temp = temp.next;
        }

        if(temp.next != null){
            temp.next = temp.next.next;
        }
       
          return head;
       

    }

}
