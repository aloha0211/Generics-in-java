/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02_02;

/**
 *
 * @author Producer
 */
public class GenericMethodExample {
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Integer[] ints = {10, 20, 30, 40, 50, 60, 70, 80};
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday"};

        print(ints);
        print(daysOfWeek);
        System.out.println(countGreaterThan(ints, 50));
        System.out.println(countGreaterThan(daysOfWeek, "mon"));
    }

    private static <E> void print(E[] list) {
        for (E element: list) {
            System.out.println(element + " ");
        }
        System.out.println();
    }

    private static <T extends Comparable<T>> int countGreaterThan(T[] list, T elem) {
        int count = 0;
        for (T element: list) {
            if (element.compareTo(elem) > 0)
                count++;
        }
        return count;
    }
    
}
