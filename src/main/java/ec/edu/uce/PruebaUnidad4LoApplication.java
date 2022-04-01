package ec.edu.uce;

import java.time.LocalDateTime;
import java.time.Month;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.service.IPacienteService;

@SpringBootApplication
public class PruebaUnidad4LoApplication implements CommandLineRunner {
	
	@Autowired
	private IPacienteService pacienteService;
	private static Logger LOG = Logger.getLogger(PruebaUnidad4LoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PruebaUnidad4LoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		
//		Paciente pac1 = new Paciente();
//		pac1.setCedula("1794986259");
//		pac1.setNombre("ariel");
//		pac1.setApellido("cabrera");
//		LocalDateTime miFechaNacimientop1 = LocalDateTime.of(1995, Month.MARCH,4,12,30);
//		pac1.setFechaNacimiento(miFechaNacimientop1);
//		pac1.setCodigoIESS("17884a");
//		pac1.setEstatura("1.69m");
//		pac1.setPeso("70kg");
//		pac1.setEdad("21");
//		
//		this.pacienteService.guardarPaciente(pac1);
//		
//		Paciente pac2 = new Paciente();
//		pac2.setCedula("1841615061");
//		pac2.setNombre("karla");
//		pac2.setApellido("icaza");
//		LocalDateTime miFechaNacimiento2 = LocalDateTime.of(1995, Month.APRIL,30,12,30);
//		pac2.setFechaNacimiento(miFechaNacimiento2);
//		pac2.setCodigoIESS("184961q");
//		pac2.setEstatura("1.70m");
//		pac2.setPeso("72kg");
//		pac2.setEdad("24");
//		
//		this.pacienteService.guardarPaciente(pac2);
	}
	


}
