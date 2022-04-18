package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Selecciona universidad Choucair")
            .located(By.xpath("//*[@id='universidad']/div[1]/a/h4"));
    public static final Target INPUT_COURSE = Target.the("Buscar el curso")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Dar click para buscar el curso")
            .located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Escribir el nombre del curso")
            .located(By.xpath("//h4//a[contains(text(),'Metodología Bancolombia')]"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso")
            .located(By.xpath("//h1[contains(text(), 'Metodología Bancolombia')]"));

}
