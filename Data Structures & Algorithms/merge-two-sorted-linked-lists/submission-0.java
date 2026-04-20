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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2 == null){
            return list1;
        } else if( list1==null && list2 !=null){
            return list2;
        } else if(list1!=null && list2==null){
            return list1;
        } else{
            if(list2.val < list1.val){
                ListNode temp = list1;
                list1 = list2;
                list2 = temp;
            }
            ListNode curr1 = list1;
            ListNode curr2 = list2;
            ListNode head = list1;
            ListNode prev = null;
        while(curr1!=null && curr2!=null){
            
            if(curr1.val <= curr2.val){
                prev = curr1;
                curr1 = curr1.next;
            } else if(curr2.val < curr1.val){
                ListNode temp2 = curr2;
                curr2 = curr2.next;
                temp2.next = curr1;
                if(prev!=null){
                    prev.next = temp2;
                }
                prev = temp2;
            }
        }
        if(curr2!=null){
            prev.next = curr2;
        }
        return head;
        }
        
    }
}