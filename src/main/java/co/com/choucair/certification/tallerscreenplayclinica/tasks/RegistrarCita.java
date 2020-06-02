package co.com.choucair.certification.tallerscreenplayclinica.tasks;


import co.com.choucair.certification.tallerscreenplayclinica.model.DatosCita;
import co.com.choucair.certification.tallerscreenplayclinica.userinterface.DatosPageCita;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class RegistrarCita implements Task {
    private List<DatosCita> datoscita;

    public RegistrarCita(List<DatosCita> datoscita) {
        this.datoscita = datoscita;
    }
    public static RegistrarCita onThePage(List<DatosCita> datoscita) {
        return Tasks.instrumented(RegistrarCita.class,datoscita);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DatosPageCita.OPCION_AGREGARDOCTOR),
                Enter.theValue(datoscita.get(0).getFechadecita()).into(DatosPageCita.SELECCIONAR_FECHA),
                Enter.theValue(datoscita.get(0).getNumerodocumentopaciente()).into(DatosPageCita.AGREGAR_NUMDOCUMENTOPACIENTE),
                Enter.theValue(datoscita.get(0).getNumerodocumentodoctor()).into(DatosPageCita.AGREGAR_NUMDOCUMENTODOCTOR),
                Enter.theValue(datoscita.get(0).getObservaciones()).into(DatosPageCita.AGREGAR_OBSERVACIONES),
                Click.on(DatosPageCita.BUTTON_GUARDAR)

        );
    }
}
