class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Insert element at end
    void insert(int data) {
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Insert new node
        temp.next = newNode;
    }
    // Insert at particular index
void insertAtIndex(int index, int data) {

    Node newNode = new Node(data);

    // Insert at beginning
    if (index == 0) {
        newNode.next = head;
        head = newNode;
        return;
    }

    Node temp = head;

    // Move to node before required index
    for (int i = 0; i < index - 1; i++) {
        temp = temp.next;
    }

    // Connect new node
    newNode.next = temp.next;
    temp.next = newNode;
}

    // Display linked list
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insertAtIndex(3,50);

        list.display();
    }
}