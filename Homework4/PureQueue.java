/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homw.hw_2;

/**
 *
 * @author Vedant
 */
public interface PureQueue<E>{
    int size();
    boolean isEmpty();
    void enqueue(E element);
    E dequeue();
    E front();
}