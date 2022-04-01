package ec.edu.uce.repository;

import ec.edu.uce.modelo.CitaMedica;


public interface ICitaMedicaRepo {
	void insertarCitaMedica(CitaMedica citaMedica);
	CitaMedica buscarPorNumero(String numero);
	void actualizarCitaMedica(CitaMedica citaMedica);
	CitaMedica buscarPorId(Integer id);


}
