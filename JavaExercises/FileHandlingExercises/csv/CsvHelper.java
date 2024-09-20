package csv;

/**
 * CSVHelper.java
 * Utility class to perform convertions between csv and objects.
 *
 * @author vimago
 */
public class CsvHelper {

    /**
     * toCsv() Converts object to CSV.
     *
     * @param obj: object to be converted.
     * @param delimiter: delimiter to be used between fields.
     * @return String with object data in CSV format.
     */
    public static String toCsv(Person obj, String delimiter) {
        return String.format("%s%s%s%s%s",
                obj.getNif(), delimiter, obj.getName(), delimiter, obj.getPhone());
    }

    /**
     * fromCsv() Converts CSV String to object.
     *
     * @param s: string to be converted.
     * @param delimiter: delimiter to be used between fields.
     * @return Person object with data contained in String s or null in case of error.
     */
    public static Person fromCsvPerson(String s, String delimiter) {
        final int objNumFields = 3;  //number of attributes of Person.
        Person p;
        String[] tokens = s.split(delimiter);
        if (tokens.length == objNumFields) {
            String nif = tokens[0];
            String name = tokens[1];
            String phone = tokens[2];
            p = new Person(nif, name, phone);
        } else {
            p = null;
        }
        return p;
    }
}