package com.example.javaproje;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws IOException {
        launch();
       /*
       //**************** ESLEMIN KODU *******************/

        ArrayList<String> word=new ArrayList<String>();

        FileInputStream fileInputStream = new FileInputStream("VPSOZLUK.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, Charset.forName("UTF-8"));
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        String line;
        while ((line=bufferedReader.readLine()) != null)
        {

            word.add(line);
        }

        bufferedReader.close();
        //*******************************************************//
    }
}