package ru.te3ka.exercisesleetcode;

public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode quickPointer = head;
        ListNode slowPointer = head;

        while (quickPointer.next != null) {
            slowPointer = slowPointer.next;
            quickPointer = quickPointer.next;
            if (quickPointer.next != null)
                quickPointer = quickPointer.next;
        }

        return slowPointer;
    }
}
