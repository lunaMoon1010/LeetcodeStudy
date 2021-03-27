package org.cz.entity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TreeNode {
    int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void doSystemOut(TreeNode root) {
        LinkedList<TreeNode> arrayList = new LinkedList<>();
        arrayList.add(root);
        while (!arrayList.isEmpty()) {
            TreeNode poll = arrayList.poll();
            System.out.println(poll.val);
            if (poll.left != null) {
                arrayList.add(poll.left);
            }

            if (poll.right != null) {
                arrayList.add(poll.right);
            }
        }
    }
}