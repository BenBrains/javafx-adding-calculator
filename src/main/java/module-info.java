module com.fyxren.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fyxren.calculator to javafx.fxml;
    exports com.fyxren.calculator;
}