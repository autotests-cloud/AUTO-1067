package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Yandex login form test")
    void generatedTest() {
        step("Open 'https://yandex.ru/'", () -> {
            step("// todo: just add selenium action");
        });

        step("click", () -> {
            step("// todo: just add selenium action");
        });

        step("set email", () -> {
            step("// todo: just add selenium action");
        });

        step("click", () -> {
            step("// todo: just add selenium action");
        });

        step("set password", () -> {
            step("// todo: just add selenium action");
        });

        step("click", () -> {
            step("// todo: just add selenium action");
        });

        step("Equals", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://yandex.ru/'", () ->
            open("https://yandex.ru/"));

        step("Page title should have text 'Яндекс'", () -> {
            String expectedTitle = "Яндекс";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://yandex.ru/'", () ->
            open("https://yandex.ru/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}