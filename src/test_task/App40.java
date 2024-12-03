package test_task;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App40 {
}

//* Пользователи имеют библиотеку книг, к которой они могут добавлять или удалять книги.
//* Пользователь может установить книгу из своей библиотеки как активную.
//* Приложение для чтения запоминает, где пользователь остановился в данной книге.
//* Приложение для чтения отображает только одну страницу текста за раз в активной книге.

class User {
    String name;
    Library library;

    User(String name) {
        this.name = name;
        this.library = new Library();
    }
}

class Library implements LibraryManager {
    Map<Integer, Book> books;
    Integer activeBook;

    Library() {
        books = new HashMap<>();
        activeBook = null;
    }

    @Override
    public void addBook(Integer id, String title, List<Page> pages) {
        Book newBook = new Book(id, title, pages);
        books.put(newBook.id, newBook);
    }

    @Override
    public void deleteBook(Integer id) {
        if (activeBook != null && activeBook.equals(id)) {
            activeBook = null;
        }
        books.remove(id);
    }

    @Override
    public void setActiveBook(Integer id) {
        if (books.containsKey(id)) {
            activeBook = id;
        } else {
            System.out.println("The book not found in the library");
        }
    }

    @Override
    public Book getActiveBook() {
        return books.get(activeBook);
    }
}

class Book implements BookReader {
    Integer id;
    String title;
    List<Page> pages;
    Integer lastPage;

    Book(Integer id, String title, List<Page> pages) {
        this.id = id;
        this.title = title;
        this.pages = pages;
        this.lastPage = 0;
    }

    @Override
    public Page displayPage() {
        if (lastPage < pages.size()) {
            return pages.get(lastPage);
        }
        return null;
    }

    @Override
    public Page turnPage() {
        if (lastPage + 1 < pages.size()) {
            lastPage++;
            return pages.get(lastPage);
        } else {
            return null;
        }
    }

    @Override
    public void setLastPage(Integer pageNumber) {
        if (pageNumber > 0 && pageNumber < pages.size()) {
            lastPage = pageNumber;
        }
    }
}

class Page {
    int number;
    String content;

    Page(int number, String content) {
        this.number = number;
        this.content = content;
    }
}

interface LibraryManager {
    void addBook(Integer id, String title, List<Page> pages);

    void deleteBook(Integer id);

    void setActiveBook(Integer id);

    Book getActiveBook();
}

interface BookReader {
    Page displayPage();

    Page turnPage();

    void setLastPage(Integer pageNumber);
}