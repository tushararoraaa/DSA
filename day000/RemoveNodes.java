public class RemoveNode{
    public static void main(String[] args) {
        ListNode temp = head;
    
        while(temp!=null){
            ListNode temp2 = temp.next;
            if(temp2.val == val){
                temp.next = temp2.next;
            }
            temp = temp.next;
        }
    }
}