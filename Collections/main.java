package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//CUSTOM ARRAY LIST WITH OBJECTS

class animal {
    int animal_id;
    String animal_name;
}

public class main {
    // The Collection in Java is a framework that provides an architecture
    // to store and manipulate the group of objects.
    // Java Collections can achieve all the operations that you perform on
    // a data such as searching, sorting, insertion, manipulation, and deletion.
    // Java Collection means a single unit of objects. Java Collection framework
    // provides many interfaces
    // (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList,
    // PriorityQueue, HashSet, LinkedHashSet,
    // TreeSet).

    public static void main(String[] args) {
        // We can call array list like below
        List<animal> ll = new ArrayList<>();
        // Or we can also call like below comment
        // ArrayList<animal> ll = new ArrayList<>();

        // Adding to array list
        // create obj

        animal pig = new animal();
        pig.animal_id = 19;
        pig.animal_name = "PIG";

        // add to list

        ll.add(pig);

        // add multiple animals to list

         for (int i = 0; i < 5; i++) {
            animal ani = new animal();
            ani.animal_id = i;
            ani.animal_name = "aniname"+i;
            ll.add(ani);
         }

        //to triverse the list user Itrator class 
        Iterator<animal> iterator = ll.iterator();  

        while(iterator.hasNext()){
            System.out.println();
            System.out.println(iterator.next().animal_id);
            System.out.println(iterator.next().animal_name);
           
        }


    }

}
