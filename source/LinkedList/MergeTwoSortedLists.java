class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(-1); // create a dummy node
        ListNode finalResult = result;
        while(list1 != null && list2 != null) {
            // compare and insert values
            if(list1.val <= list2.val) {
                result.next = list1;
                list1 = list1.next;
            } else {
                result.next = list2;
                list2 = list2.next;
            }
            result = result.next;
        }
        
        // add remaining values
        if(list1 == null) {
            result.next = list2;
        } else {
            result.next = list1;
        }
        return finalResult.next;
    }
}