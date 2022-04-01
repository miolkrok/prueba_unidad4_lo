package ec.edu.uce.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import ec.edu.uce.modelo.Doctor;

@Transactional
@Rollback(true)
@SpringBootTest
class DoctorServiceImplTest {
	
	@Autowired
	private IDoctorService doctorService;

	@Test
	void testGuardarDoctor() {
		Doctor doc1 = new Doctor();
		doc1.setCedula("178496944");
		doc1.setNombre("luis");
		doc1.setApellido("ortiz");
		LocalDateTime miFechaNacimiento = LocalDateTime.of(1989, Month.AUGUST,8,12,45);
		doc1.setFechaNacimiento(miFechaNacimiento);
		doc1.setNumeroConsultorio("8b");
		doc1.setCodigoSenescyt("1484-1894-2015");
		doc1.setSueldo(new BigDecimal(2500));
		
		this.doctorService.guardarDoctor(doc1);

		assertEquals("luis", this.doctorService.buscarDoctorPorApellido("ortiz").getNombre());
	}
	@Test
	void testGuardarDoctorDos() {
		
		
		Doctor doc2 = new Doctor();
		doc2.setCedula("1704115102");
		doc2.setNombre("byron");
		doc2.setApellido("quiroz");
		LocalDateTime miFechaNacimientoDOC = LocalDateTime.of(1979, Month.SEPTEMBER,16,12,30);
		doc2.setFechaNacimiento(miFechaNacimientoDOC);
		doc2.setNumeroConsultorio("7a");
		doc2.setCodigoSenescyt("8785-1894-2010");
		doc2.setSueldo(new BigDecimal(2500));
		
		this.doctorService.guardarDoctor(doc2);
		assertEquals("quiroz", this.doctorService.buscarDoctorPorCedula("1704115102").getApellido());
	}


}
