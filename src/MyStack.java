import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> queue = new LinkedList<>();
    public MyStack() {

    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        Queue<Integer> queue2 = new LinkedList<>();
        int current = 0;
        while (!queue.isEmpty()) {
            current = queue.remove();
            if (!queue.isEmpty())
            {
                queue2.add(current);
            }
        }
        queue = queue2;
        return current;
    }

    public int top() {
        Queue<Integer> queue2 = new LinkedList<>();
        int current = 0;
        while (!queue.isEmpty()) {
            current = queue.remove();
            queue2.add(current);
        }
        queue = queue2;
        return current;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
