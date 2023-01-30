public class Book {
    //describe a book, create all the variables we need
    // name, author, id, price in USD, availability
    // using conversion rate, calculate EUR Price of book
    //print all the books details including prices
    public static void main(String[] args) {
        String bookName = "Harry Potter";
        String authorName = "J.K. Rowling";
        int id = 1;
        double priceInUSD = 10.5;
        boolean isAvailable = true;

        Book book1 = new Book();
        book1.createNewBook("Harry Potter", "J.K Rowling", 1, 10.5, false);



    }
    public void createNewBook (String bookName, String authorName, int id, double priceInUSD, boolean isAvailable){
        double rate = 1.1;
        double priceInEUR = priceInUSD * rate;

        System.out.println("Book name is:" + bookName);
        System.out.println("Book ID is:" + id);
        System.out.println("Book price:" + priceInUSD + " USD " + priceInEUR + " EUR ");
        System.out.println("Book is Available:" + isAvailable);
    }
}
