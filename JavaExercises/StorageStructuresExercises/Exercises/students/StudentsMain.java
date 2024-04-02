package students;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author vima2670
 */
public class StudentsMain {

    private List<Student> students;

    public static void main(String[] args) {
        StudentsMain sm = new StudentsMain();
        sm.run();
    }

    private void run() {
        students = new LinkedList<Student>();
        //populate list with data
        generateStudents();
        //show students
        System.out.println(students);
        //find student
        String nameToSearch = "Name00";
        Student student = findStudentByName(nameToSearch);
        if (student != null) {
            System.out.format("Student %s successfully found.\n", nameToSearch);
            System.out.println(student.toString());
        } else {
            System.out.format("Student %s not found.", nameToSearch);
        }
        //list of students that passed
        List<Student> passList = getStudentsGreaterThan(5);
        System.out.println(passList);
        System.out.println("Number of students that passed: " + passList.size());
        amendQualif(1);
        System.out.println(students);
        //sort
        System.out.println("Students sorted by qualification: ");
        students.sort(Comparator.comparing(Student::getQualification));
        System.out.println(students);
        System.out.println("Students sorted by name: ");
        students.sort(Comparator.comparing(Student::getName));
        System.out.println(students);
        //
        System.out.println("Students sorted by reversed name: ");
        students.sort(Comparator.comparing(Student::getName).reversed());
        System.out.println(students);

    }

    private void generateStudents() {
        for (int i = 0; i < 20; i++) {
            String name = String.format("Name%02d", i + 1);
            Random ran = new Random();
            int nota = ran.nextInt(0, 11);
            students.add(new Student(name, nota));
        }
    }

    /**
     * Finds a student with the name that the user will provide
     *
     * @param name the name of the student to search
     * @return the student found or null if it was not found
     */
    private Student findStudentByName(String name) {
        Student studentToSearch = new Student(name);
        Student found;
        int index = students.indexOf(studentToSearch);
        if (index != -1) {
            found = students.get(index);
        } else {
            found = null;
        }
        return found;
    }

    /**
     * Get all student with a qualification greater or equal than the one the
     * user provides
     *
     * @param qualification the mark the user provides
     * @return returns a the list with the students that have a mark greater
     * than the user-provided mark
     */
    private List<Student> getStudentsGreaterThan(int qualification) {
        List<Student> result = new LinkedList<Student>();
        for (Student s : students) {
            if (s.getQualification() >= qualification) {
                result.add(s);
            }
        }
        return result;
    }

    /**
     * Adds 'difference' to qualifications of all students Qualifications must
     * not be negative nor grater than 10
     *
     * @param difference the difeference of qualification to apply
     */
    private void amendQualif(int difference) {
        for (Student s : students) {
            if (difference > 0) {
                if (s.getQualification() <= 9) { //if difference is positive the change will apply at students with a mark inferior than 9
                    s.setQualification(s.getQualification() + difference);
                }
            } else {
                if (s.getQualification() >= 1) { //if difference is negative the change will apply at students with marks greater than 1
                    s.setQualification(s.getQualification() + difference);
                }
            }
        }
    }
}
