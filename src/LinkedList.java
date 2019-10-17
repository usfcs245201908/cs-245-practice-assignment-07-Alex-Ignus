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
            size++;
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
        nextNode.next = null;

        int i = 0;
        if(head == null && pos == 0){
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
        // If linked list is empty
        if (head == null)
            return null;

        // Store head node
        Node temp = head;

        // If head needs to be removed
        if (pos == 0)
        {
            size--;
            head = temp.next;   // Change head
            return temp.data;
        }

        // Find previous node of the node to be deleted
        for (int i=0; temp!=null && i<pos-1; i++) {
            temp = temp.next;
        }

        // If position is more than number of ndoes
        if ((temp == null) || (temp.next == null)) {
            return null;
        }

        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node next = temp.next.next;

        Node removed = temp.next;
        temp.next = next;  // Unlink the deleted node from list
        size--;
        return removed.data;

    }

    @Override
    public int size() {
        return size;
    }
}
