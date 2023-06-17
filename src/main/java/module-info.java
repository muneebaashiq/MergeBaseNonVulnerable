module com.example.mergebasenonvulnerable {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mergebasenonvulnerable to javafx.fxml;
    exports com.example.mergebasenonvulnerable;
}