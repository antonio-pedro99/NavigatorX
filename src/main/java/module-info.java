module com.antoniopedro99.navigatorx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.antoniopedro99.navigatorx to javafx.fxml;
    exports com.antoniopedro99.navigatorx;
}