package Page;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnUygun extends Parent{


    public EnUygun() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Otobüs Bileti']")
    private WebElement otobusTicket;
    @FindBy(xpath = "(//input[@placeholder='İl veya ilçe adı yazın'])[1]")
    private WebElement nereden;

    @FindBy(xpath = "(//div[@role='menuitem'])[1]")
    private WebElement fethiye;

    @FindBy(xpath = "(//input[@placeholder='İl veya ilçe adı yazın'])[2]")
    private WebElement nereye;

    @FindBy(xpath = "(//div[@role='menuitem'])[1]")
    private WebElement istanbul;

    @FindBy(name = "departureDate")
    private WebElement takvim;

    @FindBy(xpath = "(//div[@role='button'])[2]")
    private WebElement nextMonth;

    @FindBy(xpath = "//td[@aria-label='Çarşamba, 12 Ekim 2022']/div")
    private WebElement twelfthDecember;

    @FindBy(xpath = "//strong[text()='Otobüs bileti bul']")
    private WebElement biletBul;

    @FindBy(xpath = "(//span[text()='Seç'])[16]")
    private WebElement biletSec;

    @FindBy(xpath = "//span[@class='ctx-selectedseat seat-1']")
    private WebElement firstSeat;

    @FindBy(xpath = "//span[text()='Erkek']")
    private WebElement cinsiyetErkek;

    @FindBy(xpath = "//span[text()='Onayla ve Devam Et']")
    private WebElement onaylaveDevamEt;

    @FindBy(id = "contact_email")
    private WebElement email;

    @FindBy(id = "contact_phone_number")
    private WebElement phoneNumber;

    @FindBy(id = "passenger0_firstname")
    private WebElement name;

    @FindBy(id = "passenger0_lastname")
    private WebElement lastname;

    @FindBy(xpath = "(//span[@class='checkmark'])[2]")
    private WebElement yabanciVatandas;

    @FindBy(xpath = "(//span[@class='checkmark'])[1]")
    private WebElement rizaMetni;

    @FindBy(name = "passengers[0][passport_no]")
    private WebElement passaportNumber;

    @FindBy(xpath = "//select[@name='passengers[0][passport_country_code]']/option[@value='US']")
    private WebElement passaportCountry;

//    @FindBy(name = "//select[@name='passengers[0][passport_country_code]']/option[@value='US']")
//    private WebElement passaportCountry;

    @FindBy(id = "payment_card_number")
    private WebElement kartNumarasi;

    @FindBy(xpath =  "//select[@name=\"payment[card_exp_month]\"]/option[@value='03']")
    private WebElement kartAyTarihi;

    @FindBy(xpath =  "//select[@name=\"payment[card_exp_year]\"]/option[@value='26']")
    private WebElement kartYilTarihi;

    @FindBy(id =  "payment_card_cvc_optional")
    private WebElement kartCvv;

    @FindBy(xpath =  "//span[text()='Satın Al']")
    private WebElement odemeYap;

    @FindBy(xpath =  "//span[text()='Lütfen geçerli bir kart girin.']")
    public WebElement hataMesaji;


//    @FindBy(id = "passenger0_lastname")
//    private WebElement lastname;
//
//    @FindBy(id = "passenger0_lastname")
//    private WebElement lastname;
//
//    @FindBy(id = "passenger0_lastname")
//    private WebElement lastname;





    WebElement myElement;



    public void findAndClick(String strElement){

        switch (strElement){
            case "otobusTicket" : myElement=otobusTicket;break;
            case "fethiye": myElement=fethiye;break;
            case "istanbul": myElement=istanbul;break;
            case "takvim": myElement=takvim;break;
            case "nextMonth" : myElement=nextMonth;break;
            case "twelfthDecember": myElement=twelfthDecember;break;
            case "biletBul": myElement=biletBul;break;
            case "biletSec": myElement=biletSec;break;
            case "firstSeat": myElement=firstSeat;break;
            case "cinsiyetErkek": myElement=cinsiyetErkek;break;
            case "onaylaveDevamEt": myElement=onaylaveDevamEt;break;
            case "yabanciVatandas": myElement=yabanciVatandas;break;
            case "rizaMetni": myElement=rizaMetni;break;
            case "passaportCountry": myElement=passaportCountry;break;
            case "kartAyTarihi": myElement=kartAyTarihi;break;
            case "kartYilTarihi": myElement=kartYilTarihi;break;
            case "odemeYap": myElement=odemeYap;break;
        }
        clickFunction(myElement);

    }

    public void findAndSend(String strElement,String value){
        switch (strElement){
            case "nereden": myElement=nereden;break;
            case "nereye": myElement=nereye;break;
            case "email": myElement=email;break;
            case "phoneNumber": myElement=phoneNumber;break;
            case "name": myElement=name;break;
            case "lastname": myElement=lastname;break;
            case "passaportNumber": myElement=passaportNumber;break;
            case "kartNumarasi": myElement=kartNumarasi;break;
            case "kartCvv": myElement=kartCvv;break;


        }
        sendKeysFunction(myElement,value);
    }

    public void findAndContainsText(String strElement, String text){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "hataMesaji" : myElement =hataMesaji; break;

        }

        verifyContainsText(myElement,text);
    }


}
