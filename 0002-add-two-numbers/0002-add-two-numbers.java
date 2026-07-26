class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp = l1;
        ListNode temp2 = l2;
        int carry = 0;

        ListNode dummy = new ListNode(-1);
        ListNode newll = dummy;

        while (temp != null || temp2 != null || carry != 0) {

            int val1 = 0;
            int val2 = 0;

            if (temp != null) {
                val1 = temp.val;
            }

            if (temp2 != null) {
                val2 = temp2.val;
            }

            int res = val1 + val2 + carry;
            carry = res / 10;

            newll.next = new ListNode(res % 10);
            newll = newll.next;

            if (temp != null) {
                temp = temp.next;
            }

            if (temp2 != null) {
                temp2 = temp2.next;
            }
        }

        return dummy.next;
    }
}