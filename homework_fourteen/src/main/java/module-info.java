module com.final_project.homework_fourteen {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.final_project.homework_fourteen to javafx.fxml;
    exports com.final_project.homework_fourteen;
}