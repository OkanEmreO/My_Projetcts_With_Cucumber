package Project_Hotels;

import Page.Hotels;
import Utilities.GWD;

import java.util.ArrayList;

public class Hotels_com extends GWD {

    public static void main(String[] args) throws InterruptedException {

        Hotels hotels=new Hotels();

        System.out.println("Senaryo başladı");

        GWD.getDriver().get("https://tr.hotels.com/");

        String oldTab =getDriver().getWindowHandle();

        GWD.getDriver().manage().window().maximize();

        GWD.getDriver().manage().deleteAllCookies();

        System.out.println("Nereye butonuna tıklandı");
        hotels.findAndClick("varisNoktasi");
        Bekleme(1);
        System.out.println("Rio De Janerio yazıldı");
        hotels.findAndSend("nereye","rio De Janerio");
        Bekleme(1);
        System.out.println("Rio de Janerio secildi");
        hotels.findAndClick("rioDeJanerio");
        System.out.println("Takvim açıldı");
        hotels.findAndClick("takvim");

        Bekleme(1);
        System.out.println("Giriş tarihi 26 Ekim secildi");
        hotels.findAndClick("ekim26");
        Bekleme(1);
        System.out.println("Çıkış tarihi 22 Kasım secildi");
        hotels.findAndClick("kasim22");
        Bekleme(1);
        System.out.println("Açılan Takvim sekmesinin kapanması icin Tamam butonuna tıklandı");
        hotels.findAndClick("tamam");
        System.out.println("Misafir Yolcu Sayısı tıklandı");
        hotels.findAndClick("misafirSayisi");
        Bekleme(1);
        System.out.println("Misafir sayısı düsürüldü");
        hotels.findAndClick("sayiDusur");
        System.out.println("Açılan sekmenin kapatılması için tamam butonuna tıklatıldı");
        hotels.findAndClick("tamam2");
        System.out.println("Bilet aratıldı");
        hotels.findAndClick("biletAra");
        Bekleme(2);
        System.out.println("Arama sonucunda Acılan sayfada CopaCabana'da bir hotel secildi");
        hotels.findAndClick("copaCabana");

        ArrayList<String> newTab = new ArrayList<String>(getDriver().getWindowHandles());

        newTab.remove(oldTab);
        System.out.println("Farklı bir sekme acıldığı icin önce ki sekme kapatıldı");

        getDriver().switchTo().window(newTab.get(0));
        System.out.println("Yeni acılan sayfada sectiğimiz otel icin Rezervayson butonuna tıklandı");
        hotels.findAndClick("rezervasyon");
        System.out.println("Oda türü için paket secildi");
        hotels.findAndClick("odasec");
        System.out.println("Acılan kücük ekranda ödeme yöntemi olarak konaklama yerinde öde secildi");
        hotels.findAndClick("konaklamaYerindeOde");
        System.out.println("Müşteri Adı girildi");
        hotels.findAndSend("name", "Russel");
        System.out.println("Müşteri Soyadı girildi");
        hotels.findAndSend("lastname", "Mcwalker");
        System.out.println("Müşteriye ait email addressi girildi");
        hotels.findAndSend("email", "email.email@gmail.com");
        System.out.println("Müşteriye ait Telefon numarası girildi");
        hotels.findAndSend("phoneNumber", "5555555555");
        System.out.println("Rıza metni onaylandı");
        hotels.findAndClick("rizaMetni");
        System.out.println("Kart'ın 16 haneli kart numarası girildi");
        hotels.findAndSend("kartNumarasi", "45645645454544646464448784754");
        System.out.println("Kart'ın son kullanım ay tarihi girildi");
        hotels.findAndSend("kartAyTarihi", "03");
        System.out.println("Kart'ın son kullanım yıl tarihi girildi");
        hotels.findAndSend("kartYilTarihi", "26");
        System.out.println("Kart'ın arka tarafında bulunan 3 haneli CVV numarası girildi");
        hotels.findAndSend("kartCvv", "086");
        System.out.println("Ödeme yap butonuna tıklandı");
        hotels.findAndClick("odemeYap");

        System.out.println("Test Passed");
        GWD.quitDriver();



    }

}
