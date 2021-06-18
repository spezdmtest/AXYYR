package Testing_Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.enqueue("D");
        queue.enqueue("E");

        System.out.println("Peek: " + queue.peek());
        queue.dequeue();
        System.out.println("Peek: " + queue.peek());
        queue.dequeue();
        System.out.println("Peek: " + queue.peek());
        queue.dequeue();
        System.out.println("Peek: " + queue.peek());
        queue.dequeue();
        System.out.println("Peek: " + queue.peek());
    }
}
