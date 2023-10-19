module com.javafx.lab_fourteen {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.javafx.lab_fourteen to javafx.fxml;
    exports com.javafx.lab_fourteen;
}