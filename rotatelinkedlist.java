import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by hgupta on 3/25/2017.
 */
public class rotatelinkedlist {

     /// Definition for singly-linked list.
      public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }


        public static ListNode rotateRight(ListNode head, int k) {

            if(head.next == null && k==0)return head;
            ListNode root = head;
            ListNode runner= head;
            ListNode end = head;
            int count = 1;
            int length = 1;
            ArrayList<String> arr = new ArrayList<String>();
            arr.add("a");
            String s  ="index";
            //s.st

            while(end.next!=null && runner.next!=null)
            {
                if(count<k)
                {
                    runner = runner.next;
                    count++;
                }
                end = end.next;
                length++;

            }

            if(count>length)
                return null;
            ListNode temp = runner.next;
            end.next = root;
            runner.next =null;
            return temp;
        }

        public static void main(String [] args)
        {
            double k = Math.ceil((2.17));
            double c = Math.floor(3.14);
            ListNode n = new ListNode(1);
            n.next = new ListNode(2);
            n.next.next =new ListNode(3);
            n.next.next.next =new ListNode(4);
            n.next.next.next.next =new ListNode(5);
            n.next.next.next.next.next =new ListNode(6);

            ListNode a = rotateRight(n,4);


        }
    }

