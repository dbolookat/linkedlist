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

}
