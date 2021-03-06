public class DeleteNode {

    // HERE WE ARE GIVEN ACCESS ONLY TO NODE TO BE DELETED
    // NO ACCESS TO HEAD
    // TO BE DELETED NODE IS NOT TAIL NODE
    // NODE STRUCTURE :- CONTAINS NEXT AND INT VAL;

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
