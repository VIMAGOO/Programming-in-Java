package students;

import java.util.Objects;

/**
 *
 * @author vima2670
 */
public class Student implements Comparable<Student> {

    private String name;
    private int qualification;

    public Student(String name, int qualification) {
        this.name = name;
        this.qualification = qualification;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQualification() {
        return qualification;
    }

    public void setQualification(int qualification) {
        this.qualification = qualification;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("name=").append(name);
        sb.append(", qualification=").append(qualification);
        sb.append("} \n");
        return sb.toString();
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

}
