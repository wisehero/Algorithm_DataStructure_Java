package chap04_Stack_Queue;

import java.util.EmptyStackException;

public class Gstack<E> {
    private int max;
    private int ptr;
    private E[] stk;

    // 실행할 떄 예외 : 스택이 비어있음
    public static class EmptyGstackException extends RuntimeException {
        public EmptyGstackException() {

        }
    }

    // 실행할 때 예외 : 스택이 가득 참
    public static class OverflowGstackException extends RuntimeException {
        public OverflowGstackException() {
        }
    }

    // 생성자

    public Gstack(int capacity) {
        ptr = 0;
        max = capacity;
        try {
            stk = (E[]) new Object[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    // 스택에 x를 푸시
    public E push(E x) throws OverflowGstackException {
        if (ptr >= max)
            throw new OverflowGstackException();
        return stk[ptr++];
    }

    // 스택에서 데이터를 팝
    public E pop() throws EmptyStackException {
        if (ptr <= 0)
            throw new EmptyGstackException();
        return stk[--ptr];
    }

    // 피크

    public E peek() throws EmptyGstackException {
        if (ptr <= 0)
            throw new EmptyGstackException();
        return stk[ptr - 1];
    }

    // 스택 검색
    public int indexOf(E x) {
        for (int i = ptr - 1; i >= 0; i--)
            if (stk[i].equals(x))
                return i;
        return -1;
    }

    // 스택을 비움
    public void clear() {
        ptr = 0;
    }

    // 용량 반환
    public int capacity() {
        return max;
    }
    // 스택에 쌓여있는 데이터 수를 반환
    public int size() {
        return ptr;
    }

    // 스택이 비어 있는가?
    public boolean isEmpty() {
        return ptr <= 0;
    }

    // 스택이 가득 찼는가?
    public boolean isFull() {
        return ptr >= max;
    }

    // 스택 안의 데이터를 바닥→꼭대기의 차례로 출력함
    public void dump() {
        if (ptr <= 0)
            System.out.println("스택이 비었습니다.");
        else {
            for (int i = 0; i < ptr; i++)
                System.out.print(stk[i] + " ");
            System.out.println();
        }
    }

}
