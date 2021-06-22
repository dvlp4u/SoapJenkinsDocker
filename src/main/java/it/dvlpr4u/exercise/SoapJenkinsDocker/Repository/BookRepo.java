package it.dvlpr4u.exercise.SoapJenkinsDocker.Repository;

import it.dvlp4u.soap_jenkins_docker.Book;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class BookRepo {

     private List<Book> books = new ArrayList<Book>();

    @PostConstruct
    public void initData(){
        Book book1 = new Book();
        book1.setName("Game of throne");
        book1.setAuthor("G.Martin");
        book1.setPrice(20);
        books.add(book1);

        Book book2 = new Book();
        book1.setName("Design Pattern");
        book1.setAuthor("E.Gamma");
        book1.setPrice(40);
        books.add(book2);

        Book book3 = new Book();
        book1.setName("Io uccido");
        book1.setAuthor("G.Faletti");
        book1.setPrice(16);
        books.add(book3);
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book getBook(String name){

        Book book1 = new Book();
        book1.setName("Game of throne");
        book1.setAuthor("G.Martin");
        book1.setPrice(20);

        return book1;
    }

}
