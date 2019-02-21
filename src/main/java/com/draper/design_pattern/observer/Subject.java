package com.draper.design_pattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observerList = new ArrayList<>();

    public void attach(Observer observer) {
        observerList.add(observer);
        System.out.println("增加了观察者" + observer.getName());
    }

    public void dettach(Observer observer) {
        observerList.remove(observer);
        System.out.println("删除了观察者" + observer.getName());
    }

    public void notifyObserver() {
        System.out.println("灰太狼要搞事情咯");
        observerList.forEach(s -> System.out.println("通知了" + s.getName()));
    }


}
