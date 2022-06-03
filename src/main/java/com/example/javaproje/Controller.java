package com.example.javaproje;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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
    public TextField textfield;
    @FXML
    public Button key1,key2,key3,key4,key5,key6,key7,refresh,otomatikOyna,harfsil,oyunOlustur;

    //******** OtomatikOyna butonuna basıncaoyun penceresini açan kod ******//
    public void otomatikOyna(ActionEvent event) throws Exception {
        try {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Oyuna Hoşgeldiniz");
            alert.setHeaderText("Bu oyunda harfler rastgele verilmiştir");
            alert.setContentText(" Oyunun Kuralları \n Dört harften az kelime girmeyiniz. \n Bir harfi birden fazla kullanabilirsiniz." +
                    " \n Ortadaki harfi kullanmak zorundasınız.\n Altıgenlerin içindeki harflerden başka harf kullanmayınız. ");
            alert.showAndWait();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI2.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            ((Stage) otomatikOyna.getScene().getWindow()).close(); // OtomatikOyna butonuna basıldığında ilk açılan pencereyi kapatan kod.
        }
    }
    //*** otomatikOyna bittiği yer

    public void oyunOlustur(ActionEvent event) throws Exception
    {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Oyuna Hoşgeldiniz");
        alert.setHeaderText("Lütfen 7 harf giriniz.");
        alert.setContentText(" Oyunun Kuralları \n Harfi girdikten sonra kontrol butonuna basınız.\n " +
                "Harfleri tek tek giriniz.\n Her harf sadece bir kez girilebilir.\n  " +
                "Dört harften az kelime girmeyiniz. \n Bir harfi birden fazla kullanabilirsiniz." +
                "\n Ortadaki harfi kullanmak zorundasınız.\n Altıgenlerin içindeki harflerden başka harf kullanmayınız. ");
        alert.showAndWait();

        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI2.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        } finally
        {
            ((Stage) otomatikOyna.getScene().getWindow()).close(); // OtomatikOyna butonuna basıldığında ilk açılan pencereyi kapatan kod.
        }

    }
}