package hw_28;

public class BookArray {
    private Book[] books;
    private int size;
    private int capacity;

    // Конструктор для пустого массива
    public BookArray(){
        this.capacity = 10;
        this.books = new Book[capacity];
        this.size = 0;
    }

    // Конструктор для инициализации существующим массивом
    public BookArray(Book[] books){
        this.books = books;
        this.size = books.length;
        this.capacity = books.length;
    }

    // Метод для добавления книги
    public void addBook(Book book){
        if (size == capacity){
            resize();
        }
        books[size] = book;
        size++;
    }

    // Метод для увеличения размера массива
    private void resize() {
        capacity = capacity * 2;
        Book[] newBooks = new Book[capacity];
        for (int i = 0; i < size; i++){
            newBooks[i] = books[i];
        }
        books = newBooks;
    }

    // Метод 1: вывести все книги на экран
    public void printAllBooks(){
        if (size == 0){
            System.out.println("Библиотека пуста");
            return;
        }
        for (int i = 0; i < size; i++){
            System.out.println(books[i]);
        }
    }

    // Метод 2: вывести на экран все книги данного автора
    public void printBooksByAuthor(String author){
        boolean found = false;
        for (int i = 0; i < size; i++){
            if (books[i].getAuthor().equalsIgnoreCase(author)){
                System.out.println(books[i]);
                found = true;
            }
            if (!found){
                System.out.println("Книг этого автора не найдено");
            }
        }
    }

    // Метод 3: проверить, есть ли книга с заданным названием
    public boolean containBooks(String title){
        for (int i = 0; i < size; i++){
            if (books[i].getTitle().equalsIgnoreCase(title)){
                return true;
            }
        }
        return false;
    }
}