package org.cz.code;

import org.cz.entity.ListNode;
import org.junit.Test;

/**
 * 用递归的思维反转链表
 * https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/
 *
 */
public class C001FanZhuanLianBiao implements TestInterface{

    @Test
    public void testThis() {
        ListNode head = ListNode.getListNode();
        head.doSystemOut();

        // 反转整个链表
        ListNode last =  reveres(head);
        last.doSystemOut();

        // 反转前 n 个链表
        ListNode lastN =  reveresN(head, 3);
        lastN.doSystemOut();
    }

    /**
     *
     * 用递归反转前 n 个链表
     * @param head
     * @param n
     * @return
     * reveres(2->1->4->5->3->null, 3)  =>     5 > 3 > null
     *                                         ^
     *                                         2 < 1 < 4 < lastN
     *
     */
    private ListNode reveresN(ListNode head, int n) {
        return null;
    }


    /**
     * 用递归反转链表
     * @param head
     * @return
     *
     * reveres(2->1->4->5->3->null)  =>   null<-2<-1<-4<-5<-3
     *
     *
     */
    private ListNode reveres(ListNode head) {
        if (head.next == null){
            return head;
        }
        /**
         *  2->reveres(1->4->5->3->null) =>
         *                                null<-1<-4<-5<-3<-reveres
         *                                      ^
         *                                      2
         *
          */
        ListNode reveres = reveres(head.next);
        head.next.next = head;
        head.next = null;
        return reveres;
    }
}
