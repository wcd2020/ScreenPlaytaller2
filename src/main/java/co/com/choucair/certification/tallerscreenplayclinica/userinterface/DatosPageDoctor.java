package co.com.choucair.certification.tallerscreenplayclinica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosPageDoctor extends PageObject {

        public static final Target OPCION_AGREGARDOCTOR = Target.the("Clic en la opcion agregar doctor")
                .located(By.xpath("//*[@id='page-wrapper']/div/div[2]/div/div/div/div/div[1]/div/a[1]"));
        public static final Target AGREGAR_NOMBRES = Target.the("Agregar los nombres del doctor")
                .located(By.id("name"));
        public static final Target AGREGAR_APELLIDOS = Target.the("Agregar los apellidos del doctor")
                .located(By.id("last_name"));;
        public static final Target AGREGAR_TELEFONO = Target.the("Agregar el telefono del doctor")
                .located(By.id("telephone"));
        public static final Target OPCION_TIPODOCUMENTO = Target.the("Clic en check de tipo de documento del doctor")
                .located(By.xpath("//*[@id='identification_type']"));
       /* public static final Target SELECCIONAR_TIPODOCUMENTO = Target.the("Seleccionar el tipo de documento del doctor")
                .located(By.id("identification_type"));*/
        public static final Target AGREGAR_NUMDOCUMENTO = Target.the("Agregar el numero de documento del doctor")
                .located(By.id("identification"));
        public static final Target  BUTTON_GUARDAR = Target.the("Clic en el boton guardar")
                .located(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/a"));

}
