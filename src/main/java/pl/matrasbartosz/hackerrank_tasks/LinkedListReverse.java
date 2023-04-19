package pl.matrasbartosz.hackerrank_tasks;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class LinkedListReverse {
    private static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    private static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);
            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }
            this.tail = node;
        }
    }

    private static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
            if (node != null) {
                System.out.print(sep);
            }
        }
    }

    public static void reversePrint(SinglyLinkedListNode llist) {
        List<SinglyLinkedListNode> singlyLinkedListNodes = new LinkedList<>();

        while (llist != null) {
            singlyLinkedListNodes.add(llist);
            llist = llist.next;
        }

        for (int i = singlyLinkedListNodes.size()-1; i >= 0; i--){
            System.out.println(singlyLinkedListNodes.get(i).data);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int tests = scanner.nextInt();
        for (int testsItr = 0; testsItr < tests; testsItr++) {
            SinglyLinkedList llist = new SinglyLinkedList();
            int llistCount = scanner.nextInt();
            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();
                llist.insertNode(llistItem);
            }
            reversePrint(llist.head);
        }
        scanner.close();
    }

}
