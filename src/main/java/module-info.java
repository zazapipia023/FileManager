module com.zaza.filemanager.filemanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.zaza.filemanager to javafx.fxml;
    exports com.zaza.filemanager;
    exports com.zaza.filemanager.controller;
    opens com.zaza.filemanager.controller to javafx.fxml;
}