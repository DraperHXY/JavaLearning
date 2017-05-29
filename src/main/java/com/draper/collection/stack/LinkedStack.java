  package com.draper.collection.stack;

public class LinkedStack<T> {
    private static class Node<U > {
        U item;//链栈存储的信息
        Node<U> next;//下一个节点

        //初始化置空
        Node() {
            item = null;
            next = null;
        }

        Node(U item, Node<U> node) {
            this.item = item;
            this.next = node;
        }

        //当链栈到结尾时最后一个节点全为空
        boolean end() {
            return item == null && next == null;
        }
    }

    private Node<T> top = new Node<T>();

    //入栈
    public void push(T item) {
        top = new Node<T>(item, top);
    }

    public T pop(){
        T result = top.item;
        if(!top.end()){
            top = top.next;
        }
        return result;
    }
}
