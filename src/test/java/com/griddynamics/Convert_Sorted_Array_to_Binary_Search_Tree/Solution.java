package com.griddynamics.Convert_Sorted_Array_to_Binary_Search_Tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * /**
 * Given an integer array nums where the elements are sorted in ascending order, convert it to a
 * height-balanced binary search tree.
 * Input: nums = [-10,-3,0,5,9]
 * Output: [0,-3,9,-10,null,5]
 * Explanation: [0,-10,5,null,-3,null,9] is also accepted:
 * <p>
 * Input: nums = [1,3]
 * Output: [3,1]
 * Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums is sorted in a strictly increasing order.
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public TreeNode sortedArrayToBSD(int[] nums) {
        return buildSubBST(nums, 0, nums.length - 1);
    }

    private TreeNode buildSubBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode midNode = new TreeNode(nums[mid]);
        midNode.left = buildSubBST(nums, start, mid - 1);
        midNode.right = buildSubBST(nums, mid + 1, end);
        return midNode;
    }
}

class TreeNodeTest {
    @Test
    public void testSortedArrayToBST() {
        Solution solution = new Solution();
        int[] nums1 = {};
        TreeNode root1 = solution.sortedArrayToBSD(nums1);
        assertNull(root1);

        int[] nums2 = {5};
        TreeNode root2 = solution.sortedArrayToBSD(nums2);
        assertEquals(5, root2.val);
        assertNull(root2.left);
        assertNull(root2.right);

        int[] nums3 = {1, 2, 3, 4, 5, 6, 7};
        TreeNode root3 = solution.sortedArrayToBSD(nums3);
        assertTrue(isBST(root3));
        assertTrue(isBalanced(root3));
    }

    private boolean isBST(TreeNode root) {
        return isBST(root, null, null);
    }

    private boolean isBST(TreeNode node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }
        if ((min != null && node.val <= min) || (max != null && node.val >= max)) {
            return false;
        }

        return isBST(node.left, min, node.val) && isBST(node.right, node.val, max);
    }

    private boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
