
class DoublyLinkedList {

    static int size = 0;
    static Node head = null;
    static Node tail = null;

    static class Node {

        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static void insertFront(int data) {
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public static void insertEnd(int data) {
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    public static void insertMiddle(int position, int data) {
        if (position >= size) {
            insertEnd(data);
            return;
        }
        if (size == 0 || position == 0) {
            insertFront(data);
            return;
        }

        Node newNode = new Node(data);
        if (size - position >= position) { // position close to head
            int count = 0;
            Node temp = head;
            while (++count < position) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        } else {
            Node temp = tail;
            int count = size;
            while (count-- > position) {
                temp = temp.prev;
            }
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
        size++;

    }

    public static void deleteFront() {
        if (head == null) {
            return;
        }
        size--;
        if (head.next == null) {
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    public static void deleteEnd() {
        if (head == null) {
            return;
        }
        if (head == tail) {  
            head = tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = null;
    }

    public static void deleteAt(int position) {
        if (position >= size || position < 0) {
            return;
        }
        if (position == 0) {
            deleteFront();
            return;
        }
        if (position == (size - 1)) {
            deleteEnd();
            return;
        }
        if (size - position >= position) {
            int count = 0;
            Node currentNode = head;
            Node temp;
            while (++count < position) {
                currentNode = currentNode.next;
            }
            temp = currentNode.next.next;
            temp.prev = currentNode;
            currentNode.next = temp;
        } else {
            int count = size - 1;
            Node currentNode = tail;
            Node temp;
            while (count-- > position) {
                currentNode = currentNode.prev;
            }
            temp = currentNode.prev.prev;
            temp.next = currentNode;
            currentNode.prev = temp;
        }
        size--;
    }

    public static void reverse() {
        if (head == null || head.next == null) {
            return;
        }
        Node temp = null, current = head;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;
        }
        temp = head;
        head = tail;
        tail = temp;
    }

    public static void printListForword() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public static void printListBackword() {
        Node currentNode = tail;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.prev;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        insertFront(3);
        insertFront(2);
        insertFront(1);
        insertEnd(5);
        insertMiddle(3, 4);
        System.err.print("Original List: ");
        printListForword();
        System.out.println("Size: " + size);
        System.err.print("Updated List: ");
        deleteAt(1);
        printListForword();
        printListBackword();
        System.out.println("Size: " + size);
    }
}
