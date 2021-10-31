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

    // 머리에 노드 삽입
    public void addFirst(E obj) {
        Node<E> ptr = head;
        head = crnt = new Node<E>(obj, ptr);
    }

    // 꼬리에 노드 삽입
    public void addList(E obj) {
        if (head == null)
            addFirst(obj);
        else {
            Node<E> ptr = head;

            // while문이 끝났을 때 ptr은 꼬리 노드를 가리킨다.
            while (ptr.next != null)
                ptr = ptr.next;
            ptr.next = crnt = new Node<E>(obj, null);
        }
    }

    // 머리 노드를 삭제
    public void removeFrist() {
        if (head != null) {
            head = crnt = head.next;
        }
    }

    // 꼬리 노드를 삭제
    public void removeList() {
        if (head != null) {
            if (head.next == null) // 노드가 하나만 있으면
                removeFrist(); // 머리 노드를 삭제
            else {
                Node<E> ptr = head; // 스캔 중인 노드
                Node<E> pre = head; // 스캔 중인 노드의 앞쪽 노드

                while (ptr.next != null) {
                    pre = ptr;
                    ptr = ptr.next;
                }
                pre.next = null;
                crnt = pre;
            }
        }
    }

    
}
