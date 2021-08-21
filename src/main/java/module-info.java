module sistema.formulario {
    requires javafx.controls;
    requires javafx.fxml;


    opens sistema.formulario to javafx.fxml;
    exports sistema.formulario;
}