/**
 * Griffin Murphy
 */
public class DoublyLinkedList<E> {
    private class Node {
        private E data;
        private Node left;
        private Node right;

        public Node() {
            data = null;
            left = right= null;
        }

        public Node(E x) {
            data = x;
            left = right = null;
        }
    }
    protected Node front;
    protected Node rear;
    protected int length;
    public DoublyLinkedList() {
        front = rear = null;
        length = 0;
    }

    public void add(int n, E x) {
        if (n > length) {
            System.out.println("Out of range in add(int n E x)");
            System.exit(0);
        }
        Node p = new Node(x);
        if (n == 0) {
            p.right = front;
            front = p;
            if(rear == null)
                rear = front;
            length++;
            return;
        }
        if(n==length) {
            add(x);
            return;
        }
        Node q = front;
        for(int i = 0; i < n-1; i++)
            q=q.right;

        Node r = q.right;
        q.next = p;
        p.next = r;
        length++;
    }

    public void forward() {
        Node p = front;
        while(p != null){
            System.out.println(p.e);
            p = p.right;
        }
    }

    public void reverse() {
        Node p = rear;
        while(p != null) {
            System.out.println(p.e);
            p = p.left;
        } 
    }

    public static void main(String[] args) {
        DoublyLinkedList<String> l = new DoublyLinkedList<String>();
        l.add(0, "Homer");
        l.add(1, "Marge");
        l.add(2, "Bart");
        l.add(1, "Lisa");
        l.add(3, "Maggie");
        l.add(0, "Krusty");
        l.add(4, "Itchy");
        l.add(7, "Scratchy");
        l.forward();
        System.out.println();
        l.reverse();
    }
}
