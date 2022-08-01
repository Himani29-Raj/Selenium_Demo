package library;

//import java.util.Objects;

public class Book {
    private final  String tittle;
    private final String author;

    public Book(String tittle,String author){
        System.out.println("This is book");
        this.tittle=tittle;
        this.author=author;
    }

    public String getTittle() {
        return tittle;
    }

    public String getAuthor() {
        return author;
    }
    public String toString(){
        return getTittle() + ":" + getAuthor();
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Book){
            Book b = (Book)o;
                return b.getTittle().equals(this.getTittle()) && b.getAuthor().equals(this.getAuthor());
        }
            else return false;
    }

}
