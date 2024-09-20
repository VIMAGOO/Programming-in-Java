package csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author vimago
 */
public class PersonListFile {
        private List<Person> persons;
        private boolean exit;
        private Scanner sc;
    public static void main(String[] args) {
       PersonListFile plf = new PersonListFile();
       plf.run();
    }

    private void run() {
        sc = new Scanner(System.in);
        persons = new ArrayList<>();
        Menu menu = createMenu();
        do {
            int option = menu.displayMenuAndGetOption();
            switch(option) {
                case 0: //Exit
                    doExit();
                case 1: //List all persons
                    doListAllPersons();
                    break;
                case 2: //Add a person
                    doAddPerson();
                    break;
                case 3: //Remove a person
                    doRemovePerson();
                    break;
                case 4: //Load data from file
                    doLoadDataFromFile();
                    break;
                case 5: //Save data to file
                    doSaveDataToFile();
                    break;
                default:
                    System.out.println("Bad option.");
                    break;
            }
        } while(!exit);
    }

    private Menu createMenu() {
        Menu menu = new Menu("Person list manager");
        menu.addOption("Exit");
        menu.addOption("List all persons");
        menu.addOption("Add a person");
        menu.addOption("Remove a person");
        menu.addOption("Load data from file");
        menu.addOption("Save data to file");
        return menu;
    }
    
    
    /**
     * Ask for confirmation and if so, exits the application
     */
    private void doExit() {
        System.out.println("Do you want to exit?(Y/N)");
        String option = sc.next();
            switch (option) {
                case "Y":
                    exit = true;
                    break;
                case "N":
                    exit = false;
                    break;
                default:
                    System.out.println("Bad answer.");
                    break;
            }
        
    }
    
    private void doListAllPersons() {
        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println("Nombre d'elements: " + persons.size());
    }
    
    /**
     * Reads file name from user;
     * Reads file and saves in list
     */
    private void doLoadDataFromFile() {
        System.out.println("Input path to CSV file to read: ");
        String filename = sc.next();
        try (BufferedReader sIn = new BufferedReader(new FileReader(filename))){
            String line;
            while((line = sIn.readLine()) != null) {
                Person p = CsvHelper.fromCsvPerson(line, ";");
                if(p != null) {
                    persons.add(p);
                }
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found.");
        } catch (IOException ex) {
            System.out.println("Error reading file.");
        }
    }

    private void doAddPerson() {
        System.out.println("Input the NIF:");
        String nif = sc.next();
        System.out.println("Input the name:");
        String name = sc.next();
        System.out.println("Input the phone:");
        String phone = sc.next();
        //TODO nif comprove not repeats.
        persons.add(new Person(nif, name, phone));
    }

    private boolean doRemovePerson() {
        boolean success = false;
        System.out.println("Input the NIF:");
        String nif = sc.next();
        for(int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getNif().equals(nif)) {
                persons.remove(persons.get(i));
                success = true;
            }
        }
        return success;
    }

    private void doSaveDataToFile() {
        
    }
}
