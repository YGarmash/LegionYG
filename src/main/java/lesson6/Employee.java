package lesson6;

public abstract class Employee {
    String name;
    int id;
    String title;
    String dateOfBirth;
    int salary;
    String address;

    public Employee(String name, int id, String dateOfBirth, String address) {
        this.name = name;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void receiveSalary(){
        System.out.println(this.name + " Receiving salary");
    }

    public String toString(){
        System.out.println("Name: " + name + ", Title: " + title + ", Address: " + address + ", Birth Date: " + dateOfBirth + ", Salary: " + salary);
        return null;
    }
}