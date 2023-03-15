public class MmustLinkedin {

    // Define the inner class for linked list operations
    private class LinkedList {
        Node head; // head of the linked list

        // Define the Node class for linked list operations
        private class Node {
            int data;
            Node next;

            Node(int d) {
                data = d;
                next = null;
            }
        }

        // Insert a new node at the beginning of the linked list
        public void push(int new_data) {
            Node new_node = new Node(new_data);
            new_node.next = head;
            head = new_node;
        }

        // Insert a new node after a given node in the linked list
        public void insertAfter(Node prev_node, int new_data) {
            if (prev_node == null) {
                System.out.println("The given previous node cannot be null");
                return;
            }
            Node new_node = new Node(new_data);
            new_node.next = prev_node.next;
            prev_node.next = new_node;
        }

        // Append a new node at the end of the linked list
        public void append(int new_data) {
            Node new_node = new Node(new_data);
            if (head == null) {
                head = new Node(new_data);
                return;
            }
            new_node.next = null;
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
            return;
        }

        // Delete a node with a given key from the linked list
        public void deleteNode(int key) {
            Node temp = head, prev = null;
            if (temp != null && temp.data == key) {
                head = temp.next;
                return;
            }
            while (temp != null && temp.data != key) {
                prev = temp;
                temp = temp.next;
            }
            if (temp == null) {
                return;
            }
            prev.next = temp.next;
        }

        // Print the linked list
        public void printList() {
            Node tnode = head;
            while (tnode != null) {
                System.out.print(tnode.data + " ");
                tnode = tnode.next;
            }
        }
    }

    // Create an object of the LinkedList class
    private LinkedList linkedList = new LinkedList();

    // Test the linked list operations
    public static void main(String[] args) {
        MmustLinkedin mmustLinkedin = new MmustLinkedin();
        mmustLinkedin.linkedList.append(6);
        mmustLinkedin.linkedList.push(7);
        mmustLinkedin.linkedList.push(1);
        mmustLinkedin.linkedList.append(4);
        mmustLinkedin.linkedList.insertAfter(mmustLinkedin.linkedList.head.next, 8);
        System.out.println("Created linked list is: ");
        mmustLinkedin.linkedList.printList();
        mmustLinkedin.linkedList.deleteNode(7);
        System.out.println("\nLinked list after deletion of 7: ");
        mmustLinkedin.linkedList.printList();
    }
}
