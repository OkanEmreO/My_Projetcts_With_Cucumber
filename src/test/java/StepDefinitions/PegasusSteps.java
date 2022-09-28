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

//        rbt.keyPress(KeyEvent.VK_TAB);
//        rbt.keyRelease(KeyEvent.VK_TAB);
//
//        rbt.keyPress(KeyEvent.VK_TAB);
//        rbt.keyRelease(KeyEvent.VK_TAB);
//
//        rbt.keyPress(KeyEvent.VK_ENTER);
//        rbt.keyRelease(KeyEvent.VK_ENTER);


    }

    @Then("Choose one way")
    public void chooseOneWay(){


        fly.findAndClick("acceptCookie");




        fly.findAndClick("oneway");




    }

    @And("Decide where to go")
    public void decideWhereToGo() throws InterruptedException {

        fly.findAndClick("nereden");
        fly.findAndSend("sehirsec","ams");
        Bekleme(2);
        fly.findAndClick("amsterdam");

        Bekleme(1);

//        fly.findAndClick("scrollup");


        fly.findAndClick("wheretoGo");
        fly.findAndSend("sehirsec2","Abudhabi");
        fly.findAndClick("abudhabi");

//        fly.findAndClick("scrollup");
        fly.findAndClick("calendar");
        fly.findAndClick("aysonu");

    }

    @Then("Click the search flight button")
    public void clickTheSearchFlightButton() throws InterruptedException {
//        fly.findAndClick("scrollup");
        Bekleme(2);
        fly.findAndClick("searchbutton");

        try {
            fly.findAndClick("tekrardene");
        }catch (WebDriverException e){
            fly.findAndClick("tekrardene");
        }

//        if(fly.tekrardene.isDisplayed()){
//
//
//        }




//        Bekleme(5);
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
        }catch (ElementClickInterceptedException e){
            fly.findAndClick("misafir");
        }
        fly.findAndSend("name","Mustafa");

        fly.findAndSend("lastname","Ceylan");

        fly.findAndSend("birthday","10");

        fly.findAndSend("birthmounth","10");

        fly.findAndSend("birthyear","1990");

        fly.findAndClick("gendermale");

        fly.findAndSend("firstelarea","555");

        fly.findAndSend("telarea","5555555");

        fly.findAndClick("anothercountry");

        fly.findAndClick("devamet2");

        fly.findAndSend("eposta","mustafa.cceylan@gmail.com");

        fly.findAndClick("devamet2");

        Bekleme(2);

        fly.findAndClick("sUcus");

        Bekleme(2);

        fly.findAndClick("ymkDevam");

        Bekleme(2);

        fly.findAndClick("mesajdvm");

        Bekleme(2);

        fly.findAndClick("sUcus");

        Bekleme(2);

        fly.findAndClick("bagajDevam");

        Bekleme(2);

        fly.findAndClick("tekbgj");

        fly.findAndClick("ucusdevam");

        fly.findAndClick("devamet2");

        fly.findAndClick("ödemeYap");

    }
}
