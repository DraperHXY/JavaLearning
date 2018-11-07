package com.draper.collection.list;

import com.draper.pojo.coffee.*;

import java.util.Iterator;

/**
 * 实现双向链表
 * 链表功能，插入，删除
 *
 * @param <E>
 */
public class MyLinkList<E> implements Iterable<E>{

    Node<E> head; //
    Node<E> last;
    Node<E> cursor;


    MyLinkList() {
        head = new Node<>(null, null, null);
        cursor = head;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    static class Node<E> {
        E item;
        Node<E> pre;
        Node<E> next;

        Node(Node<E> pre, E item, Node<E> next) {
            this.item = item;
            this.pre = pre;
            this.next = next;
        }

    }

    void add(E item) {
        Node node = new Node(cursor, item, null);
        cursor = node;
    }

    E get() {
        return cursor.item;
    }

    Node<E> getNode() {
        return cursor;
    }

    Node<E> preNode() {
        if (cursor.pre != null) {
            cursor = cursor.pre;
            return cursor;
        } else {
            System.out.println("This node is head now");
            return cursor;
        }
    }

    public static void main(String[] args) {
        MyLinkList<Coffee> linkList = new MyLinkList<>();

        Coffee coffee = new Cappuccino();
        Coffee coffee1 = new Mocha();
        Coffee coffee2 = new Latte();
        Coffee coffee3 = new Americano();

        linkList.add(coffee);
        linkList.add(coffee1);
        linkList.add(coffee2);
        linkList.add(coffee3);
        System.out.println(linkList.preNode().item);
        System.out.println(linkList.getNode().pre.item);


    }


}
