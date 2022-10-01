package Page;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flypgs extends Parent{

    public Flypgs() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(id = "nxm2CookieSubmitButton")
    private WebElement acceptCookie;
    @FindBy(xpath = "(//div[@class='nxm2_form-group-radio']/label)[2]")
    private WebElement oneway;

    @FindBy(xpath = "//div[@data-text='Nereden']")
    private WebElement nereden;

    @FindBy(xpath = "(//input[@data-search-title='Arama Sonuçları'])[1]")
    private WebElement sehirsec;

    @FindBy(xpath = "//li[@data-name='Amsterdam']")
    private WebElement amsterdam;

    @FindBy(xpath = "//div[@data-text='Nereye']")
    private WebElement wheretoGo;

    @FindBy(xpath = "(//input[@data-search-title='Arama Sonuçları'])[2]")
    private WebElement sehirsec2;

    @FindBy(xpath = "(//div[text()='Birleşik Arap Emirlikleri'])[5]")
    private WebElement abudhabi;

    @FindBy(id = "dp1")
    private WebElement calendar;

    @FindBy(xpath = "(//a[@title=\"ileri>\"])[1]")
    private WebElement calendarnext;

    @FindBy(xpath = "//td[@data-month='9']/a[text()='6']")
    private WebElement sixthday;

    @FindBy(xpath = "//button[text()='Ucuz Uçuş Ara']")
    private WebElement searchbutton;

    @FindBy(xpath = "//a[@class='h-scroll-button']/span")
    private WebElement scrollup;

    @FindBy(xpath = "//*[@id=\"availability-list\"]/div[1]/button")
    private WebElement ucusSec;

    @FindBy(xpath = "//*[@id=\"availability-list\"]/div[1]/div/div[1]/div[1]/div[2]/button")
    private WebElement ekopaket;

    @FindBy(xpath = "//button/div[text()='TEKRAR DENE']")
    public WebElement tekrardene;

    @FindBy(xpath = "//*[@id=\"boarding-card-body\"]/div/div[7]/div[1]/button[2]")
    private WebElement devamet;

    @FindBy(xpath = "//*[@id=\"boarding-card-body\"]/div[1]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/form/div/div[3]/button[3]/div")
    private WebElement misafir;

    @FindBy(xpath = "(//div/input[@class='MuiInputBase-input MuiInput-input'])[3]")
    private WebElement name;

    @FindBy(xpath = "(//div/input[@class='MuiInputBase-input MuiInput-input'])[4]")
    private WebElement lastname;

    @FindBy(xpath = "(//div/input[@class='MuiInputBase-input MuiInput-input'])[5]")
    private WebElement birthday;

    @FindBy(xpath = "(//div/input[@class='MuiInputBase-input MuiInput-input'])[6]")
    private WebElement birthmounth;

    @FindBy(xpath = "(//div/input[@class='MuiInputBase-input MuiInput-input'])[7]")
    private WebElement birthyear;

    @FindBy(xpath= "//*[@id='passengerForm_0']/div/div/form/div[1]/div/div[5]/div[2]/div/label[2]")
    private WebElement gendermale;

    @FindBy(xpath = "(//div/input[@name='area-code'])[2]")
    private WebElement firstelarea;

    @FindBy(xpath = "(//div/input[@class='MuiInputBase-input MuiInput-input'])[8]")
    private WebElement telarea;

    @FindBy(xpath = "(//div/input[@class='MuiInputBase-input MuiInput-input'])[9]")
    private WebElement tcno;

    @FindBy(xpath = "//*[@id=\"passengerForm_0\"]/div/div/form/div[1]/div/div[7]/div/div[1]/div[2]/label[2]/span[2]")
    private WebElement anothercountry;
    @FindBy(xpath = "//div[@class='submit-button-container']/button")
    private WebElement devamet2;

    @FindBy(xpath = "//button[@type='button']/div[text()='Devam Et']")
    private WebElement mesajdvm;

    @FindBy(xpath = "//*[@id=\"passengerForm_0\"]/button/div[2]/div[1]")
    private WebElement misafirgiris;

    @FindBy(xpath = "//*[@id=\"contactForm\"]/div/form/div/div[2]/div[4]/div/div/div/input")
    private WebElement eposta;

    @FindBy(xpath = "//button/div[text()='SIRADAKİ UÇUŞA DEVAM']")
    private WebElement sUcus;

    @FindBy(xpath = "//button/div[text()='YEMEK SEÇİMİNE DEVAM']")
    private WebElement ymkDevam;

    @FindBy(xpath = "//button/div[text()='BAGAJ HAKKI SEÇİMİNE DEVAM']")
    private WebElement sUcus2;

    @FindBy(xpath = "//*[@id=\"boarding-card-body\"]/div/div[2]/div[2]/div[3]/div[2]/button/div")
    private WebElement bagajDevam;

    @FindBy(xpath = "(//div[@class='baggage-selection-item-radio-button'])[1]")
    private WebElement tekbgj;

    @FindBy(xpath = "//*[@id=\"boarding-card-body\"]/div/div[2]/div[2]/div[7]/button/div")
    private WebElement ucusdevam;

    @FindBy(xpath = "//button/div[text()='ÖDEMEYE DEVAM']")
    private WebElement ödemeYap;

    @FindBy(xpath = "//div[text()='Ödeme Şeklini Seçiniz']")
    private WebElement odemeAlani;



    WebElement myElement;


    public void findAndClick(String strElement){

        switch (strElement){
            case "oneway" : myElement=oneway;break;
            case "nereden": myElement=nereden;break;
            case "wheretoGo": myElement=wheretoGo;break;
            case "calendar": myElement=calendar;break;
            case "calendarnext": myElement=calendarnext;break;
            case "sixthday" : myElement=sixthday;break;
            case "searchbutton": myElement=searchbutton;break;
            case "acceptCookie": myElement=acceptCookie;break;
            case "amsterdam": myElement=amsterdam;break;
            case "abudhabi": myElement=abudhabi;break;
            case "scrollup": myElement=scrollup;break;
            case "ucusSec": myElement=ucusSec;break;
            case "ekopaket": myElement=ekopaket;break;
            case "tekrardene": myElement=tekrardene;break;
            case "devamet" : myElement=devamet;break;
            case "misafir": myElement=misafir;break;
            case "devamet2": myElement=devamet2;break;
            case "mesajdvm": myElement=mesajdvm;break;
            case "misafirgiris": myElement=misafirgiris;break;
            case "gendermale": myElement=gendermale;break;
            case "anothercountry":myElement=anothercountry;break;
            case "sUcus":myElement=sUcus;break;
            case "ymkDevam":myElement=ymkDevam;break;
            case "bagajDevam":myElement=bagajDevam;break;
            case "tekbgj":myElement=tekbgj;break;
            case "ucusdevam":myElement=ucusdevam;break;
            case "ödemeYap": myElement=ödemeYap;break;



        }
        clickFunction(myElement);

    }

    public void findAndSend(String strElement,String value){
        switch (strElement){
            case "sehirsec": myElement=sehirsec; break;
            case "sehirsec2": myElement=sehirsec2; break;
            case "name": myElement=name;break;
            case "lastname": myElement=lastname;break;
            case "birthday":myElement=birthday;break;
            case "birthmounth":myElement=birthmounth;break;
            case "birthyear":myElement=birthyear;break;
            case "firstelarea": myElement=firstelarea;break;
            case "telarea": myElement=telarea;break;
            case "tcno": myElement=tcno;break;
            case "eposta": myElement=eposta;break;


        }
        sendKeysFunction(myElement,value);
    }

    public void findAndContainsText(String strElement, String text){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "odemeAlani" : myElement =odemeAlani; break;

        }

        verifyContainsText(myElement,text);
    }









}
