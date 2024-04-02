
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * LAFO
 * FIFO
 * <e> tot tipus de dada
 * ArrayList --> ...|1|2|3|4|5|6|7|...
 * LinkedList --> ...|2|1|4|7|3|5|6|...
 * @author vima2670
 */
public class Lists01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Collection<Integer> data = new ArrayList<>(); //<> operador diamant
        List<Integer> data = new ArrayList<>(); //<> operador diamant
        //add data to collection
        data.add(1);
        data.add(10);
        data.add(5);
        data.add(13);
        //size of the collection
        System.out.println("Number of elements: "+data.size());
        //show elements
        //iterating with for-each loop
        System.out.println("Show iterating with for-each loop: ");
        for(Integer elem: data) {
            System.out.println(elem);
        }
        //iterating with iterator
        System.out.println("Show iterating with iterator: ");
        Iterator<Integer> iter = data.iterator();
        while (iter.hasNext()) {
            Integer elem = iter.next();
            System.out.println(elem);
        }
        //toString
        System.out.println("Show with toString(): ");
        System.out.println(data.toString());
        //COLLECTION
        System.out.println("COLLECTION METHODS");
        System.out.println("Collection contains value 1?: " +data.contains(1));
        System.out.println("Collection contains value 12?: " +data.contains(12));
        //LIST
        System.out.println("LIST METHODS");
        System.out.println("What is the position of 10?: "+data.indexOf(10));
        System.out.println("What is the position of 11? (does not exist): "+data.indexOf(11));
        System.out.println("Element at index 1: "+data.get(1));
        //modifying an element
        System.out.println("Modifying an element: ");
        System.out.println("Elements before: "+data.toString());
        data.set(3, 25);
        System.out.println("Elements after: "+data.toString());
        //iterate with for loop
        System.out.println("Iterating with for loop: ");
        for (int i = 0; i < data.size(); i++) {
            System.out.format("data[%d]=%d%n", i, data.get(i));
        }
        //remove elements
        System.out.println("Remove element at position 1: "+data.remove(1));
        System.out.println("Elements after: "+data.toString());
        System.out.println("Remove element whose value is 1: "+data.remove(Integer.valueOf(1)));
        System.out.println("Elements after: "+data.toString());
    }
    
}
