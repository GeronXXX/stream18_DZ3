import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.cssClass;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class dz3V1 {
    @AfterAll
    static void after() {
        Configuration.holdBrowserOpen=true;
    }

    @BeforeAll
    static void beforeALL() {
        Configuration.browserSize = "2560x1440";
        Configuration.baseUrl = "https://demoqa.com";}

    @Test
    void AutomationPracticeForm() {

        open("/automation-practice-form");

        $("#firstName").setValue("Test");
        $("#lastName").setValue("Testov");
        $("#userEmail").setValue("Testovich@test.ru");
        $(byText("Other")).click();
        $("#userNumber").setValue("89999999999");
        $("#dateOfBirthInput").click();
        $("[class=react-datepicker__month-select]").click();
        $(byText("March")).click();
        $(byText("13")).click();
        $("#subjectsInput").setValue("Moscow");
        $(byText("Sports")).click();
        $(byText("Reading")).click();
        $(byText("Music")).click();
        $("input[type=file]").sendKeys("E:/Users/ivant/Desktop/Безымянный.jpg");
        $("#currentAddress").setValue("Vetoshnyy Pereulok, 5, офис 219, Moscow, 109012");





        }
    }


