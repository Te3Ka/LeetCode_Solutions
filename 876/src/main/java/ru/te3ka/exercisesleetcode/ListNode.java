package ru.te3ka.exercisesleetcode;

public class ListNode {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        sb.append(val).append(" ");
        if (next != null)
            sb.append(next.toString());
        sb.append("]");
        return sb.toString();
    }
}
