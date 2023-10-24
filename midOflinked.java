public class midOflinked {
    int data;
    midOflinked next;

    midOflinked(int data) {
        this.data = data;
    }

    static void traverse(midOflinked head) {
        int count = 0;
        while (head != null) {
            count += 1;
            System.out.println("value at " + count + " in linkedlist " + head.data);
            head = head.next;
        }
    }

    static midOflinked reverse(midOflinked head) {
        midOflinked temp;
        midOflinked current = head;
        midOflinked prev = null;
        while (current != null) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }

   static midOflinked middle(midOflinked head) {
        midOflinked slow = head;
        midOflinked fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    static boolean pallindrome(midOflinked head) {
        if (head == null) {
            return true;
        }
        midOflinked mid = middle(head);
        midOflinked last = reverse(head.next);
        midOflinked curr = head;
        while (last != null) {
            if (curr.data != last.data) {
                return false;
            }
            curr = curr.next;
            last = last.next;
        }
        return true;
    }

    public static void main(String[] args) {
        midOflinked l1 = new midOflinked(2);
        midOflinked l2 = new midOflinked(2);
        midOflinked l3 = new midOflinked(1);
        l1.next = l2;
        l2.next = l3;
        l3.next = null;
        midOflinked head = l1;
        traverse(head);
        System.out.println(pallindrome(head));
    }
}
