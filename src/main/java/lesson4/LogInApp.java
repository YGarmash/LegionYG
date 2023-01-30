package lesson4;

public class LogInApp {
    public  String expectedUsername = "admin";
    public  String expctedPassword = "12345";

    public static void main(String[] args) {
        LogInApp logInApp = new LogInApp();
        //boolean success = logInApp.verifyUser("Admin", "12345");
        //System.out.println(" Login success " + success);
        logInApp.stringExamples();
    }
    public boolean verifyUser(String username, String password) {
        username = username.toLowerCase();
        password = password.toLowerCase();
        boolean success = false;
        //if (username.isEmpty() || password.isEmpty()){
        if (username.length()==0 || password.length()==0){
            System.out.println(" The username or password is empty");
        }
        else if (username.isBlank() || password.isBlank()) {
            System.out.println(" The username or password is blank");
        }
        else if (!username.equals(expectedUsername) || !password.equals(expctedPassword)) {
            System.out.println(" The username or password doesn't match the expected value");
        }
        else {
            success = true;
        }
        return success;

    }
    public void stringExamples(){
        String txt1 = "dog";
        String txt2 = "catalog";
        //System.out.println(txt2.contains(txt1));

        //System.out.println(txt2.replace("cat", txt1));

        System.out.println(txt1.charAt(0));
        System.out.println(txt1.charAt(1));
        System.out.println(txt1.charAt(2));



    }
}
