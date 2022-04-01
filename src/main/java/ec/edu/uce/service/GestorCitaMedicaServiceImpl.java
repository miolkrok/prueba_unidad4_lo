package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ec.edu.uce.modelo.CitaMedica;
import ec.edu.uce.modelo.Doctor;
import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.repository.ICitaMedicaRepo;
import ec.edu.uce.repository.IDoctorRepo;
import ec.edu.uce.repository.IPacienteRepo;

@Service
public class GestorCitaMedicaServiceImpl implements ICitaMedicaService {
	
	//private static final Logger LOG =  Logger.getLogger(GestorCitaMedicaServiceImpl.class);
	private static Logger LOG = Logger.getLogger(GestorCitaMedicaServiceImpl.class);

	@Autowired
	private ICitaMedicaRepo citaMedicaRepoG;
	@Autowired
	private IPacienteRepo pacienteRepoG;
	@Autowired
	private IDoctorRepo doctorRepoG;
	@Autowired
	private IPacienteService paciService;
	
	@Override
	public void insertarCitaMedica(String numero, LocalDateTime fechaCita,BigDecimal valorCita, String lugarCita, String cedulaDoctor, String cedulaPaciente  ) {
		// TODO Auto-generated method stub
		CitaMedica citaMedica = new CitaMedica();
		citaMedica.setNumero(numero);
		citaMedica.setFechaCita(fechaCita);
		citaMedica.setValorCita(valorCita.multiply(new BigDecimal(0.12).add(valorCita)));
		citaMedica.setLugarCita(lugarCita);
		citaMedica.setDoctor(this.doctorRepoG.buscarDoctorPorCedula(cedulaDoctor));
		citaMedica.setPaciente(this.pacienteRepoG.buscarPacientePorCedula(cedulaPaciente));
		this.citaMedicaRepoG.insertarCitaMedica(citaMedica);
		
		
	}
	@Override
	public void actualizarCita(String numero, String diagnostico, String receta, LocalDateTime fechaProxima) {
		CitaMedica c1=this.citaMedicaRepoG.buscarPorNumero(numero);
		c1.setDiagnostico(diagnostico);
		c1.setReceta(receta);
		c1.setFechaCita(fechaProxima);
		this.citaMedicaRepoG.actualizarCitaMedica(c1);
	}
	@Override
	public CitaMedica buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.citaMedicaRepoG.buscarPorNumero(numero);
	}
	@Override
	public CitaMedica buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.citaMedicaRepoG.buscarPorId(id);
	}


}
