module org.example.cartulinas {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.cartulinas.uiController to javafx.fxml;
    exports org.example.cartulinas;
}