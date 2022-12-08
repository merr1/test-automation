import buttonClicks.ButtonClick;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import com.codeborne.selenide.*;
import static com.codeborne.selenide.Selenide.open;


import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import validation.Validation;

import static com.codeborne.selenide.AssertionMode.SOFT;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;



public class SeleniumTest1 {

    public static void main(String[] args) {

        firstcase();
        secondcase();


    }

    private static void firstcase() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        open("https://demoqa.com/");
        SelenideElement firstElement = $("div.card-body").$(withText("Elements"));
        firstElement.scrollTo();
        firstElement.click();
        SelenideElement radio = $("#item-2");
        radio.click();
        Validation validElem = new Validation();
        validElem.findAndClick();
        SelenideElement status = $("#impressiveRadio").shouldBe(Condition.selected);
        System.out.println(status);
    }
    private static void secondcase() {

        open("https://demoqa.com/");

        SelenideElement SecondElement = $("div.card-body").$(withText("Elements"));
        SecondElement.scrollTo();
        SecondElement.click();
        SelenideElement findButton = $("#item-4");
        findButton.scrollTo();
        findButton.click();
        ButtonClick buttonCli= new ButtonClick();
        buttonCli.setClickMeButton();
        buttonCli.findExactText("You have done a dynamic click");
        buttonCli.clickContext();
        buttonCli.findShouldText("You have done a right click");
    }
}
