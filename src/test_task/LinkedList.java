package test_task;

import java.util.HashSet;

public class LinkedList {
    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    public void partitionList(int x) {
        if (head == null) return;

        Node less = new Node(0);
        Node greater = new Node(0);

        Node lessTail = less;
        Node greaterTail = greater;

        Node current = head;

        while (current != null) {
            if (current.value < x) {
                lessTail.next = current;
                lessTail = current;
            } else {
                greaterTail.next = current;
                greaterTail = current;
            }

            current = current.next;
        }

        greaterTail.next = null;
        lessTail.next = greater.next;

        head = less.next;
    }

    public void removeDuplicates() {
        HashSet<Integer> values = new HashSet<>();

        Node previous = null;
        Node current = head;

        while (current != null) {
            if (values.contains(current.value)) {
                previous.next = current.next;
                length--;
            } else {
                values.add(current.value);
                previous = current;
            }
            current = current.next;
        }
    }

    public void reverseBetween(int m, int n) {
        if (head == null || m >= n) {
            return;
        }

        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        for (int i = 0; i < m; i++) {
            prev = prev.next;
        }

        Node start = prev.next;
        Node then = start.next;

        for (int i = 0; i < n - m; i++) {
            start.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = start.next;
        }

        head = dummy.next;
    }
}
