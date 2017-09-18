package ru.javago.behavioral.iterator.source;

import ru.javago.behavioral.iterator.source.base.Container;
import ru.javago.behavioral.iterator.source.base.Iterator;
import ru.javago.behavioral.iterator.source.realization.NameRepository;

public class Main {

    public static void main(String[] args) {
        Container namesRepository = new NameRepository();
        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
