package chap04_Stack_Queue;

public class IntAryQueue {

    public class EmptyIntAryQueueException extends RuntimeException {
        public EmptyIntAryQueueException() {

        }
    }

    public class OverflowIntAryQueueException extends RuntimeException {
        public OverflowIntAryQueueException() {
        }
    }

    private int max; // 큐의 용량
    private int num; // 현재 데이터의 수
    private int[] que; // 큐의 본체

    // 생성자
    public IntAryQueue(int capacity) {
        num = 0;
        max = capacity;
        try {
            que = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int enQueue(int x) throws OverflowIntAryQueueException {
        if (num >= max)
            throw new OverflowIntAryQueueException();
        que[num++] = x;
        return x;
    }

    public int deQueue() throws EmptyIntAryQueueException {
        if (num <= 0)
            throw new EmptyIntAryQueueException();
        int x = que[0];
        for (int i = 0; i < num - 1; i++)
            que[i] = que[i + 1];
        num--;
        return x;
    }

    public int indexOf(int x) {
        for (int i = 0; i < num; i++)
            if (que[i] == x)
                return i;
        return -1;
    }

    public void clear() {
        num = 0;
    }

    public int capacity() {
        return max;
    }

    public int size() {
        return num;
    }

    public boolean isEmpty() {
        return num <= 0;
    }

    public boolean isFull() {
        return num >= max;
    }

    public void dump() {
        if (num <= 0)
            System.out.println("큐가 비었습니다.");
        else {
            for (int i = 0; i < num; i++)
                System.out.print(que[i] + " ");
            System.out.println();
        }
    }
}
