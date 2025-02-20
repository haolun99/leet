package unknown;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Leetcode 284

public class PeekingIterator implements Iterator<Integer> {

    private Iterator<Integer> iterator;
    private Integer nextElement;
    private boolean hasPeeked;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
        this.nextElement = null;
        this.hasPeeked = false;
    }

    public Integer peek() {
        if(!hasPeeked) {
            if(iterator.hasNext()) {
                nextElement = iterator.next();
                hasPeeked = true;
            }
        }
        return nextElement;
    }

    @Override
    public Integer next() {
        if(!hasPeeked) {
            return iterator.next();
        }
        Integer result = nextElement;
        nextElement = null;
        hasPeeked = false;
        return result;
    }


    @Override
    public boolean hasNext() {
        return hasPeeked || iterator.hasNext();
    }
}


class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        PeekingIterator it = new PeekingIterator(nums.iterator());

        System.out.println("Peek: " + it.peek()); // 1
        System.out.println("Next: " + it.next()); // 1
        System.out.println("Next: " + it.next()); // 2
        System.out.println("Peek: " + it.peek()); // 3
        System.out.println("Next: " + it.next()); // 3
        System.out.println("HasNext: " + it.hasNext()); // true
        System.out.println("Next: " + it.next()); // 4
        System.out.println("Next: " + it.next()); // 5
        System.out.println("HasNext: " + it.hasNext()); // false
    }
}
