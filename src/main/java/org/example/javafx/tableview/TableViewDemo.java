package org.example.javafx.tableview;

import org.example.javafx.tableview.UserAccount;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TableViewDemo extends Application {

    @Override
    public void start(Stage stage) {

        TableView<UserAccount> table = new TableView<UserAccount>();


        // Tạo cột UserName (Kiểu dữ liệu String)
        TableColumn<UserAccount, String> userNameCol //
                = new TableColumn<UserAccount, String>("User Name");

        // Tạo cột Email (Kiểu dữ liệu String)
        TableColumn<UserAccount, String> emailCol//
                = new TableColumn<UserAccount, String>("Email");

        // Tạo cột FullName (Kiểu dữ liệu String)
        TableColumn<UserAccount, String> fullNameCol//
                = new TableColumn<UserAccount, String>("Full Name");

        // Tạo 2 cột con cho cột FullName
        TableColumn<UserAccount, String> firstNameCol //
                = new TableColumn<UserAccount, String>("First Name");

        TableColumn<UserAccount, String> lastNameCol //
                = new TableColumn<UserAccount, String>("Last Name");

        // Thêm 2 cột con vào cột FullName
        fullNameCol.getColumns().addAll(firstNameCol, lastNameCol);

        // Active Column
        TableColumn<UserAccount, Boolean> activeCol//
                = new TableColumn<UserAccount, Boolean>("Active");

        table.getColumns().addAll(userNameCol, emailCol, fullNameCol, activeCol);

        StackPane root = new StackPane();
        root.setPadding(new Insets(5));
        root.getChildren().add(table);

        stage.setTitle("TableView (o7planning.org)");

        Scene scene = new Scene(root, 450, 300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}