package com.example.controller;

import com.example.model.Book;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

@WebServlet("/")
public class LibraryController extends HttpServlet {
    private List<Book> books;

    public void init() {
        books = new CopyOnWriteArrayList<>();
        books.add(new Book(UUID.randomUUID().toString(), "To Kill a Mockingbird", "Harper Lee", "9780061120084"));
        books.add(new Book(UUID.randomUUID().toString(), "Moby Dick", "Herman Melville", "9781503280786"));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("books", books);
        request.getRequestDispatcher("books.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String isbn = request.getParameter("isbn");

        if (title != null && author != null && isbn != null) {
            Book book = new Book(UUID.randomUUID().toString(), title, author, isbn);
            books.add(book);
        }
        response.sendRedirect(request.getContextPath() + "/");
    }
}
