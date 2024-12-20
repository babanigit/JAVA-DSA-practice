import java.util.ArrayList;
import java.util.List;

public class ListNode {
  public static List<Integer> list1 = new ArrayList<>();
  public static List<Integer> list2 = new ArrayList<>();
  private int val;
  private ListNode next;

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null || list2 == null) 
      return list1 == null ? list2 : list1;
    if (list1.val > list2.val) {
      ListNode temp = list1;
      list1 = list2;
      list2 = temp;
    }
    list1.next = mergeTwoLists(list1.next, list2);
    return list1;
  }

  public static void main(String[] args) {
    list1.add(1);
    list1.add(2);
    list1.add(4);
    list2.add(1);
    list2.add(3);
    list2.add(4);

    // System.out.println(mergeTwoLists(list1, list2));

  }
}
