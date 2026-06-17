package com.example.controller;

import com.example.dao.TaskDAO;
import com.example.model.Task;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/")
public class TaskServlet extends HttpServlet {
    private TaskDAO taskDAO;

    public void init() {
        taskDAO = new TaskDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();

        try {
            switch (action) {
                case "/insert":
                    insertTask(request, response);
                    break;
                case "/complete":
                    completeTask(request, response);
                    break;
                case "/delete":
                    deleteTask(request, response);
                    break;
                default:
                    listTasks(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void listTasks(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Task> listTask = taskDAO.selectAllTasks();
        request.setAttribute("tasks", listTask);
        request.getRequestDispatcher("tasks.jsp").forward(request, response);
    }

    private void insertTask(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String description = request.getParameter("description");
        Task newTask = new Task(description, false);
        taskDAO.insertTask(newTask);
        response.sendRedirect("list");
    }

    private void completeTask(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        taskDAO.completeTask(id);
        response.sendRedirect("list");
    }

    private void deleteTask(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        taskDAO.deleteTask(id);
        response.sendRedirect("list");
    }
}
