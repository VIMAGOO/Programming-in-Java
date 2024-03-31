package empresa;

/**
 *
 * @author vimago
 */
public class Employee extends Person {
    private String salary;
    private String job;
    private String department;
    private int hireYear;

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    @Override
    public String getNif() {
        return nif;
    }

    @Override
    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSurname1() {
        return surname1;
    }

    @Override
    public void setSurname1(String surname1) {
        this.surname1 = surname1;
    }

    @Override
    public String getSurname2() {
        return surname2;
    }

    @Override
    public void setSurname2(String surname2) {
        this.surname2 = surname2;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int getTelf() {
        return telf;
    }

    @Override
    public void setTelf(int telf) {
        this.telf = telf;
    }

    @Override
    public String getBirthdate() {
        return birthdate;
    }

    @Override
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public Employee(String salary, String job, String department, int hireYear, String nif, String name, String surname1, String surname2, String address, int telf, String birthdate) {
        super(nif, name, surname1, surname2, address, telf, birthdate);
        this.salary = salary;
        this.job = job;
        this.department = department;
        this.hireYear = hireYear;
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
        sb.append("Empleat{");
        sb.append("salary=").append(salary);
        sb.append(", job=").append(job);
        sb.append(", department=").append(department);
        sb.append(", hireYear=").append(hireYear);
        sb.append('}');
        return sb.toString();
    }
    
}
