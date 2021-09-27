

// Java program to implement
// a Singly Linked List
public class Expression {

    Term head;
    Term tail;
    // Linked list Node.
    // This inner class is made static
    // so that main() can access it


    // Method to insert a new node
    public void insertTerm(Term x) {
        // Create a new node with given data
        Term new_node = new Term(x.getCoeff(), x.getExp());
        // If the Linked List is empty,
        // then make the new node as head
        if (this.head == null) {
            this.head = new_node;
        } else {
            Term curr = this.head;
            Term temp = null;
            try {
                while (curr.getExp() > x.getExp()) {
                    temp = curr;
                    curr = curr.next;
                }
            } catch (NullPointerException e) {
                temp.next = new_node;
                new_node.prev = temp;
                this.tail = new_node;
            }
            if (curr != null){
                if (curr.getExp() == x.getExp()) {
                    curr.setCoeff(curr.getCoeff() + x.getCoeff());
                } else {
                    if (curr != this.head) {
                        temp.next = new_node;
                        new_node.prev = temp;
                        new_node.next = curr;
                        curr.prev = new_node;
                    } else {
                        if (this.head.getExp() < x.getExp()) {
                            this.head = new_node;
                            if (curr.next == null) {
                                this.tail = curr;
                            }
                            curr.prev = new_node;
                            new_node.next = curr;
                        } else {
                            this.tail = new_node;
                            new_node.prev = this.head;
                            head.next = new_node;
                        }
                    }
                }
            }
        }
        if(!this.head.hasNext()){
            this.tail = this.head;
        }
    }

    public Expression findDer(){
        Term current = this.head;
        Expression der = new Expression();
        if(this.tail != null) {
            if (this.tail.getExp() != 0 || this.head != this.tail) {
                while (current != null) {
                    if (current.getExp() != 0) {
                        Term newDer = new Term(current.getCoeff() * current.getExp(), current.getExp() - 1);
                        der.insertTerm(newDer);

                    }
                    current = current.next;
                }
            }
        }
        return der;
    }
    public String toString(){
            String ret = "";
            if (head == null)
                return "";
            Term current = head;
            Term temp = current;
            while (current != null) {
                ret+= " " + current.toString();
                temp = current;
                current = current.next;
            }
            return ret;
    }
}