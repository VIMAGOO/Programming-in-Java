package person;

import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vimago
 */
public class PersonListFile {

    private boolean exit;
    private Scanner sc;
    private List<Person> persons = createListOfPersons();

    public static void main(String[] args) {
        PersonListFile plf = new PersonListFile();
        plf.run();
    }

    private void run() {
        Menu menu = createMenu();
        exit = false;
        do {
            int option = menu.displayMenuAndGetOption();
            switch (option) {
                case 0: //exit
                    doExit();
                    break;
                case 1: //list all persons
                    doListAllPersons();
                    break;
                case 2: //load list from file
                    doLoadListFromFile();
                    break;
                case 3: //save list to file
                    doSaveListToFile();
                    break;
                case 4: //add person
                    doAddPerson();
                    break;
                case 5: //remove person
                    doRemovePerson();
                    break;
                case 6: //clear list
                    doClearList();
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (!exit);
    }

    private Menu createMenu() {
        Menu menu = new Menu("Person List");
        menu.addOption("Exit");
        menu.addOption("List all persons");
        menu.addOption("Load list from file");
        menu.addOption("Save list to file");
        menu.addOption("Add person");
        menu.addOption("Remove person");
        menu.addOption("Clear list");
        return menu;
    }

    /**
     * asks for confirmation and exits program
     */
    private void doExit() {
        sc = new Scanner(System.in);
        System.out.println("Are you sure you want to exit?");
        String option = sc.next().toUpperCase();
        switch (option) {
            case "Y":
                System.out.println("Okey! You are out!");
                exit = true;
                break;
            case "N":
                System.out.println("Okey!");
                exit = false;
                break;
            default:
                System.out.println("Invalid option.");
        }
    }
    
    /**
     * Creates a list of persons
     * @return the list of persons
     */
    private List<Person> createListOfPersons() {
        List<Person> data = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Random ran = new Random();
            String name = String.format("name%d", i);
            int age = ran.nextInt(18, 80);
            double salary = ran.nextDouble(10000, 40000);
            boolean single = ran.nextBoolean();
            data.add(new Person(name, age, salary, single));
        }
        return data;
    }
    
    /**
     * Lists all the persons
     */
    private void doListAllPersons() {
        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println("Number of persons displayed: " + persons.size());
    }
    
    /**
     * Saves the list to one file
     */
    private void doSaveListToFile() {
        int counter = 0;
        sc = new Scanner(System.in);
        System.out.println("Filename: ");
        String filename = sc.next();
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename, true))) {
            for (Person person : persons) {
                dos.writeUTF(person.getName());
                dos.writeInt(person.getAge());
                dos.writeDouble(person.getSalary());
                dos.writeBoolean(person.isSingle());
                counter++;
            }
            System.out.println(counter + " persons were written in the file: " + filename);
        } catch (IOException e) {
            System.out.println("Error writing the file.");
        }
    }
    
    /**
     * reads path to file from user,
     * reads list of persons from file
     * and reports result to user
     */
    private void doLoadListFromFile() {
        sc = new Scanner(System.in);
        int counter = 0;
        System.out.println("Filename: ");
        String filename = sc.next();
        List<Person> data = new ArrayList<>();
        //read data
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            while (dis.available() > 0) {                
                String name = dis.readUTF();
                int age = dis.readInt();
                double salary = dis.readDouble();
                boolean single = dis.readBoolean();
                data.add(new Person(name, age, salary, single));
                counter++;
            }
            persons = data;
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (EOFException e) {
            System.out.println("EOFException");
        } catch (IOException e) {
            System.out.println("IOException");
        }
        //display read data
        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println(counter + " persons loaded from file: "+ filename);
    }
    
    /**
     * Adds a person to the list
     * The person is added if:
     *  - Has a name that is not repeated.
     *  - Has an age greater than 0.
     *  - Has a salary greater or equal to 0.
     */
    private void doAddPerson() {
        sc = new Scanner(System.in);
        System.out.println("Input the name: ");
        String name = sc.next();
        System.out.println("Input the age: ");
        int age = sc.nextInt();
        System.out.println("Input the salary: ");
        double salary = sc.nextDouble();
        System.out.println("Input if single or not(Y/N):");
        String isSingle = sc.next().toUpperCase();
        Boolean single = false;
        switch(isSingle) {
            case "Y":
                single = true;
                break;
            case "N":
                single = false;
                break;
            default:
                System.out.println("Invalid option.");
        }
        if (age >= 0 && salary >= 0) {
        boolean isRepeated = false;
        for (Person person : persons) {
            if (person.getName().equals(name)) {
                isRepeated = true;
            }
        }
        if (!isRepeated) {
        persons.add(new Person(name, age, salary, single));
            System.out.println("Person added.");
        } else {
            System.out.println("Name is repeated.");
        }
        } else {
            System.out.println("Incorrect age or salary.");
        }
    }
    
    /**
     * Removes a person if the name is found
     * If it is removed shows a "person removed" message
     * If not shows a "person not found" message 
     */
    private void doRemovePerson() {
        sc = new Scanner(System.in);
        System.out.println("Input the name: ");
        String name = sc.next();
        boolean wasFound = false;
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getName().equals(name)) {
                persons.remove(persons.get(i));
                System.out.println("Person removed.");
                wasFound = true;
            }
        }
        if (!wasFound) {
            System.out.println("The person was not found.");
        }
    }
    
    /**
     * clears the list if the user wants (Y), if not the list is not cleared
     */
    private void doClearList() {
        sc = new Scanner(System.in);
        System.out.println("Are you sure you want to clear the list?(Y/N)");
        String option = sc.next().toUpperCase();
        switch (option) {
            case "Y":
                System.out.println("Okey! List cleared");
                persons.clear();
                break;
            case "N":
                System.out.println("Okey! List not cleaned");
                break;
            default:
                System.out.println("Invalid option.");
        }
    }
}
