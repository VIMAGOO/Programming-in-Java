package csv;

/**
 * Person.java
 * TAD Person.
 *
 * @author vimago

public class Person {

    /*======  attributes =======*/
    private String nif;
    private String name;
    private String phone;

    /*======  constructors =======*/
    /**
     * Person() Default constructor.
     */
    public Person() {

    }

    /**
     * Person() Full initialitzer constructor.
     * @param nif
     * @param name
     * @param phone
     */
    public Person(String nif, String name, String phone) {
        this.nif = nif;
        this.name = name;
        this.phone = phone;
    }

    /**
     * Person() Copy constructor.
     * @param other
     */
    public Person(Person other) {
        this.nif = other.nif;
        this.name = other.name;
        this.phone = other.phone;
    }

    /*======  accessors =======*/
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /*======  methods =======*/
    /**
     * toString() Builds a String representation of the object.
     *
     * @return String representation.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person{");
        sb.append("nif=").append(nif);
        sb.append(", name=").append(name);
        sb.append(", phone=").append(phone);
        sb.append('}');
        return sb.toString();
    }

    /**
     * equals() Compares two objects. Two Person objects are equal if their
     * nif's are equal.
     *
     * @return true if the two objects are equal to each other, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        boolean b;
        if (obj == null) {
            b = false;
        } else {
            if (this == obj) {
                b = true; //the same object.
            } else {
                if (obj instanceof Person other) { //the same class.
                    //Person other = (Person) obj; //convert to Person.
                    b = this.nif.equals(other.nif);
                } else {
                    b = false;
                }
            }
        }
        return b;
    }
}
