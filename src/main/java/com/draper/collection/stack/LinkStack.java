package com.draper.collection.stack;

public class LinkStack<T> {

    private static class Node<U> {
        U item;
        Node<U> next;

        Node() {
            item = null;
            next = null;
        }

        Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }
    }

    private Node<T> top = new Node<T>();

    //这一步很关键，又实例出了一个 Node 并指向 top
    public void push(T t) {
        top = new Node<T>(t, top);
    }

    public T pop() {
        if (!top.end()) {
            T result = top.item;
            top = top.next;
            return result;
        }
        return null;
    }

}
