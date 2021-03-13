public class TypeErasure {
    /* Generics are only available at Compile Time, not at Runtime */
    /* Class Node before Compiling */
    class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }
    }

    /* Class Node after Compiling */
    /*
    class Node {
        private Object data;
        private Node next;

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Object getData() {
            return data;
        }
    }
    */
}
