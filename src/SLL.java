public class SLL {

    Node head;

    public void insert(person data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
           temp.data.display();
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public boolean search(person key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void insertAtPosition(person data,int pos){
        Node newNode = new Node(data);

        if(pos == 1){
            newNode.next = head;
            head = newNode;
            return;
        }
        else{
            Node current = head;
            int count = 0;

            while(current.next != null && count < pos-1){
                current = current.next;
                ++count;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    }
