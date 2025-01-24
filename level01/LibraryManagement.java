package level01;

//create class Book
class Book {
    String title;
    int publicationYear;
//constructor
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    void displayInfo(){
        System.out.println(" booktitle " + title + " publicationYear " + publicationYear);
    }
}

class Author extends Book {
    String name;
    String bio;
//create constructor
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }
//methode calling
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println( " author name " + name + " bio " + bio);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        //object creation
        Author author = new Author("harryporter", 2004, "nimish", "this is a harrypotter book");
       //calling displayInfo methode
        author.displayInfo();
    }
}
