package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import ec.edu.uce.modelo.CitaMedica;





public interface ICitaMedicaService {

	void insertarCitaMedica(String numero, LocalDateTime fechaCita,BigDecimal valorCita, String lugarCita, String cedulaDoctor, String cedulaPaciente );
	void actualizarCita(String numero, String diagnostico, String receta, LocalDateTime fechaProxima);
	CitaMedica buscarPorNumero(String numero);
	CitaMedica buscarPorId(Integer id);

}
