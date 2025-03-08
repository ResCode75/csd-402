module com.examples {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.examples to javafx.fxml;
    exports com.examples;
}
