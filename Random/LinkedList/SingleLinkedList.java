package com.LinkedList;

import java.util.Scanner;

public class SingleLinkedList {
    static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public Node InsertionBeg(Node head,int data){
        Node newnode=new Node(data);
        if(head==null)return newnode;
        else{
            newnode.next=head;
            return newnode;
        }
    }
    public void traversal(Node head){
        if(head==null) return;
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList LL=new SingleLinkedList();
        Node head=null;
        while(true){
            int data = sc.nextInt();
            if(data==-1)break;
            head=LL.InsertionBeg(head,data);
        }

        LL.traversal(head);
    }
}

