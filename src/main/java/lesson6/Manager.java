package lesson6;

public class Manager extends Employee {
    int salary = 10000;
    String title = "Manager";
    public Manager(String name, int id, String dateOfBirth, String address) {
        super(name, id, dateOfBirth, address);
        setSalary(this.salary);
        setTitle(this.title);
    }

    public void hireEmployee(){
        System.out.println(this.name + " hiring employee");
    }
    public void fireEmployee(){
        System.out.println(this.name + " firing employee");
    }
}
