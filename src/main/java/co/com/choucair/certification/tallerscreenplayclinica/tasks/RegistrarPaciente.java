package co.com.choucair.certification.tallerscreenplayclinica.tasks;

import co.com.choucair.certification.tallerscreenplayclinica.model.DatosDoctorPaciente;
import co.com.choucair.certification.tallerscreenplayclinica.userinterface.DatosPagePaciente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class RegistrarPaciente implements Task {
    private List<DatosDoctorPaciente> datospaciente;

    public RegistrarPaciente(List<DatosDoctorPaciente> datospaciente) {
        this.datospaciente = datospaciente;
    }

    public static RegistrarPaciente  onThePage(List<DatosDoctorPaciente> datospaciente) {
        return Tasks.instrumented(RegistrarPaciente.class, datospaciente);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DatosPagePaciente.OPCION_AGREGARPACIENTE),
                Enter.theValue(datospaciente.get(0).getNombres()).into(DatosPagePaciente.AGREGAR_NOMBRES),
                Enter.theValue(datospaciente.get(0).getApellidos()).into(DatosPagePaciente.AGREGAR_APELLIDOS),
                Enter.theValue(datospaciente.get(0).getTelefono()).into(DatosPagePaciente.AGREGAR_TELEFONO),
                Click.on(DatosPagePaciente.OPCION_TIPODOCUMENTO),
                Enter.theValue(datospaciente.get(0).getNumerodocumento()).into(DatosPagePaciente.AGREGAR_NUMDOCUMENTO),
                Click.on(DatosPagePaciente.AGREGAR_SALUDPREPAGADA),
                Click.on(DatosPagePaciente.BUTTON_GUARDAR)
        );
    }
}
