package com.rajat.generics;

import java.util.ArrayList;

/**
 * @author rajatsrivastava
 **/
//public class MyCustomList<T> {
public class MyCustomList<T extends Number> {
    ArrayList<T> list = new ArrayList();

    public void addElement(T element) {
        list.add(element);
    }

    public void removeElement(T element) {
        list.remove(element);
    }

    @Override
    public String toString() {
        return "MyCustomList{" +
                "list=" + list +
                '}';
    }

    public T get(int i) {
        return list.get(i);
    }
}
