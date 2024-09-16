public class Main {
    public static void main(String args[]){
        person p1 = new person("abdullah",19);
        person p2 = new person("Ebad",20);

        SLL sll = new SLL();
        sll.insert(p1);
        sll.insert(p2);
        sll.printList();
        sll.deleteFirst();
        boolean exs = sll.search(p1);
        System.out.println(exs);

    }
}
