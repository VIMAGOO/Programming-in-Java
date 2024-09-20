package person;

import java.util.Objects;

/**
 *
 * @author vimago
 */
public class Person {
    private String name;
    private int age;
    private double salary;
    private boolean single;

    public Person(String name, int age, double salary, boolean single) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.single = single;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isSingle() {
        return single;
    }

    public void setSingle(boolean single) {
        this.single = single;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Person other = (Person) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person{");
        sb.append("name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", salary=").append(salary);
        sb.append(", single=").append(single);
        sb.append('}');
        return sb.toString();
    }
    
    
}
