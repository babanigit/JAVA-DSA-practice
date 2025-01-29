// Node class for a singly linked list
class Node {
    int data; // Field to store the data
    Node next; // Pointer (reference) to the next node

    // Constructor to initialize the node
    public Node(int data) {
        this.data = data; // Assign data to the node
        this.next = null; // Initially, the next reference is null
    }
}

// Example usage
public class LinkedListExample {
    // Method to reverse the singly linked list
    public static Node reverseList(Node head) {
        Node previous = null; // Initially, there is no previous node
        Node current = head;  // Start with the head of the list
        Node next = null;     // To temporarily store the next node

        while (current != null) {
            next = current.next; // Save the next node
            current.next = previous; // Reverse the pointer of the current node
            previous = current; // Move the previous pointer forward
            current = next; // Move the current pointer forward
        }

        return previous; // New head of the reversed list
    }

    public static void main(String[] args) {
        // Create individual nodes
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);

        // Link the nodes
        node1.next = node2;
        node2.next = node3;

        // Print the original list
        System.out.print("Original List: ");
        Node current = node1;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");

        // Reverse the list
        Node reversedHead = reverseList(node1);

        // Print the reversed list
        System.out.print("Reversed List: ");
        current = reversedHead;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
