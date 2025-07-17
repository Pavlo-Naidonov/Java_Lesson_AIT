package hw_27;

public class Book {
    //title (название), author (автор), genre (жанр), yearOfPublished (год издания)
    private String title;
    private String author;
    private String genre;
    private int yearOfPublished;

    public Book(String title, String author, String genre, int yearOfPublished){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.yearOfPublished = yearOfPublished;
    }

    public String getTitle(){return title;}
    public String getAuthor(){return author;}
    public String getGenre(){return genre;}
    public int getYearOfPublished(){return yearOfPublished;}

    public void setTitle(String title){this.title = title;}
    public void setAuthor(String author){this.author = author;}
    public void setGenre(String genre){this.genre = genre;}
    public void setYearOfPublished(int yearOfPublished){this.yearOfPublished = yearOfPublished;}

    @Override
    public String toString() {
        return "Книга: " +
                "Название='" + title + '\'' +
                ", автор='" + author + '\'' +
                ", жанр='" + genre + '\'' +
                ", год публикации=" + yearOfPublished +
                ' ';
    }
}