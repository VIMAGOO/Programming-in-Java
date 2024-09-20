package csv;

/**
 * PersonTextFilePersistMain.java
 * Exemple of conversion between objects and CSV string.
 *
 * @author vimago
 */

public class PersonCsvMain {

    public static void main(String args[]) {
        final String myDelimiter = ";";  //delimiter used to separate fields.
        //instantiate a new Person
        Person p1 = new Person("000A", "Peter", "1111");
        //convert to csv.
        String csvFormat = CsvHelper.toCsv(p1, myDelimiter);
        System.out.println(csvFormat);
        //from a CSV string.
        String csv = "001B;John;2222";
        //convert to Person.
        Person p2 = CsvHelper.fromCsvPerson(csv, myDelimiter);
        System.out.println(p2.toString());
    }

}