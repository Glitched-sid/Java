// list - add to first and last
public class two {
    // private final int value;
    
    // public two(int initialValue) {
    //     this.value = initialValue;
    //     System.out.println("Constructor called with value: " + initialValue);
    // }

    static class node{
        int data;
        //instant variable
        // Constructor to initialize the data variable
        
        // public node(int data) {
        //     this.data = data;
        
        node next;
        // next node address

        public node(int data) {
            this.data = data;
            this.next = null; // Initialize next to null
        }
    }
    
static class index{
    node head; // Head of the linked list
    public void addToFirst(int data) {
        node newNode = new node(data);
        if (head == null){
                head = newNode; 
            // If the list is empty, set head to new node
            return;
        }
        newNode.next = head; // Point new node to the current head
        head = newNode; // Update head to the new node
    }
public void addtoLast(int data) {
    node newNode = new node(data);
    if (head == null) {
        head = newNode; // If the list is empty, set head to new node
        return;
    }
    node temp = head;
    while (temp.next != null) {
        temp = temp.next; // Traverse to the last node
    }
    temp.next = newNode; // Link the new node at the end
}

void display(){
    node temp = head;
    while(temp != null) {
        System.out.print(temp.data + "->");
        temp = temp.next;
    }
}

public static void main(String[] args) {
    index list = new index();
    list.addToFirst(10);
    list.addToFirst(20);
      
    list.display();
    list.addToFirst(40);
    }
}
}
    

    


