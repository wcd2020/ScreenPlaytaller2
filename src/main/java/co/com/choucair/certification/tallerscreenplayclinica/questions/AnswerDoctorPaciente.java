package co.com.choucair.certification.tallerscreenplayclinica.questions;

import co.com.choucair.certification.tallerscreenplayclinica.userinterface.ValidationLabel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerDoctorPaciente implements Question<Boolean> {

    private String question;

    private AnswerDoctorPaciente(String question) {

        this.question = question;
    }

    public static AnswerDoctorPaciente toThe(String question) {
        return new AnswerDoctorPaciente(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameLabel= Text.of(ValidationLabel.NAME_LABELDOCTOR).viewedBy(actor).asString();
        if (question.equals(nameLabel)){
            result = true;
        }
        else
        {
            result = false;
        }
        return result;
    }
}
