package cn.tjut.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class testCollectionIterator {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(1);
        col.add(2);
        col.add(3.1);
//        for (Object c : col){
//            System.out.println(c);
//        }
        Iterator it = col.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
