package Project_Pegasus;

import Page.Flypgs;
import Utilities.GWD;
import org.openqa.selenium.*;

public class Flypgs_Test extends GWD {

    public static void main(String[] args) throws InterruptedException {

        Flypgs fly = new Flypgs();

        GWD.getDriver().get("https://www.flypgs.com/");

        GWD.getDriver().manage().window().maximize();

        GWD.getDriver().manage().deleteAllCookies();

        System.out.println("Çerezler Kabul edildi");

        fly.findAndClick("acceptCookie");
        System.out.println("Tek yön bilet seçeneği işaretlendi");
        fly.findAndClick("oneway");
        System.out.println("Nereden butonuna tıklandı");
        fly.findAndClick("nereden");
        System.out.println("Uçak'ın kalkış yapacağı şehir bilgisi girildi");
        fly.findAndSend("sehirsec", "ams");
        Bekleme(1);
        System.out.println("Amsterdam secildi");
        fly.findAndClick("amsterdam");
        Bekleme(1);
        System.out.println("Nereye butonuna tıklatıldı");
        fly.findAndClick("wheretoGo");
        System.out.println("Gideceğimiz şehir bilgisi girildi");
        fly.findAndSend("sehirsec2", "Abudhabi");
        System.out.println("Gideceğimiz şehir seçildi");
        fly.findAndClick("abudhabi");
        System.out.println("Takvim'e tıklatıldı");
        fly.findAndClick("calendar");
//        fly.findAndClick("calendarnext");
        System.out.println("6 Ekim Tarihi seçildi");
        fly.findAndClick("sixthday");
        System.out.println("Girilen uçuş bilgisi aratıldı");
        fly.findAndClick("searchbutton");

        System.out.println("Tekrar dene butonu görüldü, Site Otomasyon yaptığımızı fark ettiği için bloklama yapıyor");
        if (fly.tekrardene.isDisplayed()) {
            System.out.println("Tekrar Dene Tuşuna basıldı");
            fly.findAndClick("tekrardene");

        }
        System.out.println("Ucus bilgisi geldi");
        fly.findAndClick("ucusSec");

        Bekleme(1);
        System.out.println("Ekonomik paket secildi");
        fly.findAndClick("ekopaket");

        Bekleme(1);
        System.out.println("Devam et tusuna basıldı");
        fly.findAndClick("devamet");

        Bekleme(1);
        System.out.println("Ekrana cıkan ek paket teklifi reddedildi ve devam edildi");
        fly.findAndClick("mesajdvm");

        System.out.println("Misafir giris kısmında ElementClick Exception hatasına karsın try catch metodu kullanıldı");
        try {
            fly.findAndClick("misafirgiris");
        } catch (ElementClickInterceptedException e) {
            System.out.println("Misafir olarak giris yapıldı");
            fly.findAndClick("misafir");
        }
        System.out.println("Yolcu ismi girildi");
        fly.findAndSend("name", "Mustafa");
        System.out.println("Yolcu soyisim bilgisi girildi");
        fly.findAndSend("lastname", "Ceylan");
        System.out.println("Yolcunun doğduğu gün tarihi girildi");
        fly.findAndSend("birthday", "10");
        System.out.println("Yolcunun doğduğu ay girildi");
        fly.findAndSend("birthmounth", "10");
        System.out.println("Yolcunun doğduğu yıl girildi");
        fly.findAndSend("birthyear", "1990");
        System.out.println("Yolcu Cinsiyeti Girildi");
        fly.findAndClick("gendermale");
        System.out.println("Telefon numarası operator alan kodu girildi");
        fly.findAndSend("firstelarea", "555");
        System.out.println("Telefon numarasının kalan kısmı girildi");
        fly.findAndSend("telarea", "5555555");
        System.out.println("Passaport alanında Yabancı vatandaş olarak giris sağlandı");
        fly.findAndClick("anothercountry");
        System.out.println("Devam edildi");
        fly.findAndClick("devamet2");
        System.out.println("Mail addresi girildi");
        fly.findAndSend("eposta", "mustafa.cceylan@gmail.com");
        System.out.println("Devam edildi");
        fly.findAndClick("devamet2");

        Bekleme(1);
        System.out.println("Check'in bilgisi görüntülendi, devam edildi");
        fly.findAndClick("sUcus");

        Bekleme(1);
        System.out.println("Ucus ici ikram bilgileri teklif edildi, red edilerek devam edildi");
        fly.findAndClick("ymkDevam");

        Bekleme(1);
        System.out.println("Açılan ek kg teklifi red edilerek devam edildi");
        fly.findAndClick("mesajdvm");

        Bekleme(1);
        System.out.println("Ucus ici ek teklifler red edilerek devam edildi");
        fly.findAndClick("sUcus");

        Bekleme(1);
        System.out.println("Bagac paketlerinde 15 kg sabit paket secilerek devam edildi");
        fly.findAndClick("bagajDevam");

        Bekleme(1);
        System.out.println("15 kg üstünde olması durumunda hatırlatma mesajı cıktı red edilerek kapatıldı");
        fly.findAndClick("tekbgj");
        System.out.println("Ucak ici ek teklifler red edilerek devam edildi");
        fly.findAndClick("ucusdevam");
        System.out.println("Devam edildi");
        fly.findAndClick("devamet2");
        System.out.println("Odeme alanı acıldı ");
        fly.findAndClick("ödemeYap");
        System.out.println("Odeme alanının görüldüğü doğrulandı");
        fly.findAndContainsText("odemeAlani","Ödeme Şeklini Seçiniz");

        System.out.println("Test Passed");

        GWD.quitDriver();


    }


}
