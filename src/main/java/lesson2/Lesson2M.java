package lesson2;

public class Lesson2M {
    public static void main(String[] args) {
        Lesson2M lesson3 = new Lesson2M();
        //lesson3.printUserInfo("John Doe", 2);
        boolean isBonusAvailable = true;
        lesson3.checkScore("John Doe", 2, 40, isBonusAvailable);
        lesson3.checkScore("Mark Smith", 3, 50, isBonusAvailable);
        lesson3.checkScore("Anna Smith", 4, 60, isBonusAvailable);
    }
    public void printUserInfo(String userName, int userId){

        System.out.println("The user name is " + userName);
        System.out.println("The user ID is " + userId);
    }
    public void checkScore(String userName, int userId, int userScore, boolean isBonusAvailable){


        System.out.println("The user name is " + userName);
        System.out.println("The user ID is " + userId);

        if (userName.equals ("John Doe")){
            userScore = userScore + 20;

        }

        if (isBonusAvailable){
            userScore = userScore + 10;
        }
        if (userScore>100 || userScore<0){
            System.out.println("Error");
        }
        else if (userScore>=60){
            System.out.println("Pass!");
        }
        else{
            System.out.println("Fail!");
        }
    }
}
