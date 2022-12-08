package validation;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

public class Validation {
    private SelenideElement element;
    public void findAndClick() {
        $(By.xpath("//label[@for='impressiveRadio']")).click();
    }
    public void validate(String text){
        System.out.println("works");
        element.shouldHave(text(text));
    }
}