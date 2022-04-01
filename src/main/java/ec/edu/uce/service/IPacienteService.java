package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.modelo.Paciente;

public interface IPacienteService {

	void guardarPaciente(Paciente paciente);
	void actualizarPaciente(Paciente paciente);
	Paciente buscarPacientePorId(Integer id);
	void borrarPacientePorId(Integer id);
}
