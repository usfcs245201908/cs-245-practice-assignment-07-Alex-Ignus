public class LinkedList<T> implements List {
    Node head; // head of list
    int size = 0;

    /* Linked list Node*/
    class Node {
        Object data;
        Node next;

        // Constructor to create a new node
        // Next is by default initialized
        // as null
        Node(Object d) { data = d; }
    }


    @Override
    public void add(Object item) {
        Node nextNode = new Node(item);
        nextNode.next = null;
        if(head == null){
            head = nextNode;
        }else{
            Node lastElement = head;
            while(lastElement.next != null){
                lastElement = lastElement.next;
            }
            lastElement.next = nextNode;
            size++;
        }
    }

    @Override
    public void add(int pos, Object item) {
        Node nextNode = new Node(item);
        System.out.println(nextNode.data + " The node to insert and its Data");
        nextNode.next = null;
        int i = 0;
        if(pos < 0 || pos>= size()){

        }else if(head == null && pos == 0){
            head = nextNode;
            size++;
        }else{
            Node lastElement = head;
            while(i<pos-1 && lastElement.next!= null){
                lastElement = lastElement.next; // index 0 now = index 1
                i++;
            }
            nextNode.next = lastElement.next;
            lastElement.next = nextNode;
            size++;
        }



    }

    @Override
    public Object get(int pos) {
        if(pos < 0 || pos>= size()){
            return null;
        }
        Node nextElement = head;
        int i = 0;
        while (nextElement.next != null & i != pos){
            nextElement = nextElement.next;
            i++;
        }
      return nextElement.data;

    }

    @Override
    public Object remove(int pos) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }
}
