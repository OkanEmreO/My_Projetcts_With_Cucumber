package StepDefinitions;

import Pages.EnUygun;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class EnUygun_Step extends GWD{

    EnUygun enUyguncom = new EnUygun();

    @Given("Go to the EnUygun Website")
    public void goToTheEnUygunWebsite() {

        GWD.getDriver().get("https://www.enuygun.com/");

        GWD.getDriver().manage().window().maximize();

        GWD.getDriver().manage().deleteAllCookies();

    }

    @Then("Go to Bus Ticket")
    public void goToBusTicket() {

        enUyguncom.findAndClick("otobusTicket");

        enUyguncom.findAndSend("nereden", "Fethiye");

        enUyguncom.findAndClick("fethiye");

        enUyguncom.findAndSend("nereye", "İstanbul");

        enUyguncom.findAndClick("istanbul");

        enUyguncom.findAndClick("takvim");

        enUyguncom.findAndClick("nextMonth");

        enUyguncom.findAndClick("twelfthDecember");

        enUyguncom.findAndClick("biletBul");
    }

    @And("Choose where to go and and search")
    public void chooseWhereToGoAndAndSearch() throws InterruptedException {
        Bekleme(2);
        enUyguncom.findAndClick("biletSec");
    }

    @Then("Choose the ticket when want to go")
    public void chooseTheTicketWhenWantToGo() throws InterruptedException {
        Bekleme(1);
        enUyguncom.findAndClick("firstSeat");
        Bekleme(1);
        enUyguncom.findAndClick("cinsiyetErkek");
        Bekleme(1);
        enUyguncom.findAndClick("onaylaveDevamEt");
    }

    @And("Enter the User Data and Give The Card to pay")
    public void enterTheUserDataAndGiveTheCardToPay() throws InterruptedException {
        Bekleme(1);
        enUyguncom.findAndSend("email", "bul34ist34@gmail.com");
        Bekleme(1);
        enUyguncom.findAndSend("phoneNumber", "5554566644");
        Bekleme(1);
        enUyguncom.findAndClick("rizaMetni");
        Bekleme(1);
        enUyguncom.findAndSend("name", "Kamel");
        Bekleme(1);
        enUyguncom.findAndSend("lastname", "Tanrısevdi");
        Bekleme(1);
        enUyguncom.findAndClick("yabanciVatandas");
        Bekleme(1);
        enUyguncom.findAndSend("passaportNumber", "45645645");
        Bekleme(1);
        enUyguncom.findAndClick("passaportCountry");
        Bekleme(1);
        enUyguncom.findAndSend("kartNumarasi", "4444555566668888999911112222");
        Bekleme(1);
        enUyguncom.findAndClick("kartAyTarihi");
        Bekleme(1);
        enUyguncom.findAndClick("kartYilTarihi");
        Bekleme(1);
        enUyguncom.findAndSend("kartCvv", "186");
        Bekleme(1);
        enUyguncom.findAndClick("odemeYap");


    }

    @Then("User should be display if Success or not")
    public void userShouldBeDisplayIfSuccessOrNot() {

        enUyguncom.findAndContainsText("hataMesaji","Lütfen geçerli bir kart girin.");
    }
}
