package ru.te3ka.exercisesleetcode;

public class Main21 {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(4, new ListNode(4)));

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

        Solution solution = new Solution();
        System.out.println(solution.mergeTwoLists(list1, list2));
    }
}