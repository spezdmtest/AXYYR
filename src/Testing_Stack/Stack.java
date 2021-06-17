package Testing_Stack;

public class Stack <T> {

    private Node<T> head;

    public T peek() {
         return head.value;
    }

    public T pop() {
        T value = head.value;
        head = head.next;
        return value;
    }

    public void push(T t) {
        Node<T> node = new Node<>(t);
        node.next = head;
        head = node;
    }

    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> currentNode = head;
        while(currentNode != null) {
            sb.append(currentNode.value);
            currentNode = currentNode.next;
        }
        return sb.toString();
    }

    private static class Node<T> {
        private final T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }

}
