package org.cz.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// 单链表节点的结构
public class ListNode {
    public long val;
    public ListNode next;

    public ListNode(long x) {
        val = x;
    }

    public void doSystemOut(){
        List<String> list = new ArrayList<String>();
        ListNode curr = this;
        while (curr != null){
         list.add(curr.val + "");
         curr = curr.next;
        }
        System.out.println(String.join("\t", list));
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

    public static ListNode getListNode(){
        ListNode cur = new ListNode(Math.round(Math.random() * 50));
        ListNode head = cur;
        for (int i = 0; i <9; i++) {
            cur.next = new ListNode(Math.round(Math.random() * 50));
            cur = cur.next;
        }
        return head;
    }
}