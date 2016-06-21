package add2nbs;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

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
public class AddTwoNumbersTest {
    @Test
    public void two_single_list_added_as_one_single_list() {
        //Arrange
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(1);

        //Act
        ListNode expected = new ListNode(2);
        ListNode added = addTwoNumbers.addTwoNumbers(firstNode, secondNode);

        //Assert
        assertEquals(added.val, expected.val);
    }

    @Test
    public void two_single_list_added_over10_as_one_single_list() {
        //Arrange
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode firstNode = new ListNode(5);
        ListNode secondNode = new ListNode(5);

        //Act
        ListNode expected = new ListNode(0);
        expected.next = new ListNode(1);
        ListNode added = addTwoNumbers.addTwoNumbers(firstNode, secondNode);

        //Assert
        assertEquals(expected.val, added.val);
        assertEquals(expected.next.val, added.next.val);
    }
    @Test
    public void list_with_different_length_18_0_added_as_one_single_list() {
        //Arrange
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode firstNode = new ListNode(1);
        firstNode.next = new ListNode(8);
        ListNode secondNode = new ListNode(0);

        //Act
        ListNode expected = new ListNode(1);
        expected.next = new ListNode(8);
        ListNode added = addTwoNumbers.addTwoNumbers(firstNode, secondNode);

        //Assert
        assertEquals(expected.val, added.val);
        assertEquals(expected.next.val, added.next.val);
    }


    @Test
    public void two_list_243_564_with_three_element_added_over10_as_one_single_list_708() {
        //Arrange
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode firstNode = new ListNode(2);
        firstNode.next = new ListNode(4);
        firstNode.next.next = new ListNode(3);

        ListNode secondNode = new ListNode(5);
        secondNode.next = new ListNode(6);
        secondNode.next.next = new ListNode(4);

        //Act
        ListNode expected = new ListNode(7);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(8);
        ListNode added = addTwoNumbers.addTwoNumbers(firstNode, secondNode);

        //Assert
        assertEquals(expected.val, added.val);
        assertEquals(expected.next.val, added.next.val);
        assertEquals(expected.next.next.val, added.next.next.val);
        assertEquals(null, added.next.next.next);
    }
}
