module com.example.qnyhrecordinginstrument {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.qnyh.recordinginstrument to javafx.fxml;
    opens com.qnyh.recordinginstrument.main to javafx.fxml;
    exports com.qnyh.recordinginstrument.controller;
    opens com.qnyh.recordinginstrument.controller to javafx.fxml;
    exports com.qnyh.recordinginstrument;
}