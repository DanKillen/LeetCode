class MyLinkedList {
    int length = 0;
    ListNode head = new ListNode();
    ListNode tail = new ListNode();

    public MyLinkedList() {

    }

    public int get(int index) {
        if (index < 0 || index >= length) {
            return -1;
        }
        ListNode traversalNode = head;
        for (int i = 0; i < index; i++) {
            traversalNode = traversalNode.next;
        }
        return traversalNode.val;
    }


    public void addAtHead(int val) {
        ListNode newHead = new ListNode(val);
        newHead.next = head;
        head = newHead;
        if (length == 0) {
            tail = head;
        }
        length++;
    }

    public void addAtTail(int val) {
        ListNode newTail = new ListNode(val);
        tail.next = newTail;
        tail = newTail;
        if (length == 0) {
            head = tail;
        }
        length++;
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
        } else if (index == length) {
            addAtTail(val);
        } else if (index < length) {
            ListNode newNode = new ListNode(val);
            ListNode traversalNode = head;
            for (int i = 0; i < index - 1; i++) {
                traversalNode = traversalNode.next;
            }
            newNode.next = traversalNode.next;
            traversalNode.next = newNode;
            length++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= length) {
            return;
        }
        if (index == 0) {
            head = head.next;
            if (length == 1) {
                tail = null;
            }
        } else {
            ListNode traversalNode = head;
            for (int i = 0; i < index - 1; i++) {
                traversalNode = traversalNode.next;
            }
            traversalNode.next = traversalNode.next.next;
            if (index == length - 1) {
                tail = traversalNode;
            }
        }
        length--;
    }
}
