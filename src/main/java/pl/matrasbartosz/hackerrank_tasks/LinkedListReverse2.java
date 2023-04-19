package pl.matrasbartosz.hackerrank_tasks;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class LinkedListReverse2 {
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
                System.out.print(" " + sep);
            }
        }
    }


    private static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        List<SinglyLinkedListNode> singlyLinkedListNodes = new LinkedList<>();

        while (llist != null) {
            singlyLinkedListNodes.add(new SinglyLinkedListNode(llist.data));
            llist = llist.next;
        }

        SinglyLinkedListNode reverseNode = singlyLinkedListNodes.get(singlyLinkedListNodes.size()-1);
        SinglyLinkedListNode toReturnNode = reverseNode;
        for (int i = singlyLinkedListNodes.size()-2; i >= 0; i--){
            reverseNode.next = singlyLinkedListNodes.get(i);
            reverseNode = reverseNode.next;
        }
        return toReturnNode;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int tests = scanner.nextInt();
        for (int testsItr = 0; testsItr < tests; testsItr++) {
            SinglyLinkedList llist = new SinglyLinkedList();
            int llistCount = scanner.nextInt();
            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();
                llist.insertNode(llistItem);
            }
            SinglyLinkedListNode llist1 = reverse(llist.head);
            printSinglyLinkedList(llist1, " ");
        }
        scanner.close();
    }
}
