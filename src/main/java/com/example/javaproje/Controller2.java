package com.example.javaproje;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


public class Controller2 {
    String alfabe = "ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ";
    String SesliHarfler = "AEIİOÖUÜ";
    String SessizHarfler = "BCÇDFGĞHJKLMNPRSŞTVYZ";

    String birinci;
    String ikinci;
    String ucuncu;
    String dorduncu;
    String besinci;
    String altinci;
    String ortanca;

    int intbirinci;
    int intikinci;
    int intucuncu;
    int intdorduncu;
    int intbesinci;
    int intaltinci;
    int intortanca;

    @FXML
    public AnchorPane anchor1, anchor2;
    @FXML
    public TextField textfield;
    @FXML
    public Button key1, key2, key3, key4, key5, key6, key7, refresh, otomatikOyna, harfsil, kontrol;
    @FXML
    public ProgressBar progressbar;
    @FXML
    public ScrollPane kelimeListesi;

    //butona basıldığı zaman butonun textini textfield a yazdırdık
    //append yazınca birden fazla butonun textini yazdırabiliyoruz
    public void key1Yaz(ActionEvent event) throws Exception {
        textfield.appendText(key1.getText());
    }

    public void key2Yaz(ActionEvent event) throws Exception {

        textfield.appendText(key2.getText());
    }

    public void key3Yaz(ActionEvent event) throws Exception {

        textfield.appendText(key3.getText());
    }

    public void key4Yaz(ActionEvent event) throws Exception {

        textfield.appendText(key4.getText());
    }

    public void key5Yaz(ActionEvent event) throws Exception {

        textfield.appendText(key5.getText());
    }

    public void key6Yaz(ActionEvent event) throws Exception {

        textfield.appendText(key6.getText());
    }

    public void key7Yaz(ActionEvent event) throws Exception {

        textfield.appendText(key7.getText());
    }

    public void harfSil(ActionEvent event) throws Exception {
        try {
            textfield.setText(textfield.getText().substring(0, textfield.getText().length() - 1));
        } catch (Exception e) {
            return;
        }
    }


    public void random() {

        java.util.Random indis = new java.util.Random();
        intbirinci = indis.nextInt(SesliHarfler.length());
        birinci = String.valueOf(SesliHarfler.charAt(intbirinci));

        while (true) {
            intikinci = indis.nextInt(SesliHarfler.length());
            if (intikinci != intbirinci) {
                ikinci = String.valueOf(SesliHarfler.charAt(intikinci));
                //buton metodu
                break;
            }
        }

        intucuncu = indis.nextInt(SessizHarfler.length());
        ucuncu = String.valueOf(SessizHarfler.charAt(intucuncu));
        //buton metodu

        while (true) {
            intdorduncu = indis.nextInt(SessizHarfler.length());
            if (intdorduncu != intucuncu) {
                dorduncu = String.valueOf(SessizHarfler.charAt(intdorduncu));
                //buton metodu
                break;
            }
        }

        while (true) {
            intbesinci = indis.nextInt(SessizHarfler.length());
            if (intbesinci != intucuncu & intbesinci != intdorduncu) {
                besinci = String.valueOf(SessizHarfler.charAt(intbesinci));
                //buton metodu
                break;
            }
        }

        while (true) {
            intaltinci = indis.nextInt(SessizHarfler.length());
            if (intaltinci != intucuncu & intaltinci != intdorduncu & intaltinci != intbesinci) {
                altinci = String.valueOf(SessizHarfler.charAt(intaltinci));
                //buton metodu
                break;
            }
        }

        while (true) {
            intortanca = indis.nextInt(SesliHarfler.length());
            if (intikinci != intortanca & intortanca != intbirinci) {
                ortanca = String.valueOf(SesliHarfler.charAt(intortanca));
                //buton metodu
                break;
            }

        }
        key1.setText(birinci);
        key2.setText(ikinci);
        key3.setText(ucuncu);
        key4.setText(dorduncu);
        key5.setText(besinci);
        key6.setText(altinci);
        key7.setText(ortanca);


    }

    public void initialize() {
        random();
    }

    //harfleri karıştırma
    public void refresh(ActionEvent event) throws Exception {

        java.util.Random index = new java.util.Random();

        String yenibirinci, yeniikinci, yeniucuncu, yenidorduncu, yenibesinci, yenialtinci;

        int birinci_, ikinci_, ucuncu_, dorduncu_, besinci_, altıncı_;

        String birleşik = birinci + ikinci + ucuncu + dorduncu + besinci + altinci;


        birinci_ = index.nextInt(birleşik.length());
        yenibirinci = String.valueOf(birleşik.charAt(birinci_));
        //arayüzle ilgili bir şeyler

        while (true) {
            ikinci_ = index.nextInt(birleşik.length());
            if (birinci_ != ikinci_) {
                yeniikinci = String.valueOf(birleşik.charAt(ikinci_));
                //arayüzle ilgili bir şeyler
                break;
            }
        }

        while (true) {
            ucuncu_ = index.nextInt(birleşik.length());
            if (birinci_ != ucuncu_ & ikinci_ != ucuncu_) {
                yeniucuncu = String.valueOf(birleşik.charAt(ucuncu_));
                //arayüzle ilgili bir şeyler
                break;
            }
        }

        while (true) {
            dorduncu_ = index.nextInt(birleşik.length());
            if (dorduncu_ != birinci_ & dorduncu_ != ikinci_ & dorduncu_ != ucuncu_) {
                yenidorduncu = String.valueOf(birleşik.charAt(dorduncu_));
                //arayüzle ilgili bir şeyler
                break;
            }
        }

        while (true) {
            besinci_ = index.nextInt(birleşik.length());
            if (besinci_ != birinci_ & besinci_ != ikinci_ & besinci_ != ucuncu_ & besinci_ != dorduncu_) {
                yenibesinci = String.valueOf(birleşik.charAt(besinci_));
                //arayüzle ilgili bir şeyler
                break;
            }
        }

        while (true) {
            altıncı_ = index.nextInt(birleşik.length());
            if (altıncı_ != birinci_ & altıncı_ != ikinci_ & altıncı_ != ucuncu_ & altıncı_ != dorduncu_ & altıncı_ != besinci_) {
                yenialtinci = String.valueOf(birleşik.charAt(altıncı_));
                //arayüzle ilgili bir şeyler
                break;
            }
        }
        key1.setText(yenibirinci);
        key2.setText(yeniikinci);
        key3.setText(yeniucuncu);
        key4.setText(yenidorduncu);
        key5.setText(yenibesinci);
        key6.setText(yenialtinci);
    }
}

