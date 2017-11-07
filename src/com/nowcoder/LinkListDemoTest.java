package com.nowcoder;


import com.nowcoder.datastruct.ListNode;

public class LinkListDemoTest {
    @org.junit.Test
    public void printListFromTailToHead() throws Exception {
        LinkListDemo fd = new LinkListDemo();

        ListNode listNode = new ListNode(0);
        ListNode headNode = listNode;
        for (int i = 1; i < 10; i++) {
            ListNode temp = new ListNode(i);
            listNode.next = temp;
            listNode = listNode.next;
        }
        System.out.println(headNode.toString());
        System.out.println(fd.printListFromTailToHead(headNode).toArray());
    }

    @org.junit.Test
    public void push() throws Exception {
        LinkListDemo fd = new LinkListDemo();
        fd.push(1);
        fd.push(2);
        fd.push(3);
        fd.push(5);
        fd.push(4);
        assert fd.pop()==1;
        assert fd.pop()==2;

    }

    @org.junit.Test
    public void pop() throws Exception {
    }

}