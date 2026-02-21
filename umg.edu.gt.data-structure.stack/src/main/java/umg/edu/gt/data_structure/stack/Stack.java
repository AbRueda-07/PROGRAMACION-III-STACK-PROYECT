package umg.edu.gt.data_structure.stack;

import java.util.EmptyStackException;

public class Stack<T> {

    private Node<T> top;
    private int size;

    private static class Node<T>{

        T data;
        Node<T> next;

        Node(T data){
            this.data = data;
        }
    }

    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = top;
        top = newNode;
        size++;
    }


    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = top.data;
        top = top.next;
        size--;
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    //Método solicitado; cantidad de elementos
    public int getSize(){
        return size;
    }

    //Devuelve el nodo inicial (que es la base de la pila)
    public T getNodeInit() {
        if (isEmpty()) {
            return null;
        }
        Node<T> current = top;
        while (current.next != null){
            current = current.next;
        }
        return current.data;
    }
}