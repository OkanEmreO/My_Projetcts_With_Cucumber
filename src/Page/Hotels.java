package Page;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotels extends Parent{

    public Hotels() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "//button[@aria-label='Varış noktası']")
    private WebElement varisNoktasi;

    @FindBy(id= "destination_form_field")
    private WebElement nereye;
    @FindBy(xpath = "//button[@aria-label='Rio de Janeiro (eyaleti) Brezilya']")
    private WebElement rioDeJanerio;
    @FindBy(id = "date_form_field-btn")
    private WebElement takvim;

    @FindBy(xpath = "(//button[@data-day='26'])[1]")
    private WebElement ekim26;

    @FindBy(xpath = "(//button[@data-day='22'])[2]")
    private WebElement kasim22;

    @FindBy(xpath = "//button[@data-stid='apply-date-picker']")
    private WebElement tamam;

    @FindBy(xpath = "//button[@class='uitk-menu-trigger uitk-fake-input uitk-form-field-trigger']")
    private WebElement misafirSayisi;

    @FindBy(xpath = "(//span[@class='uitk-step-input-button'])[1]")
    private WebElement sayiDusur;

    @FindBy(id = "traveler_selector_done_button")
    private WebElement tamam2;

    @FindBy(xpath = "//button[@id='submit_button']")
    private WebElement biletAra;

    @FindBy(xpath = "(//a[@data-stid='open-hotel-information'])[6]")
    private WebElement copaCabana;

    @FindBy(xpath = "//button[text()='Oda rezervasyonu yap']")
    private WebElement rezervasyon;

    @FindBy(xpath = "(//button[@data-stid='submit-hotel-reserve']/span[text()='Rezervasyon yap'])[8]")
    private WebElement odasec;

    @FindBy(xpath = "//span[text()='Konaklama yerinde öde']")
    private WebElement konaklamaYerindeOde;

    @FindBy(xpath= "(//input[@class='replay-reveal'])[3]")
    private WebElement email;

    @FindBy(id = "contact-details-phone")
    private WebElement phoneNumber;

    @FindBy(xpath= "(//input[@class='replay-reveal'])[1]")
    private WebElement name;

    @FindBy(xpath= "(//input[@class='replay-reveal'])[2]")
    private WebElement lastname;

    @FindBy(xpath = "(//input[@class='replay-reveal'])[4]")
    private WebElement kartSahibiAdi;

    @FindBy(xpath = "contact-details-newsletter")
    private WebElement rizaMetni;

    @FindBy(xpath = "(//input[@class='replay-reveal'])[5]")
    private WebElement kartSahibiSoyadi;

    @FindBy(id = "payment-details-card-number")
    private WebElement kartNumarasi;

    @FindBy(id =  "expiry-month")
    private WebElement kartAyTarihi;

    @FindBy(id =  "expiry-year")
    private WebElement kartYilTarihi;

    @FindBy(id =  "payment-details-cvv")
    private WebElement kartCvv;

    @FindBy(id =  "book-button")
    private WebElement odemeYap;
//
//    @FindBy(xpath =  "//span[text()='Lütfen geçerli bir kart girin.']")
//    private WebElement hataMesaji;







    WebElement myElement;



    public void findAndClick(String strElement){

        switch (strElement){
            case "varisNoktasi" : myElement=varisNoktasi;break;
            case "rioDeJanerio": myElement=rioDeJanerio;break;
            case "takvim": myElement=takvim;break;
            case "ekim26": myElement=ekim26;break;
            case "kasim22" : myElement=kasim22;break;
            case "tamam": myElement=tamam;break;
            case "misafirSayisi": myElement=misafirSayisi;break;
            case "sayiDusur": myElement=sayiDusur;break;
            case "tamam2": myElement=tamam2;break;
            case "biletAra": myElement=biletAra;break;
            case "copaCabana": myElement=copaCabana;break;
            case "rezervasyon": myElement=rezervasyon;break;
            case "odasec": myElement=odasec;break;
            case "konaklamaYerindeOde": myElement=konaklamaYerindeOde;break;
            case "odemeYap": myElement=odemeYap;break;

        }
        clickFunction(myElement);

    }

    public void findAndSend(String strElement,String value){
        switch (strElement){
            case "nereye": myElement=nereye;break;
            case "email": myElement=email;break;
            case "phoneNumber": myElement=phoneNumber;break;
            case "name": myElement=name;break;
            case "lastname": myElement=lastname;break;
            case "kartNumarasi": myElement=kartNumarasi;break;
            case "kartCvv": myElement=kartCvv;break;
            case "kartAyTarihi": myElement=kartAyTarihi;break;
            case "kartYilTarihi": myElement=kartYilTarihi;break;
            case "kartSahibiAdi": myElement=kartSahibiAdi;break;
            case "kartSahibiSoyadi": myElement=kartSahibiSoyadi;break;

        }
        sendKeysFunction(myElement,value);
    }

    public void findAndContainsText(String strElement, String text){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
//            case "hataMesaji" : myElement =hataMesaji; break;

        }

        verifyContainsText(myElement,text);
    }


}
