package co.com.choucair.certification.tallerscreenplayclinica.stepdefinitions;

import co.com.choucair.certification.tallerscreenplayclinica.model.DatosCita;
import co.com.choucair.certification.tallerscreenplayclinica.model.DatosDoctorPaciente;
import co.com.choucair.certification.tallerscreenplayclinica.questions.AnswerDoctorPaciente;
import co.com.choucair.certification.tallerscreenplayclinica.tasks.OpenUp;
import co.com.choucair.certification.tallerscreenplayclinica.tasks.RegistrarCita;
import co.com.choucair.certification.tallerscreenplayclinica.tasks.RegistrarDoctor;
import co.com.choucair.certification.tallerscreenplayclinica.tasks.RegistrarPaciente;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ClinicaSiteStepDefinitions {

    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^Carlos necesita registrar un nuevo doctor en el sistema$")
    public void carlosNecesitaRegistrarUnNuevoDoctorEnElSistema() {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());
    }
    @When("^el realiza el registro del mismo en el aplicativo de Administracion de Hospitales$")
    public void elRealizaElRegistroDelMismoEnElAplicativoDeAdministracionDeHospitales(List<DatosDoctorPaciente> datosdoctor)  {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrarDoctor.onThePage(datosdoctor));
    }
    @Then("^el verifica que se presente en pantalla el mensaje (.*)$")
    public void elVerificaQueSePresenteEnPantallaElMensajeDatosGuardadosCorrectamente(String question)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerDoctorPaciente.toThe(question)));
    }
    @Given("^Carlos necesita registrar un nuevo paciente en el sistema$")
    public void carlosNecesitaRegistrarUnNuevoPacienteEnElSistema()  {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());
    }
    @When("^el realiza el registro del mismo en el aplicativo de Administracion de Hospitales paciente$")
    public void elRealizaElRegistroDelMismoEnElAplicativoDeAdministracionDeHospitalesPaciente(List<DatosDoctorPaciente> datospaciente) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrarPaciente.onThePage(datospaciente));
    }
    @Then("^el verifica que se presente en la pantalla paciente el mensaje (.*)$")
    public void elVerificaQueSePresenteEnPantallaElMensajeDatosGuardadosCorrectamentePaciente(String question)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerDoctorPaciente.toThe(question)));
    }

    @Given("^Carlos necesita asistir al medico$")
    public void carlosNecesitaAsistirAlMedico()  {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());
    }

    @When("^el realiza el agendamiento de una Cita$")
    public void elRealizaElAgendamientoDeUnaCita(List<DatosCita> datoscita)  {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrarCita.onThePage(datoscita));

    }
    @Then("^el verifica que se presente en la pantalla cita el mensaje (.*)$")
    public void elVerificaQueSePresenteEnLaPantallaCitaElMensajeDatosGuardadosCorrectamente(String question)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerDoctorPaciente.toThe(question)));
    }

}
