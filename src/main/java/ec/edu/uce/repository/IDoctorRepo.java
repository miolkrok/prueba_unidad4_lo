package ec.edu.uce.repository;

import ec.edu.uce.modelo.Doctor;

public interface IDoctorRepo {
	void insertarDoctor(Doctor doctor);
	void actualizarDoctor(Doctor doctor);
	Doctor buscarDoctorPorId(Integer id);
	void borrarDoctorPorId(Integer id);
	Doctor buscarDoctorPorApellido(String apellido);
	Doctor buscarDoctorPorCedula(String cedula);

}
