package org.cz.code;

import org.cz.entity.ListNode;
import org.junit.Test;


/**
 * 判断回文链表
 *
 * @see https://leetcode-cn.com/problems/palindrome-linked-list/
 */
public class C002HuiWenLianBiao implements TestInterface {

    private ListNode left;

    @Override
    @Test
    public void testThis() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);
        head.doSystemOut();

        left = head;
        System.out.println(traverse(head));
    }

    /* 倒序打印单链表中的元素值 */
    boolean traverse(ListNode head) {
        if (head == null) return true;
        boolean result = traverse(head.next);
        // 后序遍历代码
        result = result && (head.val == left.val);
        // 左指针右移动
        left = left.next;
        return result;
    }
}
