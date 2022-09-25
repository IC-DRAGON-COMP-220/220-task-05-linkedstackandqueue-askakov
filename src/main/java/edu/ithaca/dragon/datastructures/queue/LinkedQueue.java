package edu.ithaca.dragon.datastructures.queue;

import java.util.NoSuchElementException;

import edu.ithaca.dragon.datastructures.node.LinkedNode;

public class LinkedQueue<T> implements Queue<T>{

    private LinkedNode<T> front;
    private LinkedNode<T> end;

    public LinkedQueue(){
        front = null;
        end = null;
    }

    @Override
    public void enqueue(T item) {
        LinkedNode<T> newNode = new LinkedNode<T>(item);
        if (front == null){
            front = newNode;
            end = newNode;
        }
        else {
            end.setNext(newNode);
            end = newNode;
        }
    }

    @Override
    public T dequeue() {
        if(isEmpty()){
            throw new NoSuchElementException();

        }
        else{
            T dequeueItem = front.getItem();
            front = front.getNext();
            return dequeueItem;
        }
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public void makeEmpty() {
        if(isEmpty()){
            throw new NoSuchElementException();

        }
        else{
            front = null;
        }
    
    }
}
