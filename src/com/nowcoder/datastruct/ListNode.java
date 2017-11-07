package com.nowcoder.datastruct;


public class ListNode {

    public int val;
    public ListNode next = null;
    public ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        StringBuffer str=new StringBuffer();
        ListNode temp=this;
        while (temp!=null){
            str.append(temp.val+"->");
            temp=temp.next;
        }
        str.append("end");

        return str.toString();
    }
}
