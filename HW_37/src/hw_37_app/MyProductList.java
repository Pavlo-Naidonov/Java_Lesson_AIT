package hw_37_app;

public class MyProductList {
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    private class Node {
        Product value;
        Node next;
        Node prev;

        public Node(Node prev, Product value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }

    public void add(Product product) {
        Node node = new Node(tail, product, null);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public Product get(int index) {
        if (index < 0 || index >= size) return null;
        Node current = head;
        for (int i = 0; i < index; i++) current = current.next;
        return current.value;
    }

    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.value).append(System.lineSeparator());
            current = current.next;
        }
        return sb.toString();
    }

    public Integer indexOf(Product product) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.value.equals(product)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return null;
    }
}