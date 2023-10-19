module com.lab_fifteen.lab_fifteen {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.lab_fifteen.lab_fifteen to javafx.fxml;
    exports com.lab_fifteen.lab_fifteen;
}