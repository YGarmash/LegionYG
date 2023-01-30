package lesson6;

public class Bank {
    public static void main(String[] args) {
        Manager manager = new Manager("Oleg",1, "02.03.1982", "Toronto");
        manager.hireEmployee();
        manager.receiveSalary();
        manager.toString();

        Clerk clerk = new Clerk("Moshe",2, "04.12.1971", "Toronto");
        clerk.answerCalls();
        clerk.receiveSalary();
        clerk.toString();

        Clerk clerk1 = new Clerk("Zigmund",4, "04.10.1991", "Toronto");
        clerk1.callCustomer();
        clerk1.receiveSalary();
        clerk1.toString();

        Clerk clerk2 = new Clerk("Yulia",5, "12.02.1989", "Toronto");
        clerk2.callCustomer();
        clerk2.receiveSalary();
        clerk2.toString();

        Accountant accountant = new Accountant("Kate",3, "15.07.1995", "Toronto");
        accountant.closeAccount();
        accountant.receiveSalary();
        accountant.toString();

        Accountant accountant1 = new Accountant("Ed",6, "30.01.1970", "Toronto");
        accountant1.openAccount();
        accountant1.receiveSalary();
        accountant1.toString();

        Accountant accountant2 = new Accountant("Olga",7, "06.03.1985", "Toronto");
        accountant2.createReports();
        accountant2.receiveSalary();
        accountant2.toString();

        Accountant accountant3 = new Accountant("Bill",8, "16.06.1969", "Toronto");
        accountant3.openAccount();
        accountant3.receiveSalary();
        accountant3.toString();

        Accountant accountant4 = new Accountant("Kiril",9, "10.10.2000", "Toronto");
        accountant4.closeAccount();
        accountant4.receiveSalary();
        accountant4.toString();
    }

}
