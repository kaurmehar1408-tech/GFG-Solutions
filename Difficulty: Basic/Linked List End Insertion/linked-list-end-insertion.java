/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node newNode = new Node(x);
        if(head==null){
            head=newNode;
            
        }
        else{
        Node tail = head;
        while(tail.next != null){
        tail = tail.next;
        }
        tail.next = newNode;
        }
        return head;
    }
}