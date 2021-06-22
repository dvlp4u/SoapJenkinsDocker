package it.dvlpr4u.exercise.SoapJenkinsDocker.Repository;

import it.dvlp4u.soap_jenkins_docker.Book;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;
import java.util.List;

public class TestBookRepo {

    @Test
    public void getAllBooksTest(){
        BookRepo bookRepo = new BookRepo();
        List<Book> books = bookRepo.getBooks();
        Assert.notNull(books, "Lista vuota");
    }

    @Test
    public void getSingleBookTest(){
        BookRepo bookRepo = new BookRepo();
        Book book1 = bookRepo.getBook("Design Pattern");
        Assert.hasText("E.Gamma", book1.getAuthor());
    }
}
