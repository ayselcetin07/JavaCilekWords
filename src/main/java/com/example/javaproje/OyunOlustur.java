package com.example.javaproje;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;

public class OyunOlustur {
    ArrayList<String> tamListe = new ArrayList<>();
    public ArrayList<String> pangramKelimeler = new ArrayList<String>();


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
    ArrayList<String> possibleWord = new ArrayList<>();
    ArrayList<String> dısındakiAlfabe = new ArrayList<String>();
    public void kelimelistesiolustur(){
        //Random gelen harfler random classdan alınır. ama denemek için aldım...

        String birinci = key1.getText().toUpperCase(Locale.ROOT);
        String ikinci = key2.getText().toUpperCase(Locale.ROOT);
        String ucuncu = key3.getText().toUpperCase(Locale.ROOT);
        String dorduncu = key4.getText().toUpperCase(Locale.ROOT);
        String besinci = key5.getText().toUpperCase(Locale.ROOT);
        String altinci = key6.getText().toUpperCase(Locale.ROOT);
        String ortanca = key7.getText().toUpperCase(Locale.ROOT);


        String alfabe = "ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ";



        for (int s = 0; s < alfabe.length(); s++) {

            if (birinci.equals(String.valueOf(alfabe.charAt(s))) |
                    ikinci.equals(String.valueOf(alfabe.charAt(s))) |
                    ucuncu.equals(String.valueOf(alfabe.charAt(s))) |
                    dorduncu.equals(String.valueOf(alfabe.charAt(s))) |
                    besinci.equals(String.valueOf(alfabe.charAt(s))) |
                    altinci.equals(String.valueOf(alfabe.charAt(s))) |
                    ortanca.equals(String.valueOf(alfabe.charAt(s))))
            {

            }
            else {
                dısındakiAlfabe.add(String.valueOf(alfabe.charAt(s)));
            }

        }

        System.out.println(dısındakiAlfabe);
        System.out.println(dısındakiAlfabe.size());
        System.out.println(dısındakiAlfabe.get(1));





        for (String icerenKelime : Application.word)
        {
            if(icerenKelime.contains(birinci)|
                    icerenKelime.contains(ikinci)|
                    icerenKelime.contains(ucuncu)|
                    icerenKelime.contains(dorduncu)|
                    icerenKelime.contains(besinci)|
                    icerenKelime.contains(altinci)|
                    icerenKelime.contains(ortanca))
            {

                if (icerenKelime.contains(dısındakiAlfabe.get(0))|
                        icerenKelime.contains(dısındakiAlfabe.get(1))|
                        icerenKelime.contains(dısındakiAlfabe.get(2))|
                        icerenKelime.contains(dısındakiAlfabe.get(3))|
                        icerenKelime.contains(dısındakiAlfabe.get(4))|
                        icerenKelime.contains(dısındakiAlfabe.get(5))|
                        icerenKelime.contains(dısındakiAlfabe.get(6))|
                        icerenKelime.contains(dısındakiAlfabe.get(7))|
                        icerenKelime.contains(dısındakiAlfabe.get(8))|
                        icerenKelime.contains(dısındakiAlfabe.get(9))|
                        icerenKelime.contains(dısındakiAlfabe.get(10))|
                        icerenKelime.contains(dısındakiAlfabe.get(11))|
                        icerenKelime.contains(dısındakiAlfabe.get(12))|
                        icerenKelime.contains(dısındakiAlfabe.get(13))|
                        icerenKelime.contains(dısındakiAlfabe.get(14))|
                        icerenKelime.contains(dısındakiAlfabe.get(15))|
                        icerenKelime.contains(dısındakiAlfabe.get(16))|
                        icerenKelime.contains(dısındakiAlfabe.get(17))|
                        icerenKelime.contains(dısındakiAlfabe.get(18))|
                        icerenKelime.contains(dısındakiAlfabe.get(19))|
                        icerenKelime.contains(dısındakiAlfabe.get(20))|
                        icerenKelime.contains(dısındakiAlfabe.get(21)))
                {
                }
                else
                {
                    possibleWord.add(icerenKelime);
                }


            }
        }



        System.out.println(possibleWord);
        System.out.println(possibleWord.size());
    }

