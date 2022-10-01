package Project_EnUygun;

import Page.EnUygun;
import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.support.ui.Select;

import javax.xml.bind.SchemaOutputResolver;


public class EnUygun_Test extends GWD {


    public static void main(String[] args) throws InterruptedException {

        EnUygun enUygun = new EnUygun();

        System.out.println("Senaryo başladı");
       
        GWD.getDriver().get("https://www.enuygun.com/");

        GWD.getDriver().manage().window().maximize();

        GWD.getDriver().manage().deleteAllCookies();

        System.out.println("Otobüs sekmesine tıklandı");
        enUygun.findAndClick("otobusTicket");
        System.out.println("Nereden butonuna tıklandı ve arama bölümüne Fethiye yazıldı");
        enUygun.findAndSend("nereden", "Fethiye");
        System.out.println("Fethiye tıklandı");
        enUygun.findAndClick("fethiye");
        System.out.println("Nereye butonuna tıklandı ve arama kısmına İstanbul yazıldı");
        enUygun.findAndSend("nereye", "İstanbul");
        System.out.println("İstanbul tıklandı");
        enUygun.findAndClick("istanbul");
        System.out.println("Takvim butonuna tıklandı");
        enUygun.findAndClick("takvim");
//        System.out.println("Takvim'de gelecek ay butonu tıklandı");
//        enUygun.findAndClick("nextMonth");
        System.out.println("12 ekim secildi");
        enUygun.findAndClick("twelfthDecember");
        System.out.println("Bilet arama işlemi sağlandı");
        enUygun.findAndClick("biletBul");
        System.out.println("Bilet secildi");
        Bekleme(2);
        enUygun.findAndClick("biletSec");
        Bekleme(1);
        System.out.println("İlk koltuk secildi");
        enUygun.findAndClick("firstSeat");
        Bekleme(1);
        System.out.println("Cinsiyet Erkek olarak secildi");
        enUygun.findAndClick("cinsiyetErkek");
        Bekleme(1);
        System.out.println("Onaylandı ve Devam edildi");
        enUygun.findAndClick("onaylaveDevamEt");
        Bekleme(1);
        System.out.println("Email alanına mail addressi girildi");
        enUygun.findAndSend("email", "MC_Lucas@gmail.com");
        Bekleme(1);
        System.out.println("Telefon numarası girildi");
        enUygun.findAndSend("phoneNumber", "5555555555");
        Bekleme(1);
        System.out.println("Rıza metni Onaylandı");
        enUygun.findAndClick("rizaMetni");
        Bekleme(1);
        System.out.println("İsim girildi");
        enUygun.findAndSend("name", "Lucas");
        Bekleme(1);
        System.out.println("Soyisim girildi");
        enUygun.findAndSend("lastname", "Mcgrotisch");
        Bekleme(1);
        System.out.println("Vatandaşlık secildi");
        enUygun.findAndClick("yabanciVatandas");
        Bekleme(1);
        System.out.println("Passaport numarası girildi");
        enUygun.findAndSend("passaportNumber", "45645645");
        Bekleme(1);
        System.out.println("Hangi ülke olduğu secildi");
        enUygun.findAndClick("passaportCountry");
        Bekleme(1);
        System.out.println("Kart numarası girildi");
        enUygun.findAndSend("kartNumarasi", "45645645454544646464448784754");
        Bekleme(1);
        System.out.println("Kart'ın son kullanım ayı girildi");
        enUygun.findAndClick("kartAyTarihi");
        Bekleme(1);
        System.out.println("Kart'ın son kullanım yılı girildi");
        enUygun.findAndClick("kartYilTarihi");
        Bekleme(1);
        System.out.println("Kart'ın CVV numarası girildi");
        enUygun.findAndSend("kartCvv", "086");
        Bekleme(1);
        System.out.println("Ödeme butonuna Tıklandı");
        enUygun.findAndClick("odemeYap");

        enUygun.findAndContainsText("hataMesaji","Lütfen geçerli bir kart girin.");


        System.out.println("**************************************************");

        System.out.println("Test Passed");

        GWD.quitDriver();

    }

}
