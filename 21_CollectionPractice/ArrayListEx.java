package CollectionFrameworkPrcatice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListEx {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("Java");
        list.add("Python");
        list.add(9);
        Iterator show=list.iterator();
        while (show.hasNext()){
            Object element=show.next();
           if(element instanceof  Integer){
               System.out.println(element);
           }
        }
    }
}
