package pl.matrasbartosz.hackerrank_tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class LinkedListDelete {
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

    private static class SinglyLinkedListPrintHelper {
        public static void printList(SinglyLinkedListNode node, String sep) {
            while (node != null) {
                System.out.print(node.data);
                node = node.next;
                if (node != null) {
                    System.out.print(" " + sep);
                }
            }
        }
    }

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        SinglyLinkedListNode currentNode = llist;
        SinglyLinkedListNode tempNode;
        for (int i = 0; i < position - 1; i++) {
            if (currentNode.next != null)
                currentNode = currentNode.next;
        }
        if (position == 0) {
            llist = llist.next;
        }else {
            tempNode = currentNode.next;
            if(tempNode != null)
                currentNode.next = tempNode.next;
        }
        return llist;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        SinglyLinkedList llist = new SinglyLinkedList();
        int llistCount = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, llistCount).forEach(i -> {
            try {
                int llistItem = Integer.parseInt(bufferedReader.readLine().trim());

                llist.insertNode(llistItem);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int position = Integer.parseInt(bufferedReader.readLine().trim());
        SinglyLinkedListNode llist1 = deleteNode(llist.head, position);
        SinglyLinkedListPrintHelper.printList(llist1, " ");
        bufferedReader.close();
    }
}
