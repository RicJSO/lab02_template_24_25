package pt.pa.adts.queue;

import static org.junit.jupiter.api.Assertions.*;
class QueueLinkedListTest {
    QueueLinkedList<Integer> queue;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        queue = new QueueLinkedList<Integer>();
        queue.enqueue(15);
        queue.enqueue(2);
    }

    @org.junit.jupiter.api.Test
    void enqueue() {
        queue.enqueue(22);
        assertEquals(3,queue.size());
    }

    @org.junit.jupiter.api.Test
    void dequeue() {
        assertEquals(15,queue.dequeue());
        assertEquals(1,queue.size());
    }

    @org.junit.jupiter.api.Test
    void front() {
        assertEquals(15,queue.front());
    }

    @org.junit.jupiter.api.Test
    void size() {
        assertEquals(2,queue.size());
        queue.dequeue();
        assertEquals(1, queue.size());
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        assertFalse(queue.isEmpty());
        queue.clear();
        assertTrue(queue.isEmpty());

    }

    @org.junit.jupiter.api.Test
    void clear() {
        queue.clear();
        assertTrue(queue.isEmpty());
    }
}