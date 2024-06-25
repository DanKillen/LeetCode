import java.util.LinkedList;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Daniel Killen on 25/06/2024
 * The school cafeteria offers circular and square sandwiches at lunch break, referred to by numbers 0 and 1 respectively.
 * All students stand in a queue. Each student either prefers square or circular sandwiches.
 *
 * The number of sandwiches in the cafeteria is equal to the number of students. The sandwiches are placed in a stack. At each step:
 *
 * If the student at the front of the queue prefers the sandwich on the top of the stack, they will take it and leave the queue.
 * Otherwise, they will leave it and go to the queue's end.
 * This continues until none of the queue students want to take the top sandwich and are thus unable to eat.
 *
 **/
public class LunchOrganiser
{

    public static void main(String[] args)
    {
//        int[] students1 = {1,1,0,0};
//        int[] sandwiches1 = {0,1,0,1};
//        System.out.println(sandwichDivider(students1, sandwiches1));
        int[] students2 = {1,1,0,0};
        int[] sandwiches2 = {0,1,0,1};
        System.out.println(sandwichDivider(students2, sandwiches2));

    }
    public static int sandwichDivider(int[] students, int[] sandwiches) {
        Queue<Integer> studentQueue = new LinkedList<>();
        Queue<Integer> sandwichQueue = new LinkedList<>();
        int totalSkips = 0;
        for (int i = 0; i < students.length; i++) {
            studentQueue.add(students[i]);
            sandwichQueue.add(sandwiches[i]);
        }
        System.out.println(studentQueue);
        System.out.println(sandwichQueue);
        while (totalSkips < studentQueue.size()) {
            if (Objects.equals(studentQueue.peek(), sandwichQueue.peek())) {
                studentQueue.remove();
                sandwichQueue.remove();
                totalSkips = 0;
            } else {
                studentQueue.add(studentQueue.peek());
                studentQueue.remove();
                totalSkips++;
            }
        }
        return studentQueue.size();
    }
}
