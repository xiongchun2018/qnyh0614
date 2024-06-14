module com.example.qnyhrecordinginstrument {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.qnyhrecordinginstrument to javafx.fxml;
    exports com.example.qnyhrecordinginstrument;
    exports com.qnyh.qnyhrecordinginstrument;
    opens com.qnyh.qnyhrecordinginstrument to javafx.fxml;
}