package ch02_03;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GamePC on 6/1/2017.
 */
public class GenericList<T> implements GenericInterface<T> {

    private List<T> list;

    public GenericList() {
        list = new ArrayList<>();
    }

    @Override
    public void add(T t) {
        list.add(t);
    }
}
