package com.example.javaproje;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Popup;
import javafx.stage.Stage;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Controller2 {

    ArrayList<String> tamListe = new ArrayList<>();



    String alfabe = "ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ";
    String SesliHarfler = "AEIİOÖUÜ";
    String SessizHarfler = "BCÇDFGĞHJKLMNPRSŞTVYZ";

    String birinci = "A";
    String ikinci = "A";
    String ucuncu = "A";
    String dorduncu = "A";
    String besinci = "A";
    String altinci = "A";
    String ortanca = "A";

    int intbirinci = 0;
    int intikinci = 0;
    int intucuncu = 0;
    int intdorduncu = 0;
    int intbesinci = 0;
    int intaltinci = 0;
    int intortanca = 0;

    public int puan = 0;
    public double progress = 0.00f;

    @FXML
    public AnchorPane anchor1, anchor2;
    @FXML
    public TextField textfield;
    @FXML
    public TextArea textArea;
    @FXML
    public Button key1, key2, key3, key4, key5, key6, key7, refresh, otomatikOyna, harfsil, kontrol;
    @FXML
    public ProgressBar progressbar;
    @FXML
    public ScrollPane kelimeListesi;
    @FXML
    Label skor;




    //butona basıldığı zaman butonun textini textfield a yazdırdık
    //append komutuyla birden fazla ifadeyi ekleyerek butonun textini yazdırabiliyoruz
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

    //TextField içerisindeki yazılı olan harfleri siliyor.
    public void harfSil(ActionEvent event) throws Exception {
        try {
            textfield.setText(textfield.getText().substring(0, textfield.getText().length() - 1));
        } catch (Exception e) {
            return;
        }
    }

    // Rastgele harfleri oluşturup panagrama ekliyor.
    public void random() {

        int intbirinci;
        int intikinci;
        int intucuncu;
        int intdorduncu;
        int intbesinci;
        int intaltinci;
        int intortanca;

        java.util.Random indis = new java.util.Random();


        while(true) {


            intbirinci = indis.nextInt(SesliHarfler.length());
            birinci = String.valueOf(SesliHarfler.charAt(intbirinci));
            break;
        }


        while (true) {
            intikinci = indis.nextInt(SesliHarfler.length());
            if (intikinci != intbirinci) {
                ikinci = String.valueOf(SesliHarfler.charAt(intikinci));
                //buton metodu
                break;
            }
        }

        while(true) {
            intucuncu = indis.nextInt(SessizHarfler.length());
            ucuncu = String.valueOf(SessizHarfler.charAt(intucuncu));
            break;
            //buton metodu
        }

        while (true) {
            intdorduncu = indis.nextInt(SessizHarfler.length());
            if (intdorduncu!=intucuncu) {
                dorduncu= String.valueOf(SessizHarfler.charAt(intdorduncu));
                //buton metodu
                break;
            }
        }

        while (true) {
            intbesinci = indis.nextInt(SessizHarfler.length());
            if (intbesinci!=intucuncu & intbesinci!=intdorduncu) {
                besinci = String.valueOf(SessizHarfler.charAt(intbesinci));
                //buton metodu
                break;
            }
        }

        while (true) {
            intaltinci = indis.nextInt(SessizHarfler.length());
            if (intaltinci!=intucuncu & intaltinci!=intdorduncu  & intaltinci!=intbesinci) {
                altinci = String.valueOf(SessizHarfler.charAt(intaltinci));
                //buton metodu
                break;
            }
        }


        while (true) {
            intortanca = indis.nextInt(SesliHarfler.length());
            if (intikinci !=intortanca & intortanca!= intbirinci) {
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

    // GUI2 Açıldığında random fonksiyonu çalışıyor.

    public void initialize() {

        while (tamListe.size() == 0){
            random();
            possibleWordsList();
            if (tamListe.size() != 0) {
                break;
            }

        }


    }
    public ArrayList<String> pangramKelimeler = new ArrayList<String>();
    public void possibleWordsList()
    {
        ArrayList<String> possibleWord = new ArrayList<>();

        ArrayList<String> disindakiAlfabe = new ArrayList<String>();
        for (int s = 0; s < alfabe.length(); s++) {

            if (birinci.equals(String.valueOf(alfabe.charAt(s))) |
                    ikinci.equals(String.valueOf(alfabe.charAt(s))) |
                    ucuncu.equals(String.valueOf(alfabe.charAt(s))) |
                    dorduncu.equals(String.valueOf(alfabe.charAt(s))) |
                    besinci.equals(String.valueOf(alfabe.charAt(s))) |
                    altinci.equals(String.valueOf(alfabe.charAt(s))) |
                    ortanca.equals(String.valueOf(alfabe.charAt(s)))) {

            } else {
                disindakiAlfabe.add(String.valueOf(alfabe.charAt(s)));
            }

        }
        for (String icerenKelime : Application.word) {
            if (icerenKelime.contains(birinci) |
                    icerenKelime.contains(ikinci) |
                    icerenKelime.contains(ucuncu) |
                    icerenKelime.contains(dorduncu) |
                    icerenKelime.contains(besinci) |
                    icerenKelime.contains(altinci) |
                    icerenKelime.contains(ortanca)) {

                if (icerenKelime.contains(disindakiAlfabe.get(0)) |
                        icerenKelime.contains(disindakiAlfabe.get(1)) |
                        icerenKelime.contains(disindakiAlfabe.get(2)) |
                        icerenKelime.contains(disindakiAlfabe.get(3)) |
                        icerenKelime.contains(disindakiAlfabe.get(4)) |
                        icerenKelime.contains(disindakiAlfabe.get(5)) |
                        icerenKelime.contains(disindakiAlfabe.get(6)) |
                        icerenKelime.contains(disindakiAlfabe.get(7)) |
                        icerenKelime.contains(disindakiAlfabe.get(8)) |
                        icerenKelime.contains(disindakiAlfabe.get(9)) |
                        icerenKelime.contains(disindakiAlfabe.get(10)) |
                        icerenKelime.contains(disindakiAlfabe.get(11)) |
                        icerenKelime.contains(disindakiAlfabe.get(12)) |
                        icerenKelime.contains(disindakiAlfabe.get(13)) |
                        icerenKelime.contains(disindakiAlfabe.get(14)) |
                        icerenKelime.contains(disindakiAlfabe.get(15)) |
                        icerenKelime.contains(disindakiAlfabe.get(16)) |
                        icerenKelime.contains(disindakiAlfabe.get(17)) |
                        icerenKelime.contains(disindakiAlfabe.get(18)) |
                        icerenKelime.contains(disindakiAlfabe.get(19)) |
                        icerenKelime.contains(disindakiAlfabe.get(20)) |
                        icerenKelime.contains(disindakiAlfabe.get(21))) {
                }
                else
                {
                    if (3 <= icerenKelime.length()) {
                        possibleWord.add(icerenKelime);

                    }
                }

            }
        }

        // Birinci kontrol (Random atılan harflerden oluşan kelimelerden en az biri pangram olmalıdır.)
        for (String pangram : possibleWord) {
            if (pangram.contains(birinci) &
                    pangram.contains(ikinci) &
                    pangram.contains(ucuncu) &
                    pangram.contains(dorduncu) &
                    pangram.contains(besinci) &
                    pangram.contains(altinci) &
                    pangram.contains(ortanca))
            {
                pangramKelimeler.add(pangram);
            }

        }
        // System.setOut(new PrintStream(System.out,true,"UTF-8"));
        if (20 <= possibleWord.size() & pangramKelimeler.size() >= 1) {
            tamListe = possibleWord;
            System.out.println(tamListe);
            System.out.println(tamListe.size());
            System.out.println(pangramKelimeler);
        }
    }

    //harfleri karıştırma işlemini yapıyor.
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

    public void girdiKontrol() {
        String girdi; //GİRDİ ALINIR.
        boolean Kontrol=false;

        //Birinci kontrol (en az üç harften oluşmalı)
        girdi = textfield.getText();

        if (girdi.length() < 3) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("UYARI");
            alert.setHeaderText("Kelimeyi 3 den az girmeyin!");
            alert.show();
        } else if (girdi.length() >= 3) {
            //İkinci kontrol kelime ortanca harfi içermelidir.)
            if (girdi.contains(ortanca)) // ortanca harf kontrolü
            {
                if ((girdi.contains(key1.getText()) |
                        girdi.contains(key2.getText()) |
                        girdi.contains(key3.getText()) |
                        girdi.contains(key4.getText()) |
                        girdi.contains(key5.getText()) |
                        girdi.contains(key6.getText()) |
                        girdi.contains(key7.getText()))) {
                    for (String eslesen : tamListe) {
                        if (girdi.equals(eslesen) ) //listedeki kelimeyi içeriyor mu?
                        {
                            for (String pangramKelimeMi : pangramKelimeler) {
                                if (eslesen == pangramKelimeMi) {
                                    puan += 10;
                                    progress += 0.10;
                                    skor.setText(String.valueOf(puan)); // kelimenin puanını label a ekliyor.
                                    textArea.appendText(girdi + "\n"); // scrollpane içerisindeki text area ya bilinen kelimeyi yazıyor.
                                    textfield.clear(); //text field içerisini temizliyor.
                                    progressbar.setProgress(progress); // progress barı her doğru kelime bilindiğinde %0.10 ilerletiyor.
                                    Kontrol=true;
                                } else {
                                    progress += girdi.length()/100;
                                    puan += girdi.length();
                                    skor.setText(String.valueOf(puan)); // kelimenin puanını label a ekliyor.
                                    progressbar.setProgress(progress); // progress barı her doğru kelime bilindiğinde %0.10 ilerletiyor.
                                    textArea.appendText(girdi + "\n"); // scrollpane içerisindeki text area ya bilinen kelimeyi yazıyor.
                                    textfield.clear(); //text field içerisini temizliyor.
                                    Kontrol=true;
                                }
                            }
                        }

                    }

                    if(Kontrol==false){
                        Alert alert = new Alert(Alert.AlertType.WARNING);
                        alert.setTitle("UYARI");
                        alert.setHeaderText("Böyle bir kelime yok.");
                        alert.show();
                    }
                }

            }

            else
            {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("UYARI");
                alert.setHeaderText("Ortanca harfi kullanınız.");
                alert.show();
            }

        }


    }
}