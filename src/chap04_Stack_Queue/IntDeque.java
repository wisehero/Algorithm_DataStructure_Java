package chap04_Stack_Queue;

public class IntDeque {
    private int max;
    private int num;
    private int front;
    private int rear;
    private int[] que;

    // 실행할 때 예외：큐가 비어 있음
    public class EmptyIntDequeException extends RuntimeException {
        public EmptyIntDequeException() {
        }
    }

    // 실행할 때 예외：큐가 가득 참
    public class OverflowIntDequeException extends RuntimeException {
        public OverflowIntDequeException() {
        }
    }

    // 생성자
    public IntDeque(int capacity) {
        num = front = rear = 0;
        max = capacity;
        try {
            que = new int[max]; // 덱(deck)본체용 배열을 생성
        } catch (OutOfMemoryError e) { // 생성할 수 없습니다
            max = 0;
        }
    }

    // 덱(deck)에서 데이터를 머리쪽부터 인큐
    public int enqueFront(int x) throws OverflowIntDequeException {
        if (num >= max)
            throw new OverflowIntDequeException();
        num++;
        if (--front < 0)
            front = max - 1;
        que[front] = x;
        return x;
    }

    //덱(deck)에서 데이터를 꼬리쪽부터 인큐
    public int enqueRear(int x) throws OverflowIntDequeException {
        if (num >= max)
            throw new OverflowIntDequeException();
        que[rear++] = x;
        num++;
        if (rear == max)
            rear = 0;
        return x;
    }

    // 덱(deck)의 머리부터 데이터를 디큐
    public int dequeFront() throws EmptyIntDequeException {
        if (num <= 0)
            throw new EmptyIntDequeException();
        int x = que[front++];
        num--;
        if (front == max)
            front = 0;
        return x;
    }

    // 덱(deck)의 꼬리부터 데이터를 디큐
    public int dequeRear() throws EmptyIntDequeException {
        if (num <= 0)
            throw new EmptyIntDequeException();
        num--;
        if (--rear < 0)
            rear = max - 1;
        return que[rear];
    }

    // 덱(deck)의 머리부터 데이터를 피크(머리데이터를 살펴봄)
    public int peekFront() throws EmptyIntDequeException {
        if (num <= 0)
            throw new EmptyIntDequeException(); // 덱(deck)이 비어 있음
        return que[front];
    }

    // 덱(deck)의 꼬리부터 데이터를 피크(꼬리데이터를 살펴봄)
    public int peekRear() throws EmptyIntDequeException {
        if (num <= 0)
            throw new EmptyIntDequeException(); // 덱(deck)이 비어 있음
        return que[rear == 0 ? max - 1 : rear - 1];
    }
}
