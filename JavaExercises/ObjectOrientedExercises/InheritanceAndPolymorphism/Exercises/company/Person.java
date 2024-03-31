package empresa;

import java.util.Objects;

/**
 *
 * @author vimago
 */
public class Person {
    protected String nif;
    protected String name;
    protected String surname1;
    protected String surname2;
    protected String address;
    protected int telf;
    protected String birthdate;

    public Person(String nif, String name, String surname1, String surname2, String address, int telf, String birthdate) {
        this.nif = nif;
        this.name = name;
        this.surname1 = surname1;
        this.surname2 = surname2;
        this.address = address;
        this.telf = telf;
        this.birthdate = birthdate;
    }

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

    public String getSurname1() {
        return surname1;
    }

    public void setSurname1(String surname1) {
        this.surname1 = surname1;
    }

    public String getSurname2() {
        return surname2;
    }

    public void setSurname2(String surname2) {
        this.surname2 = surname2;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelf() {
        return telf;
    }

    public void setTelf(int telf) {
        this.telf = telf;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.nif);
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
        return Objects.equals(this.nif, other.nif);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nif=").append(nif);
        sb.append(", name=").append(name);
        sb.append(", surname1=").append(surname1);
        sb.append(", surname2=").append(surname2);
        sb.append(", address=").append(address);
        sb.append(", telf=").append(telf);
        sb.append(", birthdate=").append(birthdate);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}
