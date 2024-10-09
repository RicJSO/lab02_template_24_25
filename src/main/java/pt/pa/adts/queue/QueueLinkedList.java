package pt.pa.adts.queue;

/**
 * This class must implement the Queue interface
 * @param <T>
 */
public class QueueLinkedList<T> implements Queue<T> {

    private ListNode header, trailer;
    private int size;

    public QueueLinkedList() {
        config();
    }

    public void enqueue(T elem) throws QueueFullException, NullPointerException{
            if(elem == null) throw new NullPointerException();
            ListNode lastNode = trailer.prev;
            try{
                ListNode newNode = new ListNode(elem, lastNode, trailer);
                trailer.prev=newNode;
                lastNode.next=newNode;
                size++;
            }catch(OutOfMemoryError e){
                throw new QueueFullException();
            }
    }

    public T dequeue() throws QueueEmptyException{
        if(isEmpty()) throw new QueueEmptyException();
        T dequeuedElem = header.next.element;
        header.next=header.next.next;
        header.next.prev=header;
        size--;
        return dequeuedElem;
    }

    public T front() throws QueueEmptyException{
        if(isEmpty()){
            throw new QueueEmptyException();
        }
        return header.next.element;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void clear(){
        config();
    }

    private void config(){
        size=0;
        header = new ListNode(null, null, null);
        trailer= new ListNode(null, null, null);
        header.next=trailer;
        trailer.prev=header;
    }


    //TODO: implementar métodos da interface à custa da estrutura de dados fornecida

    private class ListNode {
        private T element;
        private ListNode next;
        private ListNode prev;

        public ListNode(T element, ListNode prev, ListNode next) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }


}
