public class DeleteNode {

    public static void deleteNode(ListNode node) {
        int temp = node.next;
        node.val = temp;
        if (node.next.next != null) {
            node.next = node.next.next;
        } else {
            node.next = null;
        }
    }

    public static void main(String[] args) {
        deleteNode(node);
    }
}