    public void ayniharfkontrolu(){
        String alfabe = "ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ";
        String girdi= "EEEEEEE";

        if(girdi.length()==7)
        {
            ArrayList<String> alfabeKarakter=new ArrayList<String>();
            ArrayList<String> girdiKarakter=new ArrayList<String>();
            ArrayList<String> kontrol=new ArrayList<String>();

            for(int i=0;i<girdi.length();i++)
            {
                girdiKarakter.add(String.valueOf(girdi.charAt(i)));
            }
            System.out.println(girdiKarakter);
            for(String harfler:girdiKarakter){
                for(String harfller2:girdiKarakter){
                    if (harfler.equals(harfller2)){
                        kontrol.add(harfler);
                    }

                }

            }
            if(kontrol.size()==7){

            }

            else
            {
                // aynı harfi birden fazla girmeyiniz
                System.out.println("aynı harfi birden fazla girmeyiniz");
            }

        }
        else
        {
            // yedi harf giriniz. yetersiz harf
            System.out.println("yetersiz");
        }


    }


    int sayac = 1;
    public void harfgir(){

            if (true)
            {
                switch (sayac) {
                    case 1:
                        key7.setText(textfield.getText().toUpperCase(Locale.ROOT));
                        ortanca = key7.getText();
                        sayac++;
                        textfield.clear();
                        break;
                    case 2:
                        key1.setText(textfield.getText().toUpperCase(Locale.ROOT));
                        birinci = key1.getText();
                        sayac++;
                        textfield.clear();
                        break;
                    case 3:
                        key2.setText(textfield.getText().toUpperCase(Locale.ROOT));
                        ikinci = key2.getText();
                        sayac++;
                        textfield.clear();
                        break;
                    case 4:
                        key3.setText(textfield.getText().toUpperCase(Locale.ROOT));
                        ucuncu = key3.getText();
                        sayac++;
                        textfield.clear();
                        break;
                    case 5:
                        key4.setText(textfield.getText().toUpperCase(Locale.ROOT));
                        dorduncu = key4.getText();
                        sayac++;
                        textfield.clear();
                        break;
                    case 6:
                        key5.setText(textfield.getText().toUpperCase(Locale.ROOT));
                        besinci = key5.getText();
                        sayac++;
                        textfield.clear();
                        break;
                    case 7:
                        key6.setText(textfield.getText().toUpperCase(Locale.ROOT));
                        altinci = key6.getText();
                        sayac++;
                        textfield.clear();
                        break;
                    default:
                        kelimelistesiolustur();
                }
            }
            else
            {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("UYARI");
                alert.setHeaderText("Girdiğiniz değer bir harf değil!");
                alert.show();
            }
        }


    public void harfSil(ActionEvent event) throws Exception {
        try {
            textfield.setText(textfield.getText().substring(0, textfield.getText().length() - 1));
        } catch (Exception e) {
            return;
        }
    }


    public void butondakiharfleriyaz() {

        while(true) {

            birinci = key1.getText().toUpperCase(Locale.ROOT);
            break;
        }


        while (true) {
            if (intikinci != intbirinci) {
                ikinci = key2.getText().toUpperCase(Locale.ROOT);
                //buton metodu
                break;
            }
        }

        while(true) {
            ucuncu = key3.getText().toUpperCase(Locale.ROOT);
            break;
            //buton metodu
        }

        while (true) {
            if (intdorduncu!=intucuncu) {
                dorduncu= key4.getText().toUpperCase(Locale.ROOT);
                //buton metodu
                break;
            }
        }

        while (true) {
            if (intbesinci!=intucuncu & intbesinci!=intdorduncu) {
                besinci = key5.getText().toUpperCase(Locale.ROOT);
                //buton metodu
                break;
            }
        }

        while (true) {
            if (intaltinci!=intucuncu & intaltinci!=intdorduncu  & intaltinci!=intbesinci) {
                altinci = key6.getText().toUpperCase(Locale.ROOT);
                //buton metodu
                break;
            }
        }


        while (true) {
            if (intikinci !=intortanca & intortanca!= intbirinci) {
                ortanca = key7.getText().toUpperCase(Locale.ROOT);
                //buton metodu
                break;
            }

        }

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
                    for (String eslesen : possibleWord) {
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

    for(String dogrumu: possibleWord){
        if(dogrumu.equals(girdi.equals(dogrumu))){
            System.out.println("dogru");
        }
        else{
            System.out.println("yanlıs");
        }
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
}
