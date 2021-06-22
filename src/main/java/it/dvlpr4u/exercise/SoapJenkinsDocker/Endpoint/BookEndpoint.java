package it.dvlpr4u.exercise.SoapJenkinsDocker.Endpoint;

import it.dvlp4u.soap_jenkins_docker.BookRequest;
import it.dvlp4u.soap_jenkins_docker.BookResponse;
import it.dvlpr4u.exercise.SoapJenkinsDocker.Repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class BookEndpoint {
    private static final String NAMESPACE_URI = "http://dvlp4u.it/soap-jenkins-docker";

    @Autowired
    private BookRepo bookRepo;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "bookRequest")
    @ResponsePayload
    public BookResponse getBook(@RequestPayload BookRequest request) {
        BookResponse response = new BookResponse();
        response.setBook(bookRepo.getBook(request.getName()));
        return response;
    }

}
