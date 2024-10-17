package com.example.iterable;

import java.util.*;

import java.util.Iterator;
import java.util.Spliterator;

public class Bag<T> implements Container<T> {
    //fields
    private ArrayList<T> bag;

    //no arg constructor
    public Bag(){
        this.bag = new ArrayList<>();
    }

    //parameterized constructor
    public Bag(int initSize){
        this.bag = new ArrayList<>(initSize);
    }

    //methods
    @Override
    public boolean isEmpty(){
        return bag.isEmpty();
    }

    @Override
    public int size(){
        return bag.size();
    }

    @Override
    public void add(T item){
        this.bag.add(item);
    }

    @Override
    public Iterator<T> iterator(){
        return new BagIterator();
    }

    public class BagIterator implements Iterator<T>{
        private int index = 0;

        @Override
        public boolean hasNext(){
            return index < bag.size();
        }

        @Override
        public T next(){
            return bag.get(index++);
        }

    }

}


