package com.example.servlet;

import com.example.model.Book;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

@WebServlet("/")
public class LibraryServlet extends HttpServlet {
    private List<Book> books;

    public void init() {
        books = new CopyOnWriteArrayList<>();
        books.add(new Book(UUID.randomUUID().toString(), "The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"));
        books.add(new Book(UUID.randomUUID().toString(), "1984", "George Orwell", "9780451524935"));
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

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>Library Management System</title></head>");
        out.println("<body>");
        out.println("<h1>Library Management System</h1>");
        out.println("<table border='1'>");
        out.println("<thead><tr><th>Title</th><th>Author</th><th>ISBN</th></tr></thead>");
        out.println("<tbody>");
        for (Book book : books) {
            out.println("<tr>");
            out.println("<td>" + book.getTitle() + "</td>");
            out.println("<td>" + book.getAuthor() + "</td>");
            out.println("<td>" + book.getIsbn() + "</td>");
            out.println("</tr>");
        }
        out.println("</tbody>");
        out.println("</table>");
        out.println("<h2>Add a New Book</h2>");
        out.println("<form action='" + request.getContextPath() + "/' method='POST'>");
        out.println("Title: <input type='text' name='title' required><br/>");
        out.println("Author: <input type='text' name='author' required><br/>");
        out.println("ISBN: <input type='text' name='isbn' required><br/>");
        out.println("<input type='submit' value='Add Book'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }
}
