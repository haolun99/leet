package linkedList;
import java.util.HashMap;
import java.util.Map;

// 146
class LRUCache {
    public static void main(String[] args) {
        // This main method contain a test case for the answer
        // Create an LRUCache with a capacity of 2
        LRUCache cache = new LRUCache(2);

        // Test case 1: Add two values to the cache
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println("Expected 1, got: " + cache.get(1));  // Should return 1

        // Test case 2: Add another value, causing eviction of key 2 (since capacity is 2)
        cache.put(3, 3);
        System.out.println("Expected -1, got: " + cache.get(2)); // Should return -1, as key 2 is evicted

        // Test case 3: Add another value, causing eviction of key 1
        cache.put(4, 4);
        System.out.println("Expected -1, got: " + cache.get(1)); // Should return -1, as key 1 is evicted
        System.out.println("Expected 3, got: " + cache.get(3));  // Should return 3
        System.out.println("Expected 4, got: " + cache.get(4));  // Should return 4

        // Test case 4: Update existing key
        cache.put(4, 40);
        System.out.println("Expected 40, got: " + cache.get(4)); // Should return 40 after update

        // Test case 5: Test retrieval of non-existing key
        System.out.println("Expected -1, got: " + cache.get(99)); // Should return -1 for non-existing key
    }

    class Node {
        int key;
        int value;
        Node prev;
        Node next;
    }

    private Map<Integer, Node> cache;
    private int size;
    private int capacity;
    private Node head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>(capacity);
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        Node node = cache.get(key);
        if (node == null) {
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        Node node = cache.get(key);
        if(node == null){
            Node newNode = new Node();
            newNode.key = key;
            newNode.value = value;
            cache.put(key, newNode);
            addNode(newNode);
            size++;
            if(size > capacity) {
                Node tail = removeTail();
                cache.remove(tail.key);
                size--;
            }
        }    else {
            node.value = value;
            moveToHead(node);
        }
    }

    private void addNode(Node node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    private void moveToHead(Node node) {
        removeNode(node);
        addNode(node);
    }

    private Node removeTail() {
        Node realTail = tail.prev;
        removeNode(realTail);
        return realTail;
    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
