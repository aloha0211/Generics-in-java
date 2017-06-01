/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02_01;


/**
 * @param
 * @author Producer
 */
public class Person<E> {
    private E e;

    public void setPerson(E e) {
        this.e = e;
    }

    public E getPerson() {
        return e;
    }


}
