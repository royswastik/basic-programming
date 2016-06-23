import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseListRecursive{
    
    static class Node{
        int data;
        Node next;
        Node(int data){
          this.data = data;
        }
    }
    
    public static void main(String[] args){
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        printList(node);
        Node reversed = reverse(node);
        printList(reversed);
    }
    
    public static Node reverse(Node node){
        if(node.next == null)
            return node;
        Node ret = reverse(node.next);
        node.next.next = node;
        node.next = null;
        return ret;
    }
    
    public static void printList(Node node){
        System.out.println();
        while(node != null){
            System.out.print(node.data+"  -> ");
            node = node.next;
        }
        System.out.println();
    }
}
