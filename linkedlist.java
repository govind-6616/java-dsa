public class linkedlist {
    int data;
    linkedlist next;

    linkedlist(int data) {
        this.data = data;
    }

    static void traverse(linkedlist head) {
        int count = 0;
        while (head != null) {
            count += 1;
            System.out.println("value at " + count + " in linkedlist " + head.data);
            head = head.next;
        }
    }

    static void insert(linkedlist head, int pos, int value) {
        linkedlist addNode = new linkedlist(value);
        if (pos == 1) {
            addNode.next = head;
            head = addNode;
        }
        linkedlist prev = head;
        for (int i = 1; i < pos - 1; i++) {
            prev = prev.next;
        }
        addNode.next = prev.next;
        prev.next = addNode;
    }

    static void delete(linkedlist head, int pos) {
        if (pos == 1) {
            System.out.println("the deleted node is " + head.data);
            head = head.next;
        }
        linkedlist prev = head;
        for (int i = 1; i < pos - 1; i++) {
            prev = prev.next;
        }
        prev = prev.next.next;
    }

    static linkedlist reverse(linkedlist head) {
        linkedlist temp;
        linkedlist current = head;
        linkedlist prev = null;
        while (current != null) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }

    static linkedlist recursiveReverse(linkedlist head){
        if(head==null || head.next==null){
            return head;
        }
        linkedlist newHead=recursiveReverse(head.next);
        linkedlist headNext=head.next;
        head.next=null;
        headNext.next=head;
        return newHead;
    }

    public static void main(String[] args) {
        linkedlist l1 = new linkedlist(5);
        linkedlist l2 = new linkedlist(8);
        linkedlist l3 = new linkedlist(7);
        l1.next = l2;
        l2.next = l3;
        l3.next = null;
        linkedlist head = l1;
        traverse(head);
        //  head=reverse(head);
        head=recursiveReverse(head);
         traverse(head);
        // int pos = 1, value = 100;
        // insert(head, pos, value);
        // traverse(head);
        // delete(head, pos);
        // traverse(head);
    }
}