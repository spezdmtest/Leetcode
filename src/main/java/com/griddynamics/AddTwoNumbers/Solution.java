package com.griddynamics.AddTwoNumbers;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * <p>
 * Example 2:
 * <p>
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * <p>
 * Example 3:
 * <p>
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 * <p>
 * Constraints:
 * The number of nodes in each linked list is in the range [1, 100].
 * 0 <= Node.val <= 9
 * It is guaranteed that the list represents a number that does not have leading zeros.
 */
public class Solution {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(243);
        ListNode l2 = new ListNode(564);
        ListNode listNode = addTwoNumbers(l1, l2);
        System.out.println(listNode);
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode pointer1 = l1, pointer2 = l2, currentNode = result;
        int dozenCarrier = 0;

        while (pointer1 != null || pointer2 != null) {
            int pointer1Value = (pointer1 == null) ? 0 : pointer1.val;
            int pointer2Value = (pointer2 == null) ? 0 : pointer2.val;

            int sum = pointer1Value + pointer2Value + dozenCarrier;
            dozenCarrier = sum / 10;
            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;


            if (pointer1 != null) {
                pointer1 = pointer1.next;
            }
            if (pointer2 != null) {
                pointer2 = pointer2.next;
            }
        }

        if (dozenCarrier > 0) {
            currentNode.next = new ListNode(dozenCarrier);
        }
        return result.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
