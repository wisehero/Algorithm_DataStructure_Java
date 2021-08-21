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

    // 디큐 메서드
    // 프론트를 하나 증가시키고
    // num은 하나 감소
    // rear는 변화 없음
    public int deque() throws EmptyIntQueueException {
        if (num <= 0)
            throw new EmptyIntQueueException();
        int x = que[front++];
        num--;
        // 프론트가 max를 넘어서면 안되므로
        // 프론트가 max와 같아지면 0으로 돌려아한다.
        if (front == max)
            front = 0;
        return x;
    }
}
