#Autor: willian concepcion
@stories
Feature: Automatización de solicitud de cita médica
  El paciente, Quiere realizar la solicitud de una cita médica A través del sistema de Administración de Hospitales

  @scenario1
  Scenario: Realizar el Registro de un Doctor
    Given Carlos necesita registrar un nuevo doctor en el sistema
    When el realiza el registro del mismo en el aplicativo de Administracion de Hospitales
      |nombres|apellidos         |telefono  |tipoidentifacion     |numerodocumento|
      |Delfin |Concepcion Lescano|1234567890|Cedula de ciudadania | 222-222-444   |
    Then el verifica que se presente en pantalla el mensaje Datos guardados correctamente.

  @scenario2
  Scenario: Realizar el Registro de un Paciente
    Given Carlos necesita registrar un nuevo paciente en el sistema
    When el realiza el registro del mismo en el aplicativo de Administracion de Hospitales paciente
      |nombres |apellidos         |telefono  |tipoidentifacion     |numerodocumento|
      |willian |Concepcion Lescano|1234567890|Cedula de ciudadania | 333-333-444   |
    Then el verifica que se presente en la pantalla paciente el mensaje Datos guardados correctamente.

  @scenario3
  Scenario: Realizar el Agendamiento de una Cita
    Given Carlos necesita asistir al medico
    When el realiza el agendamiento de una Cita
      |fechadecita |numerodocumentopaciente|numerodocumentodoctor|observaciones|
      |06/04/2020  | 333-333-444            | 222-222-444        |doctor delfin|
    Then el verifica que se presente en la pantalla cita el mensaje Datos guardados correctamente.