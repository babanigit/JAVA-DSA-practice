
public class MiddleOfTheLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int x) {
            val = x;
        }

        ListNode(int x, ListNode next) {
            val = x;
            this.next = next;
        }

    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null; // Previous node starts as null
        ListNode curr = head; // Current node starts at the head

        while (curr != null) {
            ListNode nextNode = curr.next; // Save the next node
            curr.next = prev; // Reverse the link
            prev = curr; // Move prev forward
            curr = nextNode; // Move curr forward
        }

        return prev; // New head of the reversed list
    }

    // Method to print the linked list
    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        MiddleOfTheLinkedList solution = new MiddleOfTheLinkedList();

        // Create a simple linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Print the original list
        System.out.print("Original list: ");
        solution.printList(head);

        // Reverse the list
        ListNode reversedHead = solution.reverseList(head);

        // Print the reversed list
        System.out.print("Reversed list: ");
        solution.printList(reversedHead);

    }

}
