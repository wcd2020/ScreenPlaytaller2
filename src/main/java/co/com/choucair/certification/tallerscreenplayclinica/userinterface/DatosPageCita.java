package co.com.choucair.certification.tallerscreenplayclinica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosPageCita extends PageObject {

    public static final Target OPCION_AGREGARDOCTOR = Target.the("Clic en la opcion agengar cita")
            .located(By.xpath("//*[@id='page-wrapper']/div/div[2]/div/div/div/div/div[1]/div/a[6]"));
    public static final Target SELECCIONAR_FECHA = Target.the("Seleccionar fecha")
            .located(By.id("datepicker"));
    public static final Target AGREGAR_NUMDOCUMENTOPACIENTE = Target.the("Agregar numero de documento de paciente")
            .located(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/div[2]/input"));
    public static final Target AGREGAR_NUMDOCUMENTODOCTOR = Target.the("Agregar numero de documento de doctor")
            .located(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/div[3]/input"));
    public static final Target AGREGAR_OBSERVACIONES = Target.the("Agregar las observaciones de la cita")
            .located(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/div[4]/textarea"));
    public static final Target BUTTON_GUARDAR = Target.the("Agregar las observaciones de la cita")
            .located(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/a"));
}
