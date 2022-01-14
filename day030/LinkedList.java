public class LinkedList {

    public static class Node {
        int data;
        Node next;
    }

    public static class Linkedlist {
        Node head;
        Node tail;
        int size;

        public int size() {
            return size;
        }

        public void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public void reverse_iterative() {
            int i = 0;
            int j = size - 1;
            while (i <= j) {
                Node left = getNodeAt(i);
                Node right = getNodeAt(j);

                int temp = left.data;
                left.data = right.data;
                right.data = temp;

                i++;
                j--;
            }
        }

        public void reverse_pointer() {
            Node prev = null;
            Node curr = head;

            while (curr != null) {
                Node forward = curr.next;
                curr.next = prev;
                prev = curr;
                curr = forward;
            }
            Node temp = head;
            head = tail;
            tail = temp;
        }

        public int kthFromLast(int k) {
            Node slow = head;
            Node fast = head;
            int i = 0;
            while (i < k) {
                fast = fast.next;
                i++;
            }
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow.data;
        }
    }

    public static void main(String[] args) {

    }
}
