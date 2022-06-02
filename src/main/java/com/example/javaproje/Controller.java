package com.example.javaproje;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {
    @FXML
    public Label welcomeText;
    @FXML
    public AnchorPane anchor1, anchor2;
    @FXML
    public Button otomatikoyna, harfsil;

    public void fun_harfsil(ActionEvent event) throws Exception
    {
        System.out.println("Aşkım Aysell Seni Seviyorum");
    }

    //******** OtomatikOyna butonuna basıncaoyun penceresini açan kod ******//
    public void pressButton(ActionEvent event) throws Exception {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI2.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            ((Stage) otomatikoyna.getScene().getWindow()).close(); // OtomatikOyna butonuna basıldığında ilk açılan pencereyi kapatan kod.
        }
    }
    //*** press button bittiği yer
}