import io.qameta.allure.AllureId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class SearchPageInWikipedia {
    @Test
    @DisplayName("Поиск страницы в Wikipedia")
    @Tag("test")
    public  void testGithubAuth() {
        step("Откройте страницу  Wikipedia");
        step("Нажать авторизоваться");
        step("Ввести логин");
        step("Ввести пароль");
        step("Ввести в поле поиска selenide и нажать Enter");
        step("Убедится, что в списке страниц (Pages) есть страница selenide");
            }
}
