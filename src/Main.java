public class Main {
    public static void main(String args[]){
        person p1 = new person("abdullah",19);
        person p2 = new person("Ebad",20);
        person p3 = new person("Ali",20);
        person p4 = new person("Rabia",21);

        SLL sll = new SLL();
        sll.insert(p1);
        sll.insert(p2);
        sll.insert(p3);

        sll.printList();
        sll.insertAtPosition(p4,2);
        sll.printList();

    }
}
