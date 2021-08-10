public class SampleLinkedList<E> {
    private Node<E> head;

    public int findItem(E item){
        Node findItem = head;
        int index=0;
        while (findItem!=null && findItem.getItem() != item){
            findItem =findItem.getNext();
            index++;
        }
        if (findItem==null){
            return -1;
        }
        return index;
    }

    public boolean isEmpty(){
        if (head==null){
            return true;
        }
        return false;
    }

    public void add(E item) {
        Node<E> node = new Node<>(item, null);
        if (isEmpty()) {
            head = node;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);

        }
    }

}
