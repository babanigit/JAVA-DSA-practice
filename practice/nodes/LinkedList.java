// Define the Node class
class Node {
    int data; // Data stored in the node
    Node next; // Reference to the next node in the list

    // Constructor to initialize the node with data
    public Node(int data) {
        this.data = data;
        this.next = null; // By default, the next reference is null
    }
}

public class LinkedList {
    Node head; // Head node of the linked list

    // Add a new node to the end of the list
    public void addNode(int data) {
        Node newNode = new Node(data); // Create a new node
        if (head == null) {
            head = newNode; // If the list is empty, set head to the new node
        } else {
            Node temp = head; // Start from the head
            while (temp.next != null) {
                temp = temp.next; // Traverse to the end of the list
            }
            temp.next = newNode; // Add the new node at the end
        }
    }

    // Print all the nodes in the list
    public void printList() {
        Node temp = head; // Start from the head
        while (temp != null) {
            System.out.print(temp.data + " -> "); // Print the data
            temp = temp.next; // Move to the next node
        }
        System.out.println("null"); // End of the list
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.printList(); // Output: 10 -> 20 -> 30 -> null
    }
}
