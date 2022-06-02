module com.example.javaproje {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.javaproje to javafx.fxml;
    exports com.example.javaproje;
}