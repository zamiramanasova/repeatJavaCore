package com.company.lessonFourSwitch.algoritm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IteratorList {
    public static void main(String[] args) {

        /**
         * функция удаления с итератора с помощью метода remove.
         */
        List<Integer> list = new ArrayList<>();
        list.add(0,12);
        list.add(1,13);
        list.add(2,14);
        list.add(3,15);

        Iterator iterator = list.iterator();

        while(iterator.hasNext()) {
            Object element = iterator.next();
            if (element.equals(12)){
                iterator.remove();
            }
        }
        System.out.println(list);

    }

}
