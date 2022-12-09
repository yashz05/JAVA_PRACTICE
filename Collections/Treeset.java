package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

    public static void main(String[] args) {
        //TreeSet auto Sorts the List

        TreeSet<Integer> ss = new TreeSet();

        ss.add(1);
        ss.add(10);
        ss.add(99);


        Iterator ll  = ss.iterator();

        while(ll.hasNext()){
            System.out.println(ll.next());

        }
    }
}
