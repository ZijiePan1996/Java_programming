package ClassDemo.Algorithms.Linkedlist;

import java.util.*;

public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

      public static ListNode sortList(ListNode head){
          return sortList(head, null);
      }

      public static ListNode sortList(ListNode head, ListNode tail){
          if(head == null){
              return head;
          }
          if(head.next == tail){
              head.next = null;
              return head;
          }
          ListNode slow = head, fast = head;
          while(fast != tail){
              slow = slow.next;
              fast = fast.next;
              if(fast != tail){
                  fast = fast.next;
              }
          }
          ListNode mid = slow;
          ListNode list1 = sortList(head, mid);
          ListNode list2 = sortList(mid, tail);
          ListNode sorted = merge(list1, list2);
          return sorted;
      }

      public static ListNode merge(ListNode head1, ListNode head2){
          ListNode dummyHead = new ListNode(0);
          ListNode temp = dummyHead, temp1 = head1, temp2 = head2;
          while(temp1 != null && temp2 != null){
              if(temp1.val <= temp2.val){
                  temp.next = temp1;
                  temp1 = temp1.next;
              } else {
                  temp.next = temp2;
                  temp2 = temp2.next;
              }
              temp = temp.next;
          }
          if(temp1 != null){
              temp.next = temp1;
          } else if(temp2 != null){
              temp.next = temp2;
          }
          return dummyHead.next;
      }

      public static ListNode reverse(ListNode head){
          ListNode prev = null;
          ListNode curr = head;
          while(curr != null){
              ListNode temp = curr.next;
              curr.next = prev;
              prev = curr;
              curr = temp;
          }
          return prev;
      }

      public static boolean isPalindrome(ListNode head){
          ArrayList<Integer> shadowlist = new ArrayList<>();
          ListNode curr = head;
          while(curr != null){
              shadowlist.add(curr.val);
              curr = curr.next;
          }
          int start = 0;
          int end = shadowlist.size()-1;
          while(start<end){
              if(shadowlist.get(start) == shadowlist.get(end)){
                  start++; end --;
                  continue;
              } else return false;
          }
          return true;
      }

      public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
          int carry = 0;
          ListNode p1 = l1;
          ListNode p2 = l2;
          ListNode dummyHead = new ListNode(0);
          ListNode head = dummyHead;
          while(p1 != null && p2 != null){
                  ListNode newNode = new ListNode((p1.val + p2.val + carry)%10);
                  carry = (p1.val + p2.val + carry)/10;
                  head.next = newNode;
                  head = newNode;
                  p1 = p1.next;
                  p2 = p2.next;
          }
          if(p1 == null){
              while(p2 != null){
                  ListNode newNodep2 = new ListNode((p2.val + carry)%10);
                  carry  = (p2.val+carry)/10;
                  head.next = newNodep2;
                  head = newNodep2;
                  p2 = p2.next;
              }
              if(carry == 1){
                  head.next = new ListNode(1);
              }
          }
          if(p2 == null){
              while(p1 != null){
                  ListNode newNodep1 = new ListNode((p1.val + carry)%10);
                  carry  = (p1.val+carry)/10;
                  head.next = newNodep1;
                  head = newNodep1;
                  p1 = p1.next;
              }
              if(carry == 1){
                  head.next = new ListNode(1);
              }
          }

          return dummyHead.next;
      }

      public static ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        Map<Integer, Integer> hashmap = new HashMap<>();
        while(head != null){
            if(!hashmap.containsKey(head.val)) {
                hashmap.put(head.val, 1);
                head = head.next;
            }
            else {
                hashmap.put(head.val, hashmap.get(head.val)+1);
                head = head.next;
            }
        }
        head = dummyHead;
        while(head != null && head.next != null){
            if(hashmap.get(head.next.val)>1){
                ListNode recur = head.next;
                while(recur.next != null && hashmap.get(recur.next.val)>1) {
                    recur = recur.next;
                }
                head.next = recur.next;
                head = head.next;
            }
            else head = head.next;
        }


        return dummyHead.next;
    }



    public static void main(String[] args) {
        ListNode listNode4 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode3 = new ListNode(2);
        listNode4.next = listNode2;
        listNode2.next = listNode1;
        listNode1.next = listNode3;
        ListNode result = sortList(listNode4);
        //System.out.println(isPalindrome(listNode2));
        //System.out.println(addTwoNumbers(listNode4, listNode4).next.next.val);
        System.out.println(deleteDuplicates(listNode4));

    }
 }