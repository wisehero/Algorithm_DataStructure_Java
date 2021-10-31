package chap09;

import java.util.Comparator;

public class LinkedList<E> {

    //노드
    class Node<E> {
        private E data;
        private Node<E> next; // 뒤쪽 포인터

        // 생성자
        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<E> head; // 머리 노드
    private Node<E> crnt; // 선택 노드

    public LinkedList() {
        head = crnt = null;
    }

    // 노드 검색
    public E search(E obj, Comparator<? super E> c) {
        Node<E> ptr = head; // 현재 스캔중인 노드

        while (ptr != null) {
            if (c.compare(obj, ptr.data) == 0) {
                crnt = ptr;
                return ptr.data;
            }
            ptr = ptr.next; // 다음 노드를 선택
        }
        return null;
    }
}
