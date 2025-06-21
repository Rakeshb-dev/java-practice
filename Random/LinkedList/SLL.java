package com.LinkedList;

import java.util.Scanner;

public class SLL {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private Node InsertionEnd(Node head, int data) {
        Node newnode=new Node(data);
        if(head==null) return newnode;
        else{
            Node temp=head;
            while (temp.next!=null)temp=temp.next;
            temp.next=newnode;
            return head;
        }
    }
    public void Traversal(Node head){
        if(head==null) return;
        else{
            while (head!=null){
                System.out.print(head.data+" ");
                head=head.next;
            }
        }
    }
    public Node SortedInsertion(Node head,int data){
        Node newnode=new Node(data);
        if(head==null) return newnode;
        else{
            Node temp=head,prev=null;
            while (temp!=null){
                if(newnode.data<temp.data) break;
                prev=temp;
                temp=temp.next;
            }
            if(temp==head)
            {
                newnode.next=head;
                return newnode;
            }
            else if(temp==null){
                prev.next=newnode;
                return head;
            }
            else{
                prev.next=newnode;
                newnode.next=temp;
                return head;
            }
        }
    }
    public Node DeletionBegin(Node head){
        if(head==null) return null;
        else return head.next;
    }
    public Node DeletionEnd(Node head){
        if(head==null) return null;
        else{
            Node temp=head,prev=null;
            while (temp.next!=null){
                prev=temp;
                temp=temp.next;
            }
            prev.next=null;
            return head;
        }
    }
    public Node Search_Deletion(Node head,int sedata){
        if(head==null) return null;
        else{
            Node temp=head,prev=null;
            while (temp!=null){
                if(sedata==temp.data)break;
                prev=temp;
                temp=temp.next;
            }
            if(temp==head)
            {
                return head.next;
            }
            else if(temp==null){
                System.out.println("Not Exit "+sedata);
                return head;
            }
            else{

                prev.next=temp.next;
                return head;
            }
        }
    }
    public Node reversing(Node head){
        if(head==null) return null;
        else{
            Node work=head;
            Node newnext=null;
            while (work!=null){
                Node safe=work.next;
                work.next=newnext;
                newnext=work;
                work=safe;
            }
            head=newnext;
            return head;
        }
    }
    public static void main(String[] args){
        Scanner d=new Scanner(System.in);
        SLL LL=new SLL();
        Node head=null;
        while (true){
            int data=d.nextInt();
            if(data==-1)break;
            head=LL.InsertionEnd(head,data);
//         head=LL.SortedInsertion(head,data);
        }
        LL.Traversal(head);
//      head=LL.DeletionBegin(head);
//      head=LL.DeletionEnd(head);
//      head=LL.Search_Deletion(head,d.nextInt());
//      System.out.println("\nAfter deletion");
        head=LL.reversing(head);
        System.out.println("After Reversing ");
        LL.Traversal(head);
    }


}
