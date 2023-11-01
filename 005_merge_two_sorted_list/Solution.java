/**
 *  You are given the heads of two sorted linked lists list1 and list2.
    Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

    Example 1:
        Input: list1 = [1,2,4], list2 = [1,3,4]
        Output: [1,1,2,3,4,4]

    Example 2:
        Input: list1 = [], list2 = []
        Output: []
        
    Example 3:
        Input: list1 = [], list2 = [0]
        Output: [0]
 */
public class Solution {
        public static void main(String[] args) {
            ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
            ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
            System.out.println(l1.toString());
            ListNode listsMerged = mergeTwoList(l1, l2);
            System.out.println(listsMerged.toString());
        }

        public static ListNode mergeTwoList(ListNode l1, ListNode l2){
            if(l1 == null) return l2;
            if(l2 == null) return l1;
            if (l1.val < l2.val) {
                l1.next = mergeTwoList(l1.next, l2);
                return l1;
            }

            l2.next = mergeTwoList(l1, l2.next);
            return l2;
        }
}
