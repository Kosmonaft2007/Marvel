package ru.IronMan;

import java.util.Iterator;
import java.util.List;

public class MarvelGroup implements Iterable<Marvel>{
    public List<Marvel> marvelList;


    public MarvelGroup(List<Marvel> marvelList) {
        this.marvelList = marvelList;
    }

    public int sizeOflGroup() {
        return this.marvelList.size();
    }

    public Marvel getMarvel(int index) {
        return this.marvelList.get(index);
    }

    @Override
    public Iterator<Marvel> iterator() {
        return new MarvelGroupIterator(this);
    }
}
