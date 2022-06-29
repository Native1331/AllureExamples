import io.qameta.allure.AllureId;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class SearchPageInGitHub {
    @Test
    @AllureId("10758")
    @DisplayName("Поиск страницы в  GitHub")
    @Owner("allure8")
    public void searchPage() {
        step("Откройте страницу  Github");
        step("Ввести в поле поиска selenide и нажать Enter");
        step("Перейти в раздел Wiki проекта");
        step("Убедится, что в списке страниц (Pages) есть страница SoftAssertions");
        step("Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5");
    }
}
