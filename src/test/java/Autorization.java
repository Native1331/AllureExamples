public class Autorization {

        @Test
        void shouldFindSoftAssertionsPage() {
            //Откройте страницу  Github
            open("https://github.com");
            //Ввести в поле поиска selenide и нажать Enter
            $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
            $$(".repo-list").first().$("a").click();
            //Перейти в раздел Wiki проекта
            $("#repository-container-header").$("#wiki-tab").pressEnter();
            //Убедится, что в списке страниц (Pages) есть страница SoftAssertions
            $(".wiki-more-pages-link").$("button").click();
            $(".wiki-rightbar").shouldHave(text("SoftAssertions"));
            //Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5**/
            $(".markdown-body").$(byText("Soft assertions")).click();
            $$(".markdown-body h4").find(text("Junit5")).shouldBe(visible);


        }

}
