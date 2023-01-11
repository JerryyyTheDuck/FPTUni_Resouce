
package data;

/**
 *
 * @author Jack
 */
public class Node<T> {

    T value;
    Node<T> next;

    public Node() {

    }

    public Node(T value) {
        this.value = value;
    }

    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getNext() {
        return next;
    }
}
/**
 *
 * @author Jack
 */
