package solutions.add_two_number_LinkList;

public class AddToNumberLinkList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            ListNode sumListNode = new ListNode(0);
            ListNode curr = sumListNode;
            int carried = 0;
            while (l1 != null || l2 != null || carried != 0) {
                int x = l1 != null ? l1.val : 0;
                int y = l2 != null ? l2.val : 0;

                int sum = carried + x + y;
                carried = sum / 10;

                curr.next = new ListNode(sum % 10);
                curr = curr.next;
                if (l1 != null) l1 = l1.next;
                if (l2 != null) l2 = l2.next;
            }
            return sumListNode.next;
        }
    }

    class Sort {
        public void insertionSort(int[] arr) {
            int unSortedValue = 0;
            for (int i = 0; i < arr.length; i++) {
                unSortedValue = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > unSortedValue) {
                    arr[j + 1 ] = arr[j];
                    j--;
                }
                arr[j+1] = unSortedValue;
            }
        }
        public void quickSort(int[] arr) {

        }
    }
}
