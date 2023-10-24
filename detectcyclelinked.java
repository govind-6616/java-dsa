public class detectcyclelinked {
    int data;
    detectcyclelinked next;

    detectcyclelinked(int data) {
        this.data = data;
    }

    static void traverse(detectcyclelinked head) {
        int count = 0;
        while (head != null) {
            count += 1;
            System.out.println("value at " + count + " in linkedlist " + head.data);
            head = head.next;
        }
    }

    static detectcyclelinked detectCycle(detectcyclelinked head){
        detectcyclelinked slow=head;
        detectcyclelinked fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return slow;
            }
           
        }
        return null;
    }

    static detectcyclelinked detectFirstNode(detectcyclelinked head){
        detectcyclelinked start=head;
        detectcyclelinked meet=detectCycle(head);
        while(start!=meet){
            start=start.next;
            meet=meet.next;
        }
        return start;
    }
    public static void main(String[] args) {
        detectcyclelinked l1 = new detectcyclelinked(5);
        detectcyclelinked l2 = new detectcyclelinked(8);
        detectcyclelinked l3 = new detectcyclelinked(7);
        detectcyclelinked l4=new detectcyclelinked(10);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next=l3;
        detectcyclelinked head = l1;
        System.out.println(detectFirstNode(head));
        // traverse(head);
    }
}
