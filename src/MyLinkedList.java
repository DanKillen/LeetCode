class MyLinkedList {
    int length = 0;
    ListNode head = new ListNode();
    ListNode tail = new ListNode();

    public MyLinkedList() {

    }

    public int get(int index) {
        if (index == 0)
        {
            return head.val;
        }
        if (index == length)
        {
            return tail.val;
        }
        if (index < length) {
            ListNode traversalNode = head;
            for (int i = 0; i < index; i++) {
                traversalNode = traversalNode.next;
            }
            return traversalNode.val;
        }
        return -1;
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
        if (index == 0)
        {
            if (length == 1)
            {
                head = null;
                tail = null;
            }
            else
            {
                head = head.next;
            }
            length--;
        }
        else if (index <= length) {
            ListNode traversalNode = head;
            for (int i = 1; i < index; i++) {
                traversalNode = traversalNode.next;
            }
            traversalNode.next = traversalNode.next.next;
            length--;
        }
    }
}
