package co.com.choucair.certification.tallerscreenplayclinica.tasks;


import co.com.choucair.certification.tallerscreenplayclinica.model.DatosDoctorPaciente;
import co.com.choucair.certification.tallerscreenplayclinica.userinterface.DatosPageDoctor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;


public class RegistrarDoctor implements Task {
    private List<DatosDoctorPaciente> datosdoctor;

    public RegistrarDoctor(List<DatosDoctorPaciente> datosdoctor) {
        this.datosdoctor =datosdoctor;
    }
    public static RegistrarDoctor onThePage(List<DatosDoctorPaciente> datosdoctor) {
        return Tasks.instrumented(RegistrarDoctor.class,datosdoctor);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DatosPageDoctor.OPCION_AGREGARDOCTOR),
                Enter.theValue(datosdoctor.get(0).getNombres()).into(DatosPageDoctor.AGREGAR_NOMBRES),
                Enter.theValue(datosdoctor.get(0).getApellidos()).into(DatosPageDoctor.AGREGAR_APELLIDOS),
                Enter.theValue(datosdoctor.get(0).getTelefono()).into(DatosPageDoctor.AGREGAR_TELEFONO),
                Click.on(DatosPageDoctor.OPCION_TIPODOCUMENTO),
               /* SeleccionarTipoDocumento.laLista(DatosPage.SELECCIONAR_TIPODOCUMENTO, datosdoctor.get(0).getTipoidentifacion()),

                */
                Enter.theValue(datosdoctor.get(0).getNumerodocumento()).into(DatosPageDoctor.AGREGAR_NUMDOCUMENTO),
                Click.on(DatosPageDoctor.BUTTON_GUARDAR)
        );
    }
}
