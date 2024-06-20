package org.example.javafx.repository;

import org.example.javafx.entity.Article;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ArticleRepository {
    private final String MYSQL_CONNECTION_STRING = "jdbc:mysql://localhost:3306/javafx";
    private final String MYSQL_USERNAME = "root";
    private final String MYSQL_PASSWORD = "";

    public void save(Article obj){
        try {
            Connection connection = DriverManager.getConnection(MYSQL_CONNECTION_STRING, MYSQL_USERNAME, MYSQL_PASSWORD);
            String strSql = "insert into article (title, description, content) values (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(strSql);
            preparedStatement.setString(1, obj.getTitle());
            preparedStatement.setString(2, obj.getDescription());
            preparedStatement.setString(3, obj.getContent());
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ArticleRepository repo = new ArticleRepository();
        Article obj = new Article();
        obj.setTitle("1");
        obj.setDescription("2");
        obj.setContent("3");
        repo.save(obj);
    }
}