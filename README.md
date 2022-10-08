# DentalCoworking

## Idea de negocio

1. Aplicación web en la que se ofertan clínicas dentales que dispongan
   de gabinetes para ser alquilados a dentistas, higienista para ejercer su labor o para docencia.
2. Los gabinetes podrán ser de odontología-general o de cirugía y "solo podrán ser arrendados los no utilizados por la clínica".
3. Las clínicas subirán la disponibilidad de los gabinetes con una antelación suficiente (mínimo dos dias). 
4. El usuario (dentista, higienista) podrá reservar un solo gabinete por jornada o periodos de tiempo. 
5. Si la reserva es por periodo de tiempo quedará libre para ser alquilado. 
6. Además, se podrá facilitar al usuario una agenda para sus citas en caso de que el alquiler sea para ejercer su profesión. 
7. La propia clínica podrá facilitar pacientes al usuario llegando a un acuerdo en el porcentaje que se podría llevar cada parte.

SE QUIERE INSERTAR LOGIN Y AUTENTICACIÓN.

## Condiciones

El arrendatario deberá ser autónomo.
Ser odontólogo/estomatólogo colegiado en España.
Tener un seguro de responsabilidad profesional vigente.
Tener permiso de trabajo para ejercer la odontología en caso de ser extranjero.

## Arquitectura
   
      API-REST

# CAPAS

   ## Entidades
 
   1. Clínicas (guardamos las clínicas que poseen gabinetes disponibles.Atributos -> id,name,phone,email,cabinetsAvailable).
   2. Gabinetes (Atributos -> id,cabinetType (cirugía e implantes, odontología-general), condition(si está libre o no).
   3. Usuarios(dentista o higienista. Atributos -> id,número de colegiado,nombre,apellidos,email,teléfono).
   4. Reserva (para el usuario,Atributos -> idReserva, fecha, hora de inicio,hora de fin, estado de la reserva(jornada completa o por horas)).
   5. Pacientes (Atributos -> nif,nombre,apellidos,email,teléfono,dirección).
   6. Cita (para los posibles pacientes).


   ## Repositorio

   ## Controller
 
   ## Service

## Tecnologias

   JAVA, SPRINGBOOT (Spring Data JPA,Spring Web,PostgreSQL Driver,Spring Security)

