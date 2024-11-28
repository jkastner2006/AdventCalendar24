module at.htl.adventcalendar {
    requires javafx.controls;
    requires javafx.fxml;


    opens at.htl.adventcalendar to javafx.fxml;
    exports at.htl.adventcalendar;
}