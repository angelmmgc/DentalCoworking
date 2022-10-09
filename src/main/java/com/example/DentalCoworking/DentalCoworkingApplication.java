package com.example.DentalCoworking;

import com.example.DentalCoworking.entities.Cabinete;
import com.example.DentalCoworking.entities.Clinic;
import com.example.DentalCoworking.repository.CabinetRepository;
import com.example.DentalCoworking.repository.ClinicRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DentalCoworkingApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DentalCoworkingApplication.class, args);

		//GABINETE
		CabinetRepository cabineteRepository = context.getBean(CabinetRepository.class);

		Cabinete cabinetes = new Cabinete(null,"cirugia",false);

		cabineteRepository.save(cabinetes);

		//CLINICA
		ClinicRepository clinicRepository = context.getBean(ClinicRepository.class);
		Clinic clinica = new Clinic(null,"vital dent","952232323","vitaldent@gmail.com",3);
		//añadimos a la clinica los gabinetes
		clinica.getCabinete().add(cabinetes);
		//insertamos en la base de datos clinica
		clinicRepository.save(clinica);



	}

}
