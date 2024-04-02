package students;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Proves in order to sort the students collection
 *
 * @author vima2670
 */
public class StudentSort {

    List<Student> students;

    public static void main(String[] args) {
        StudentSort ss = new StudentSort();
        ss.run();
    }

    private void run() {
        students = new ArrayList<Student>();
        //generate students
        generateStudents();
        //print list of students
        System.out.println("Students without sort: ");
        printList();
        //sort students by name
        System.out.println("Students sorted by name:");
        students.sort(null);
        printList();
        //sort students by qualification
        System.out.println("Students sorted by qualification:");
        System.out.println("Less to greater: ");
        students.sort(new StudentsComparatorByQualification());
        printList();
        System.out.println("Greater to less: ");
        students.sort(new StudentsComparatorByQualification().reversed());
        printList();
        //sort students by name length
        System.out.println("Students sorted by legnth name: ");
        students.sort(new StudentComparatorByNameLength());
        printList();

    }

    private void generateStudents() {
        for (int i = 0; i < 20; i++) {
            String name = null;
            Random ran = new Random();
            int lletra = ran.nextInt(0, 2);
            switch (lletra) {
                case 0:
                    name = String.format("A1%02d", i + 1);
                    break;
                case 1:
                    name = String.format("B111%02d", i + 1);
                    break;
                case 2:
                    name = String.format("C22%02d", i + 1);
                    break;
            }
            int nota = ran.nextInt(0, 11);
            students.add(new Student(name, nota));
        }
    }

    private void printList() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
