package org.cz.code;

import org.cz.entity.TreeNode;
import org.junit.Test;

/**
 * 反转二叉树
 * https://leetcode-cn.com/problems/invert-binary-tree/
 *
 * void traverse(TreeNode root) {
 *     // 前序遍历
 *     traverse(root.left)
 *     // 中序遍历
 *     traverse(root.right)
 *     // 后序遍历
 * }
 *
 */
public class C003FanZhuanErChaShu implements TestInterface{


    @Override
    @Test
    public void testThis() {
        TreeNode treeNode = new TreeNode(0);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(2);
        treeNode.left.right = new TreeNode(3);
        TreeNode.doSystemOut(treeNode);
    }

    /**
     * 反转二叉树，
     * @param root
     */
    public void doThis(TreeNode root){
        if(root == null) return;

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        doThis(root.left);
        doThis(root.right);
    }

}
