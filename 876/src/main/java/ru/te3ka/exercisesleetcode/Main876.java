package ru.te3ka.exercisesleetcode;

public class Main876 {
    public static void main(String[] args) {
//        ListNode listNode = new ListNode(1,
//                new ListNode(2,
//                        new ListNode(3,
//                                new ListNode(4,
//                                        new ListNode(5)))));

        ListNode listNode = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5,
                                                new ListNode(6))))));
        System.out.println(listNode);

        Solution solution = new Solution();
        ListNode middleListNode = solution.middleNode(listNode);

        System.out.println(middleListNode);
    }
}