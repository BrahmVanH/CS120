module com.lab_thirteen.lab_thirteen {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lab_thirteen.lab_thirteen to javafx.fxml;
    exports com.lab_thirteen.lab_thirteen;
}