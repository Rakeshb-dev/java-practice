package com.LinkedList;
public class All_in_One {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insertion at beginning
    public Node insertAtBeginning(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    // Insertion at end
    public Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) return newNode;

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    // Sorted insertion (ascending order)
    public Node sortedInsert(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null || data < head.data) {
            newNode.next = head;
            return newNode;
        }

        Node current = head;
        while (current.next != null && current.next.data < data) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        return head;
    }

    // Deletion at beginning
    public Node deleteAtBeginning(Node head) {
        if (head == null) return null;
        return head.next;
    }

    // Deletion at end
    public Node deleteAtEnd(Node head) {
        if (head == null || head.next == null) return null;

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        return head;
    }

    // Search for a value
    public boolean search(Node head, int key) {
        while (head != null) {
            if (head.data == key) return true;
            head = head.next;
        }
        return false;
    }

    // Reverse the linked list
    public Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    // Traverse and print the linked list
    public void traversal(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
        public static void main(String[] args) {
            All_in_One list = new All_in_One();           // Create a linked list object
            Node head = null;               // Initialize head

            // 1. Insertion at Beginning
            head = list.insertAtBeginning(head, 30);
            head = list.insertAtBeginning(head, 20);
            head = list.insertAtBeginning(head, 10);

            System.out.print("After insertion at beginning: ");
            list.traversal(head);  // Output: 10 20 30

            // 2. Insertion at End
            head = list.insertAtEnd(head, 40);
            head = list.insertAtEnd(head, 50);

            System.out.print("After insertion at end: ");
            list.traversal(head);  // Output: 10 20 30 40 50

            // 3. Sorted Insertion
            head = list.sortedInsert(head, 25);

            System.out.print("After sorted insertion of 25: ");
            list.traversal(head);  // Output: 10 20 25 30 40 50

            // 4. Deletion at Beginning
            head = list.deleteAtBeginning(head);

            System.out.print("After deletion at beginning: ");
            list.traversal(head);  // Output: 20 25 30 40 50

            // 5. Deletion at End
            head = list.deleteAtEnd(head);

            System.out.print("After deletion at end: ");
            list.traversal(head);  // Output: 20 25 30 40

            // 6. Search
            System.out.println("Search 30: " + list.search(head, 30));  // Output: true
            System.out.println("Search 100: " + list.search(head, 100)); // Output: false

            // 7. Reverse
            head = list.reverse(head);

            System.out.print("After reversal: ");
            list.traversal(head);  // Output: 40 30 25 20
        }

        }


