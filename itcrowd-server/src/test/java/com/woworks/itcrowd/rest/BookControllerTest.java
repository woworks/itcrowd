package com.woworks.itcrowd.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Sets;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import com.woworks.itcrowd.domain.Post;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(PostController.class)
class BookControllerTest {

 /*   private static final String AUTHOR = "Charles Dickens";
    private static final String TITLE = "Oliver Twist";
    private static final String NEW_TITLE = "Oliver Twist Updated";
    private static final String GENRE = "Social novel";

    private static List<Post> books = new ArrayList<>();

    @MockBean
    private BookService bookService;

    private JacksonTester<Post> jsonBook;

    @BeforeEach
    public void setUp() {

        JacksonTester.initFields(this, new ObjectMapper());

        books.clear();

        Author author1 = new Author(AUTHOR);
        Genre genre1 = new Genre(GENRE);

        Post book1 = new Post();
        book1.setTitle(TITLE);
        book1.setAuthor(author1);
        book1.setGenres(Sets.newHashSet(genre1));

        Post book1updated = new Post();
        book1updated.setTitle(NEW_TITLE);

        Post book2 = new Post();
        book2.setTitle("Cool Book2");
        Post book3 = new Post();
        book3.setTitle("Cool Book3");
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Mockito.when(bookService.findAll())
                .thenReturn(books);

        Mockito.when(bookService.findById(1))
                .thenReturn(Optional.of(book1));

        Mockito.when(bookService.save(anyLong(), anyString(), anyLong(), anyList()))
                .then((Answer<Post>) var1 -> {
                    books.get(0).setTitle(NEW_TITLE);
                    return book1updated;
                });
    }

    private RequestSpecification givenAuth() {
        return RestAssured.given()
                .auth()
                .basic("user", "password");
    }

    @Test
    void listPage() throws Exception {
        final Response response = givenAuth().get("/api/books");
        assertEquals(200, response.statusCode());
        System.out.println(response.asString());
    }

    @Test
    void editPageGet() throws Exception {
        final Response response = givenAuth().get("/api/books/1");
        assertEquals(200, response.getStatusCode());
        Post responseBook = response.body().as(Post.class);
        assertNotNull(responseBook);
    }

    @Test
    void editPagePost() throws Exception {

        final Response response = givenAuth()
                .contentType(MediaType.APPLICATION_JSON.toString())
                .content(jsonBook.write(books.get(0)).getJson())
                .get("/api/books/1");

        assertEquals(200, response.getStatusCode());
        Post responseBook = response.body().as(Post.class);
        assertNotNull(responseBook);
    }*/
}