package com.fyxren.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField input1;

    @FXML
    private TextField input2;

    @FXML
    private TextField output;

    @FXML
    protected void onAdd() {
        try {
            float val1 = Float.parseFloat(input1.getText().replaceAll(",", "."));
            float val2 = Float.parseFloat(input2.getText().replaceAll(",", "."));
            output.setText(String.valueOf(val1 + val2));
        } catch (Exception e) {
            output.setText("Error - Error when parsing floats");
        }
    }

    @FXML
    protected void onSubtract() {
        try {
            float val1 = Float.parseFloat(input1.getText().replaceAll(",", "."));
            float val2 = Float.parseFloat(input2.getText().replaceAll(",", "."));
            output.setText(String.valueOf(val1 - val2));
        } catch (Exception e) {
            output.setText("Error - Error when parsing floats");
        }
    }
}