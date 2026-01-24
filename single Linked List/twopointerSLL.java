class SLL {

    Node head, tail;

    SLL(int value) {
        Node nn = new Node(value);
        head = tail = nn;
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    void printList() {
        if (head != null) {

            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value + " ");
                temp = temp.next;
            }
        } else
            System.out.print("Empty");
        System.out.println();
    }

    void append(int value) {
        Node nn = new Node(value);

        if (head != null) {
            tail.next = nn;
            tail = tail.next;
        } else {
            head = tail = nn;
        }

    }

    void hasLoop() {
        Node sptr, fptr;
        sptr = fptr = head;
        while (fptr != null && fptr.next != null) {
            sptr = sptr.next;
            fptr = fptr.next.next;

            if (sptr == fptr) {
                System.out.println("Loop Exists");
                break;
            }

        }
    }

    void createLoop() {
        tail.next = head;
    }
}

public class twopointerSLL {
    public static void main(String[] a) {
        SLL sl = new SLL(5);
        sl.append(10);
        sl.append(15);
        sl.append(20);
        sl.append(25);
        sl.append(30);
        // sl.append(35);

        sl.printList();
        sl.hasLoop();
        sl.createLoop();
        sl.hasLoop();
    }
}
