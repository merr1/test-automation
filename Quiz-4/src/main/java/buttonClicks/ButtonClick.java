package buttonClicks;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.exactText;

public class ButtonClick {
    public SelenideElement clickMeButton = $(By.xpath("//button[text()='Click Me']"));
    public void setClickMeButton() {
        clickMeButton.click();
    }
    public ButtonClick findExactText(String text) {
        $("#dynamicClickMessage").shouldHave(exactText(text));
        return this;
    }
    public void clickContext() {
        $(By.xpath("//button[text()='Right Click Me']")).contextClick();
    }
    public ButtonClick findShouldText(String text) {
        $("#rightClickMessage").shouldHave(exactText(text));
        return this;
    }

}
