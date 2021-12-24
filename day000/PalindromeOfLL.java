public class PalindromeOfLL {

    class Solution {
        public boolean isPalindrome(ListNode head) {
            ListNode temp = head;
            Stack<Integer> st = new Stack<Integer>();
            while (temp != null) {
                st.push(temp.val);
                temp = temp.next;
            }

            while (head != null) {
                if (head.val != st.pop()) {
                    return false;
                }
                head = head.next;
            }
            return true;

        }
    }

    public static void main(String[] args) {

    }
}
