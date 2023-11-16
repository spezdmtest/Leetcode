package com.griddynamics.Reverse_Linked_List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 * Example 2:
 * <p>
 * <p>
 * Input: head = [1,2]
 * Output: [2,1]
 * Example 3:
 * <p>
 * Input: head = []
 * Output: []
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is the range [0, 5000].
 * -5000 <= Node.val <= 5000
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {
    public ListNode reverseList(ListNode head) {
        // 1 -> 2 -> 3 -> null;
        // null <- 1 <- 2 <- 3;
        ListNode previousNode = null;
        ListNode currentNode = head;
        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }
}

class SolutionTest {
    @Test
    public void testReverseList() {
        Solution solution = new Solution();
        ListNode list1 = null;
        ListNode reversed1 = solution.reverseList(list1);
        assertNull(reversed1);

        ListNode list2 = new ListNode(1);
        ListNode reversed2 = solution.reverseList(list2);
        assertEquals(1, reversed2.val);
        assertNull(reversed2.next);

        ListNode list3 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode reverse3 = solution.reverseList(list3);
        assertEquals(3, reverse3.val);
        assertEquals(2, reverse3.next.val);
        assertEquals(1, reverse3.next.next.val);
        assertNull(reverse3.next.next.next);
    }
}
