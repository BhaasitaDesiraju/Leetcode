class MiddleOfTheList {
    public ListNode middleNode(ListNode head) {
        ListNode newNode = head;
        int len = 0;
        while(newNode != null) {
            len++;
            newNode = newNode.next;
        }
        int mid = len/2, counter = 0;        
        while(head != null) {
            if(counter == mid) {
                return head;
            }
            head = head.next;
            counter++;
        }
        return null;
    }
}