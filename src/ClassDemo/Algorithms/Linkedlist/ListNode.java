package ClassDemo.Algorithms.Linkedlist;

import java.util.List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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

      public static ListNode oddEvenlist(ListNode head){
          if(head.next == null){
              return head;
          }
          ListNode dummyHead = new ListNode(0);
          dummyHead.next = head;
          ListNode odd = head;
          ListNode evenHead = head.next;
          ListNode even = head.next;
          while(odd!=null && even != null){
              if(even.next != null){
                  odd.next = even.next;
                  odd = odd.next;
              } else break;
              if(odd.next != null){
                even.next = odd.next;
                even = even.next;
              } else {
                  even.next = null;
                  break;
              }
          }
          odd.next = evenHead;

          return dummyHead.next;
      }

    public static ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode temp = dummyHead;
        while(temp != null){
            if(temp.next!= null && temp.next.next != null){
                ListNode n1 = temp.next;
                ListNode n2 = temp.next.next;
                n1.next = n2.next;
                n2.next = n1;
                temp.next = n2;
                temp = n1;
            }
            else break;
        }
        return dummyHead.next;

    }

    public static void main(String[] args) {
        ListNode listNode4 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode1 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode4.next = listNode2;
        listNode2.next = listNode1;
        listNode1.next = listNode3;
        listNode3.next = listNode5;
        ListNode result = sortList(listNode4);
        //System.out.println(isPalindrome(listNode2));
        //System.out.println(addTwoNumbers(listNode4, listNode4).next.next.val);
        //System.out.println(oddEvenlist(listNode4).next.val);
        swapPairs(listNode4);

    }
 }