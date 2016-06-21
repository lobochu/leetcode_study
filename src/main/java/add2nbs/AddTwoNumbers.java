package add2nbs;

/**
 * Created by Lobo on 2016/05/18 18:28.
 * You are given two linked lists representing two non-negative numbers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * <p/>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * <p/>
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode first = l1;
        ListNode second = l2;
        ListNode current = head;

        int carry = 0;
        while (first != null || second != null) {
            int x = asInteger(first);
            int y = asInteger(second);
            int digit = carry + x + y;
            carry = digit / 10;
            int currentValue = digit % 10;
            current.next = new ListNode(currentValue);
            current = getNext(current);
            if (first != null)
                first = getNext(first);
            if (second != null)
                second = getNext(second);
        }
        if (carry > 0)
            current.next = new ListNode(carry);
        return head.next;

    }

    private ListNode getNext(ListNode input) {
        input = input.next;
        return input;
    }

    private int asInteger(ListNode input) {
        return (input == null) ? 0 : input.val;
    }
}
