package edu.ithaca.dragon.datastructures.stack;

import java.security.NoSuchAlgorithmException;
import java.util.NoSuchElementException;

import edu.ithaca.dragon.datastructures.node.LinkedNode;

public class LinkedStack<T> implements Stack<T>{

    private LinkedNode<T> top;

    public LinkedStack(){
        top = null;
    }

    @Override
    public void push(T item) {
        LinkedNode<T> newNode = new LinkedNode<T>(item);
        newNode.setNext(top);
        top = newNode;
    }

    @Override
    public T pop() {
        if(isEmpty()){
            throw new NoSuchElementException();

        }
        else{
            T popItem = top.getItem();
            top = top.getNext();
            return popItem;
        }
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public void makeEmpty() {
        if(isEmpty()){
            throw new NoSuchElementException();

        }
        else{
            top = null;
        }
    }
    
}
