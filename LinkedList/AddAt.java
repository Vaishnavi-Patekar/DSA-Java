public class AddAt {
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
           
        head = addAtIndex(head, 60 , 3);
        
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }


    
    }

    public static Node addAtIndex(Node head, int val , int idx){
          if(idx==0){
            Node n = new Node(val);
            n.next = head;
            return n;


          }

          Node temp = head;
          int count =0;

          while(temp != null && count<idx -1){
            temp = temp.next;
            count++;
          }

          if(temp==null){
            System.out.println("Index out of range");
            return head;
          }

          Node n = new Node(val);
          n.next = temp.next;
          temp.next = n;
          return head;
       

    }
}
