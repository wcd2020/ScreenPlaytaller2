package co.com.choucair.certification.tallerscreenplayclinica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidationLabel extends PageObject {

    public static final Target NAME_LABELDOCTOR = Target.the("Extrae el nombre del label")
            .located(By.xpath("//*[@id='page-wrapper']//div/div/p"));

}
