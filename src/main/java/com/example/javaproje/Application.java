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
        stage.setScene(scene);
        stage.show();
    }
    public static ArrayList<String> word = new ArrayList<String>();


    public static void main(String[] args) throws IOException {

        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src\\\\sozluk_v2.txt"), "UTF-8"));
        while ((line = br.readLine()) != null) {
            line = line.toUpperCase();
            word.add(line);
        }
        br.close();

        launch();
    }
}