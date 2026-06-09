package com.example.dao;

import com.example.model.Task;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TaskDAO {
    private String jdbcURL = "jdbc:h2:mem:taskdb;DB_CLOSE_DELAY=-1";
    private String jdbcUsername = "sa";
    private String jdbcPassword = "";

    public TaskDAO() {
        try {
            Class.forName("org.h2.Driver");
            try (Connection connection = getConnection();
                 Statement statement = connection.createStatement()) {
                statement.execute("CREATE TABLE IF NOT EXISTS tasks (id INT AUTO_INCREMENT PRIMARY KEY, description VARCHAR(255), completed BOOLEAN)");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected Connection getConnection() throws SQLException {
        return DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
    }

    public void insertTask(Task task) throws SQLException {
        String sql = "INSERT INTO tasks (description, completed) VALUES (?, ?)";
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, task.getDescription());
            statement.setBoolean(2, task.isCompleted());
            statement.executeUpdate();
        }
    }

    public List<Task> selectAllTasks() {
        List<Task> tasks = new ArrayList<>();
        String sql = "SELECT * FROM tasks";
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet rs = statement.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String description = rs.getString("description");
                boolean completed = rs.getBoolean("completed");
                tasks.add(new Task(id, description, completed));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tasks;
    }

    public boolean completeTask(int id) throws SQLException {
        boolean rowUpdated;
        String sql = "UPDATE tasks SET completed = TRUE WHERE id = ?";
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }

    public boolean deleteTask(int id) throws SQLException {
        boolean rowDeleted;
        String sql = "DELETE FROM tasks WHERE id = ?";
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }
}
