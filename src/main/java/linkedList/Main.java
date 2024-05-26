package linkedList;

public class Main {
   public static class Node {
       int data;
       Node next;
   }

   public static class LinkedList{
       Node head;
       Node tail;
       int size;

      public void addLast(int val)
       {
           Node temp = new Node();
           temp.data = val;
           temp.next = null;
             if(size == 0)
             {
                 head = tail = temp;
             }
             else{
                 tail.next = temp;
                 tail = temp;
             }
            size++;
       }

       public int size()
       {
           return size;
       }

       public void display()
       {
           Node temp = head;
           while(temp != null)
           {
               System.out.print(temp.data+" ");
               temp = temp.next;
           }
           System.out.println();
       }

       public void removeFirst()
       {
           if(size == 0) {
                System.out.println("list is empty");
           }else if(size == 1) {
               head = tail = null;
               size =0;
           }
           else {
               head= head.next;
               size--;
           }

       }

       public int getLast() {
           if(size == 0)
           {
               System.out.println("list is empty");
               return -1;
           }else{
               return tail.data;
           }
       }

       public int getAt(int index){
          if(size ==0){
              System.out.println("list is empty");
              return -1;
          }
          else if(index<0 || index>size){
              System.out.println("index out of bounds");
              return -1;
          }
          else{
              Node temp = head;
              for(int i=0 ; i<index ; i++)
              {
                  temp = temp.next;
              }
              return temp.data;
          }
       }

       public void addFirst(int val){
           Node temp = new Node();
           temp.data = val;
           temp.next = head;
           head = temp;
          if(size == 0){
             tail = temp;
          }
          size++;
       }

       public void addAt(int val, int index) {
           if(index<0 || index>size)
           {
               System.out.println("index out of bounds");
           }
           else if(index == 0){
                  addFirst(val);
           }
           else if(index == size) {
               addLast(val);
           }
           else {
               Node node = new Node();
               node.data = val;

               Node temp = head;
               for(int i=0 ; i<index ; i++)
               {
                   temp = temp.next;
               }
               node.next = temp.next;
               temp.next = node;

               size--;
           }
       }

       public void removeLast(){
          if(size == 0){
              System.out.println("list is empty");
          }
          else{
              Node temp = head;
              for(int i=0 ; i<size-1 ; i++)
              {
                  temp = temp.next;
              }
              tail = temp;
              temp.next = null;
              size--;
          }
       }

       public void removeAtIndex(int index){
          if(size == 0){
              System.out.println("list is empty");
          }
          else if(index<0 || index>size){
              System.out.println("index out of bounds");
          }
          else if(index == 0){
              removeFirst();
          }
          else if(index == size)
          {
              removeLast();
          }
          else {
              Node temp =  head;
              for(int i=0 ; i<index-1 ; i++)
              {
                  temp = temp.next;
              }
              temp.next = temp.next.next;
              size--;

          }
       }

       public void reverse() {
           int li =0;
           int ri = size-1;
           while(li<ri) {
               Node left = getNodeAt(li);
               Node right = getNodeAt(ri);

               int temp = left.data;
               left.data = right.data;
               right.data = temp;
               li++;
               ri--;
           }
       }

       private Node getNodeAt(int index) {
          Node temp = head;
          for(int i=0; i<index ; i++) {
              temp = temp.next;
          }
          return temp;
       }

       public int getKthElementFromTheEnd(int k) {
           Node slow = head;
           Node fast = head;

           for(int i=0 ; i<k ; i++){
               fast = fast.next;
           }
           while(fast!=tail) {
                 fast = fast.next;
                 slow = slow.next;
           }
           return slow.data;
       }

       public int middleOfLinkedList() {
           Node slow = head;
           Node fast = head;

           while(fast.next != null) {
               fast = fast.next.next;
               slow = slow.next;
           }
           return slow.data;
       }
   }
}
