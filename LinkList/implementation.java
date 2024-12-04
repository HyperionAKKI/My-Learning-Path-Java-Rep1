package LinkList;

public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
             }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;
        void insertEnd(int data){
            Node temp = new Node(data);
            if(head==null) {
            head =temp;
            }else {tail.next = temp;}
            tail=temp;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        void insertBegin(int data){
            Node temp = new Node(data);
            if(head==null){
                insertEnd(data);
            }else{
                temp.next=head;
                head=temp;

            }
        }
        void insertAt(int idx,int data) {
            Node temp = head;
            Node t = new Node(data);
            if(idx==0){
                insertBegin(data);
                return;
            }
            else if (idx >= this.size()) {
                insertEnd(data);
                if (idx>this.size()){
                    System.out.println("index larger then size of list , data appended at end of list...");
                }
                return;
            }
            for (int i = 1; i <= idx - 1; i++) {
                    temp = temp.next;
                }
                t.next = temp.next;
                temp.next = t;
        }
        int size(){
           Node temp = head;
           int count=0;
           while(temp!=null){
               count++;
               temp=temp.next;
           }
           return count;
        }
    }
    public static void main(String[] args) {
        linkedlist ll =new  linkedlist();
        ll.insertEnd(4);
        ll.insertEnd(5);
        ll.insertBegin(3);
        ll.insertBegin(90);
        ll.insertEnd(321);
        ll.insertAt(112,98989);
        ll.display();
        linkedlist l1= ll;

    }

}
