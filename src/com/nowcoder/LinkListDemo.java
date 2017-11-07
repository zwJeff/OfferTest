package com.nowcoder;

import com.nowcoder.datastruct.ListNode;

import java.util.ArrayList;
import java.util.Stack;

public class LinkListDemo {


    /**
     * 描述：输入一个链表，从尾到头打印链表每个节点的值。
     * <p>
     * url：https://www.nowcoder.com/practice/d0267f7f55b3412ba93bd35cfa8e8035?tpId=13&tqId=11156&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
     *
     * @param head
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode head) {
        ArrayList<Integer> result = new ArrayList<>();
        if (head == null)
            return result;
        ListNode p = head;
        ListNode q = head.next;
        if (q == null) {
            result.add(head.val);
            return result;
        }
        ListNode r = q;
        head.next = null;
        while (r != null) {
            r = r.next;
            q.next = p;
            p = q;
            q = r;
        }
//        System.out.println(p.toString());
        while (true) {
            result.add(p.val);
            if (p.next != null) {
                p = p.next;
            } else {
                break;
            }
        }
        return result;
    }


    /**
     * 描述：用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
     * url： https://www.nowcoder.com/practice/54275ddae22f475981afa2244dd448c6?tpId=13&tqId=11158&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
     */
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

}
