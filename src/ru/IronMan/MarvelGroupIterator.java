package ru.IronMan;

import java.util.Iterator;

public class MarvelGroupIterator implements Iterator<Marvel> {
    private int index = -1;


    public MarvelGroup marvelGroup;

    public MarvelGroupIterator(MarvelGroup marvelGroup) {
        this.marvelGroup = marvelGroup;
    }

    @Override
    public boolean hasNext() {
//        if (this.index < this.marvelGroup.sizeOflGroup()) {
//            return true;
//        }else {
//            return false;
//        }
        return this.index < this.marvelGroup.sizeOflGroup() -1;
    }

    @Override
    public Marvel next() {
        this.index++;
        return marvelGroup.getMarvel(this.index) ;
    }
}
