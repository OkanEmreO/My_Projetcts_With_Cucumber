package StepDefinitions;

import Pages.Flypgs;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.misc.ExtensionInstallationException;

import java.awt.*;
import java.awt.event.KeyEvent;

public class PegasusSteps extends GWD {

    Flypgs fly = new Flypgs();


    Actions actions = new Actions(getDriver());


    Robot rbt = new Robot();


    public PegasusSteps() throws AWTException {
    }


    @Given("Fly to Website")
    public void flyToWebsite() {

        GWD.getDriver().get("https://www.flypgs.com/");

        GWD.getDriver().manage().window().maximize();

        GWD.getDriver().manage().deleteAllCookies();


    }

    @Then("Choose one way")
    public void chooseOneWay() {
        fly.findAndClick("acceptCookie");

        fly.findAndClick("oneway");
    }

    @And("Decide where to go")
    public void decideWhereToGo() throws InterruptedException {

        fly.findAndClick("nereden");
        fly.findAndSend("sehirsec", "ams");
        Bekleme(2);
        fly.findAndClick("amsterdam");
        Bekleme(1);
        fly.findAndClick("wheretoGo");
        fly.findAndSend("sehirsec2", "Abudhabi");
        fly.findAndClick("abudhabi");
        fly.findAndClick("calendar");
//        fly.findAndClick("calendarnext"); -- takvim ileri attığı için yeri değişti,
        fly.findAndClick("sixthday");

    }

    @Then("Click the search flight button")
    public void clickTheSearchFlightButton() throws InterruptedException {
        Bekleme(2);
        fly.findAndClick("searchbutton");

        if (fly.tekrardene.isDisplayed()) {

            fly.findAndClick("tekrardene");

        }

    }

    @And("Choose your flight type")
    public void chooseYourFlightType() throws InterruptedException {
        fly.findAndClick("ucusSec");

        Bekleme(1);

        fly.findAndClick("ekopaket");

        Bekleme(1);

        fly.findAndClick("devamet");

        Bekleme(1);

        fly.findAndClick("mesajdvm");
    }

    @Then("Enter your personal information")
    public void enterYourPersonalInformation() throws InterruptedException {

        try {
            fly.findAndClick("misafirgiris");
        } catch (ElementClickInterceptedException e) {
            fly.findAndClick("misafir");
        }
        fly.findAndSend("name", "Mustafa");

        fly.findAndSend("lastname", "Ceylan");

        fly.findAndSend("birthday", "10");

        fly.findAndSend("birthmounth", "10");

        fly.findAndSend("birthyear", "1990");

        fly.findAndClick("gendermale");

        fly.findAndSend("firstelarea", "555");

        fly.findAndSend("telarea", "5555555");

        fly.findAndClick("anothercountry");

        fly.findAndClick("devamet2");

        fly.findAndSend("eposta", "mustafa.cceylan@gmail.com");

        fly.findAndClick("devamet2");

        Bekleme(2);

        fly.findAndClick("sUcus");

    }

    @And("User should be continue with next steps")
    public void userShouldBeContinueWithNextSteps() throws InterruptedException {


        Bekleme(1);

        fly.findAndClick("ymkDevam");

        Bekleme(1);

        fly.findAndClick("mesajdvm");

        Bekleme(1);

        fly.findAndClick("sUcus");

        Bekleme(1);

        fly.findAndClick("bagajDevam");

        Bekleme(1);

        fly.findAndClick("tekbgj");

        fly.findAndClick("ucusdevam");

        fly.findAndClick("devamet2");

        fly.findAndClick("ödemeYap");


    }

    @Then("User should be display succes or not for the Fly")
    public void userShouldBeDisplaySuccesOrNotForTheFly() {

        fly.findAndContainsText("odemeAlani", "Ödeme Şeklini Seçiniz");

    }


}
