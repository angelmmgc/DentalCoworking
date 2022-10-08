package com.example.DentalCoworking;

import com.example.DentalCoworking.entities.Clinic;
import com.example.DentalCoworking.repository.ClinicRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DentalCoworkingApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DentalCoworkingApplication.class, args);
		ClinicRepository clinicRepository = context.getBean(ClinicRepository.class);

		Clinic clinica1 = new Clinic(null,"vital dent","952232323","vitaldent@gmail.com",3);

		clinicRepository.save(clinica1);
	}

}
