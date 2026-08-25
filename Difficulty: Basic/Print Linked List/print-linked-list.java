/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public ArrayList<Integer> printList(Node head) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        if(head==null){
            return list;
        }
        
        while(head != null){
            list.add(head.data);
            head = head.next;
        }
        return list;
        
    }
}