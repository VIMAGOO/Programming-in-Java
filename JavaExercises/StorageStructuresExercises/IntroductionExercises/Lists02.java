
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author vima2670
 */
public class Lists02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
//        names.add(new String("Peter"));
        names.add("Peter");
        names.add("Estela");
        names.add("Edurne");
        names.add("Carlos");
        names.add("Pablo");
        //
        System.out.println(names.toString());
        names.add(2, "David");
        System.out.println(names.toString());
        names.set(2, "Víctor");
        System.out.println(names.toString());
        //if we don't know the position of the name:
        String oldName = "Peter";
        String newName = "Manolo";
        if (names.indexOf(oldName) != 1) {
            names.set(names.indexOf(oldName), newName);
            System.out.println(names.toString());
            System.out.format("%s was replaced with %s succesfully.%n", oldName, newName);
        } else {
            System.out.format("%s was not found.%n", oldName);
        }
        names.sort(String::compareTo); //:: operador de resolució d'àmbit 
        System.out.println(names.toString());
        
        addSorted(names, "D");
        System.out.println(names.toString());
    }

    /**
     * Adds 'name' to 'data' keeping the order
     *
     * @param data the collection/list of names
     * @param name the new name to be added to the list
     */
    public static void addSorted(List<String> data, String name) {
        int minValue = 0;
        int maxValue = 0;
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < data.size(); i++) {
            if(name.compareTo(data.get(i)) > 0) {
                if (name.compareTo(data.get(i)) < minValue) {
                    minValue = name.compareTo(data.get(i));
                    index1 = data.indexOf(i);
                }
            } else {
               if (name.compareTo(data.get(i)) > maxValue) {
                    maxValue = name.compareTo(data.get(i));
                    index2 = data.indexOf(i);
                } 
            }
        }
        maxValue = maxValue + maxValue;
        if (maxValue > minValue) {
            data.add(index1, name);
        } else {
            data.add(index2, name);
        }
    }
}
