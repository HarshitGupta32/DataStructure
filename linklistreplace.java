import java.util.ArrayList;

/**
 * Created by hgupta on 3/7/2017.
 */
public class linklistreplace {


      public static class ListNode {
        int val;
         ListNode next;
         ListNode(int x) { val = x; }
      }


        public static ListNode swapPairs(ListNode head) {

            if(head == null) return null;
            if(head.next == null) return head;
            ListNode slow = head;
            ListNode runner = head.next;
            slow.next = runner.next;
            runner.next = slow;
            head = runner;
            runner = slow.next;
            int i=0;

            while(true)
            {
                 if(i==0)
                 {

                     i++;
                 }
                 else
                 {
                     slow.next = runner.next;
                     slow = slow.next;
                     runner.next = slow;
                 }

                if(i==1)
                {

                }
                if(  slow.next!=null)
                {

                    ListNode temp=slow.next;
                    if(temp.next!=null)
                    {
                        runner = slow.next;
                    }
                    else
                        break;


                }
                else
                {
                    break;
                }
            }
            return head;

        }

        public static void main(String [] args)
        {
            int [] aaaaaa= new int[4];
            int aaaaa = aaaaaa.length;
            ArrayList<Integer> aaa = new ArrayList<>();
            boolean aa = aaa.contains(3);
            String s = "tuna";
            String as = "atun";
            String temp  = as+as;
            boolean v = temp.contains(s);
            char [] a = {'c','v','d'};
             //int s = a[0]^a[1];
            String ss = "sss"+String.valueOf(1);
            ListNode head= new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            ListNode hh = swapPairs(head);

        }
    }

