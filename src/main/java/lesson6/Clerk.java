package lesson6;

public class Clerk extends Employee {
    int salary = 3000;
    String title = "Clerk";
    public Clerk(String name, int id, String dateOfBirth, String address) {
        super(name, id, dateOfBirth, address);
        setSalary(this.salary);
        setTitle(this.title);
    }

    public void  callCustomer(){
        System.out.println(this.name + "  calling the customer");
    }
    public void answerCalls(){
        System.out.println(this.name + " answering incoming call");
    }
}
