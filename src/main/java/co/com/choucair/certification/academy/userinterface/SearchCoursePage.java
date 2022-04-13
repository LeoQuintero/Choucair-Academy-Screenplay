package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target SELECT_COURSE = Target.the("da click en sección universidad Choucair")
            .located(By.xpath("//*[@id='universidad']/div[1]/a/h4"));
}
