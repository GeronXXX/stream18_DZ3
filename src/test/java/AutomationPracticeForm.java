import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AutomationPracticeForm {
    @AfterAll
    static void after() {
        Configuration.holdBrowserOpen = true;
    }

    @BeforeAll
    static void beforeALL() {
        Configuration.browserSize = "2560x1440";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void practiceForm() {

        open("/automation-practice-form");

        File img = new File("src/test/resources/images/img.jpg");

        $("#firstName").setValue("Test");
        $("#lastName").setValue("Testov");
        $("#userEmail").setValue("Testovich@test.ru");
        $(byText("Other")).click();
        $("#userNumber").setValue("89999999999");
        $("#dateOfBirthInput").click();
        $("#uploadPicture").uploadFile(img);
        $(".react-datepicker__month-select").click();
        $(byText("March")).click();
        $(byText("13")).click();
        $("#subjectsInput").setValue("Moscow");
        $(byText("Sports")).click();
        $(byText("Reading")).click();
        $(byText("Music")).click();
        $("#currentAddress").setValue("Vetoshnyy Pereulok, 5, офис 219, Moscow, 109012");
        $(byText("Select State")).click();
        $(byText("Uttar Pradesh")).click();
        $("#city").click();
        $(byText("Lucknow")).click();
        $("#submit").click();

        $("[class=table-responsive]").shouldHave(text("Test Testov"), text("Testovich@test.ru"), text("Other"), text("8999999999"), text("13 March,2023"), text("Sports, Reading, Music"), text("img.jpg"), text("Vetoshnyy Pereulok, 5, офис 219, Moscow, 109012"), text("Uttar Pradesh Lucknow"));


    }
}


