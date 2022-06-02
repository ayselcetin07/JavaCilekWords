package com.example.javaproje;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {
    @FXML
    public Label welcomeText;
    @FXML
    public AnchorPane anchor1, anchor2;
    @FXML
    public Button otomatikoyna, harfsil;
    @FXML
    public TextField textfield;
    @FXML
    public Button key1,key2,key3,key4,key5,key6,key7;
    //butona basıldığı zaman butonun textini textfield a yazdırdık
    //append yazınca birden fazla butonun textini yazdırabiliyoruz
    public void key1Yaz(ActionEvent event)throws Exception{

        textfield.appendText(key1.getText());

    }
    public void key2Yaz(ActionEvent event) throws Exception{

        textfield.appendText(key2.getText());
    }
    public void key3Yaz(ActionEvent event) throws Exception{

        textfield.appendText(key3.getText());
    }
    public void key4Yaz(ActionEvent event) throws Exception{

        textfield.appendText(key4.getText());
    }
    public void key5Yaz(ActionEvent event) throws Exception{

        textfield.appendText(key5.getText());
    }
    public void key6Yaz(ActionEvent event) throws Exception{

        textfield.appendText(key6.getText());
    }
    public void key7Yaz(ActionEvent event) throws Exception{

        textfield.appendText(key7.getText());
    }




    public void harfSil(ActionEvent event) throws Exception
    {
      try {
          textfield.setText(textfield.getText().substring(0, textfield.getText().length() - 1));
      }
      catch (Exception e){
          return;
    }


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