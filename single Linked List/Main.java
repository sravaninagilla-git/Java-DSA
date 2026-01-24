class SLL{
    Node head, tail;
    SLL(int value){
        Node nn = new Node(value);
        head = tail = nn;
    }

class Node{
    int value;
    Node next;
    Node(int value){
        this.value = value;
        this.next = null;
    }
}
void printList(){
    if(head != null){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        
    }else
    System.out.println("Empty");
}


void append(int value){
    Node nn = new Node(value);
        
        if(head != null){
            tail.next = nn;
            tail = tail.next;

        }else{
            head = tail = nn;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        SLL s1 = new SLL(5);
        s1.append(10);
        s1.append(15);
        s1.printList();
        
    }
    
}

