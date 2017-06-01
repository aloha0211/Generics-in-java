package ch02_04;

import java.util.ArrayList;

/**
 * Created by GamePC on 6/1/2017.
 */
public class EliminateDuplicates {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("red");
        list.add("green");
        list.add("blue");
        list.add("red");
        list.add("green");
        list.add("yellow");
        list.add("orange");
        list.add("blue");
        ArrayList<String> nodups = removeDups(list);
        System.out.println(list);
        System.out.println(nodups);
    }

    private static <E extends Comparable<E>> ArrayList<E> removeDups(ArrayList<E> list) {
        if (list.size() == 0) {
            return list;
        }
        boolean found = false;
        ArrayList<E> noDups = new ArrayList<>();
        noDups.add(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j< noDups.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) == 0) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                noDups.add(list.get(i));
            } else {
                found = false;
            }
        }
        return noDups;
    }
}
