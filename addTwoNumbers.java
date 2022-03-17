class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode zheng = new ListNode(0);
        ListNode shu = zheng;
        int jingwei = 0;
        while(l1 != null || l2 != null){
            int n1 = l1!=null ? l1.val:0;
            int n2 = l2 !=null ? l2.val:0;
            int sum = jingwei+n1+n2;
            jingwei = sum/10;
            sum = sum%10;
            shu.next = new ListNode(sum);
            shu = shu.next;

            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }

        }
        if (jingwei != 0){
            shu.next = new ListNode(jingwei);
        }
        return zheng.next;
    }
}
