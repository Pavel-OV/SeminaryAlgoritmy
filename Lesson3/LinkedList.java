package Lesson3;

import java.util.Comparator;

public class LinkedList<T> {
    /**
     * Ухзел связанного списка
     */

    public class Node {
        /*
         * Указатель на следующий элемент связанного списка
         */
        public Node next;
        /*
         * Значение элемента (узла)
         */
        public T value;

    }

    /**
     * Указатель на первый элемент связанного списка
     * 
     */
    private Node head;

    /**
     * Добавление нового элемента в начало связанного списка
     * 
     * @param value значения
     * 
     */

    public void addFirst(T value) {
        Node node = new Node();
        node.value = value;
        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    public void removFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    /**
     * Поиск элементов в связанном списке по значению
     * 
     * @param value значение
     * @return элемент
     */
    public Node contains(T value) {
        Node node = head;
        while (node != null) {

            if (node.value.equals(value))
                return node;

            node = node.next;
        }
        return null;
    }

    /**
     * @param comparator
     */
    public void sort(Comparator<T> comparator) {
        Node node = head;
        while (node != null) {
            Node minValuNode = node;
            Node node2 = node.next;
            while (node2 != null) {
                if (comparator.compare(minValuNode.value, node2.value) > 0) {
                    minValuNode = node2;
                }
                node2 = node2.next;
            }
            if (minValuNode != node) {
                T buf = minValuNode.value;
                minValuNode.value = node.value;
                node.value = buf;
            }

            node = node.next;
        }

    }

    public void reversNode() {
        if (head != null && head.next != null) {
            reversNode(head.next, head);
        }

    }

    public void reversNode(Node node, Node tail) {
        if (node.next == null)
            head = node;
        else {
            reversNode(node.next, node);
        }
        node.next = tail;
        tail.next=null;

       
    }

    public void addLast(T value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
        } else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = node;
        }

    }

    /**
     * Удаление последнего элемента из связанного списка
     * 
     */
    public void removeLast() {
        if (head == null)
            return;
        Node node = head;
        while (node.next != null) {
            if (node.next.next == null) {
                node.next = null;
                return;
            }
            node = node.next;
        }
        head = null;

    }

    @Override
    public String toString() {
        StringBuilder list = new StringBuilder();
        Node node = head;
        while (node != null) {
            list.append(node.value);
            list.append("\n");

            node = node.next;

        }
        return list.toString();
    }

}
