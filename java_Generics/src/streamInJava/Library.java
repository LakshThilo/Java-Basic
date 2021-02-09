package streamInJava;

import java.util.ArrayList;

public class Library {

    public static void main(String[] args) {

        ArrayList<Book> books = populateLibrary();
        /**
         * First of all, I call the stream method on the books collection.
         * Next I can use the filter method to check if the author begins with J.
         * Streams support lambdas, so I can use a lambda expression here.
         * I write book which is just the name I am using for the
         * current element in the collection. Then I use the arrow operator and
         * in the method body I add a return statement. In the return statement,
         * I get the author's name with a getAuthor method and see if it starts with J.
         * If it does, then it will return true and the book will be added to the string.
         * Finally, I can use the forEach method to print out the Stream. If I run my program,
         * all of the books with authors beginning with J are printed to the terminal
         */
        books.stream().filter(book -> { // for the parallel Stream we can use this method instead of stream() books.parallelStream().filter(book -> {
            return book.getauthor().startsWith("J");
        }).filter(book -> {
            return book.getTitle().startsWith("E");
        }).forEach(System.out::println);

        /**
         * The filter method I used in this example is a lazy method.
         * All it does is adds books with authors beginning with J to the new string
         *
         */
    }

    static ArrayList<Book> populateLibrary(){
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Alice Walker", "The Color Purple"));
        books.add(new Book("Alice Walker", "Meridian"));
        books.add(new Book("Toni Morrison", "Beloved"));
        books.add(new Book("Toni Morrison", "Jazz"));
        books.add(new Book("Toni Morrison", "Paradise"));
        books.add(new Book("John Steinbeck", "The Grapes of Wrath"));
        books.add(new Book("John Steinbeck", "East of Eden"));
        books.add(new Book("Kazuo Ishiguro", "The Remains of the Day"));
        books.add(new Book("Kazuo Ishiguro", "Never Let Me Go"));
        books.add(new Book("Kazuo Ishiguro", "The Buried Giant"));
        books.add(new Book("Jane Austen", "Pride and Prejudice"));
        books.add(new Book("Jane Austen", "Emma"));
        books.add(new Book("Jane Austen", "Persuasion"));
        books.add(new Book("Jane Austen", "Mansfield Park"));
        books.add(new Book("Chinua Achebe", "Things Fall Apart"));
        books.add(new Book("Chinua Achebe", "No Longer at Ease"));
        books.add(new Book("Chinua Achebe", "Home and Exile"));
        return books;

    }

}
