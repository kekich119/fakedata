module com.example.fakedata {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafaker;

    opens com.example.fakedata to javafx.fxml;
    exports com.example.fakedata;
}