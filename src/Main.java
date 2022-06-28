import java.util.*;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        Queue<String> queue1 = new PriorityQueue<>();
        queue1.add("Amit Sharma");
        queue1.add("Vijay Raj");
        queue1.add("JaiShankar");
        queue1.add("Raj");
        queue.add("Amit Sharma");
        queue.add("Vijay Raj");
        queue.add("JaiShankar");
        queue.add("Raj");

        System.out.println("head:" + queue1.element());
        System.out.println("head:" + queue1.peek());
        System.out.println("head:");

        //System.out.println("head:" + queue.peek());
        //System.out.println("iterating the queue elements:");
        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}