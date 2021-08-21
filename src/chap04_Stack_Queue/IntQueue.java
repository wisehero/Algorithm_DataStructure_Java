package chap04_Stack_Queue;

public class IntQueue {
    private int max;
    private int front;
    private int rear;
    private int num;
    private int[] que;

    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {
        }
    }

    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {
        }
    }

    // 생성자
    public IntQueue(int capacity) {
        num = front = rear = 0;
        max = capacity;
        try {
            que = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    // 큐에 데이터를 인큐
    // front는 변화하지 않고
    // num과 rear는 하나씩 증가함.
    public int enque(int x) throws OverflowIntQueueException {
        if (num >= max)
            throw new OverflowIntQueueException();
        que[rear++] = x;
        num++;
        // rear랑 max가 같아지는 것을 방지
        // rear는 다음 인큐 값이 들어올 인덱스를 임시로 저장하는 것과 같은 개념이기 때문
        if (rear == max)
            rear = 0;
        return x;
    }
}
