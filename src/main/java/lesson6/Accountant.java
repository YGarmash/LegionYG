package lesson6;

public class Accountant extends Employee {
    int salary = 5000;
    String title = "Accountant";
    public Accountant(String name, int id, String dateOfBirth, String address) {
        super(name, id, dateOfBirth, address);
        setSalary(this.salary);
        setTitle(this.title);
    }

    public void openAccount() {
        System.out.println(this.name + " opening a new account");
    }

    public void closeAccount() {
        System.out.println(this.name + " closing account");
    }

    public void createReports() {
        System.out.println(this.name + " creating reports");
    }
}
