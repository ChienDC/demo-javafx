module org.example.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires java.desktop;

    opens org.example.javafx to javafx.fxml;
    exports org.example.javafx;
    exports org.example.javafx.tableview to javafx.graphics;
    opens org.example.javafx.tableview to javafx.base;
}