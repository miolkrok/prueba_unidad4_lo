package ec.edu.uce.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CitaMedicaTO {
	
	private String numero;
	private LocalDateTime fechaCita;
	private BigDecimal valorCita;
	private String lugarCita;
	private String cedulaDoctor;
	private String cedulaPaciente;
	
	public CitaMedicaTO() {
		
	}
	

	public CitaMedicaTO( String numero, LocalDateTime fechaCita, BigDecimal valorCita, String lugarCita, String cedulaDoctor, String cedulaPaciente) {
		super();
		this.numero = numero;
		this.fechaCita = fechaCita;
		this.valorCita = valorCita;
		this.lugarCita = lugarCita;
		this.cedulaDoctor = cedulaDoctor;
		this.cedulaPaciente = cedulaPaciente;
		
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public LocalDateTime getFechaCita() {
		return fechaCita;
	}


	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}


	public BigDecimal getValorCita() {
		return valorCita;
	}


	public void setValorCita(BigDecimal valorCita) {
		this.valorCita = valorCita;
	}


	public String getLugarCita() {
		return lugarCita;
	}


	public void setLugarCita(String lugarCita) {
		this.lugarCita = lugarCita;
	}


	public String getCedulaDoctor() {
		return cedulaDoctor;
	}


	public void setCedulaDoctor(String cedulaDoctor) {
		this.cedulaDoctor = cedulaDoctor;
	}


	public String getCedulaPaciente() {
		return cedulaPaciente;
	}


	public void setCedulaPaciente(String cedulaPaciente) {
		this.cedulaPaciente = cedulaPaciente;
	}


	@Override
	public String toString() {
		return "CitaMedicaTO [numero=" + numero + ", fechaCita=" + fechaCita + ", valorCita=" + valorCita
				+ ", lugarCita=" + lugarCita + ", cedulaDoctor=" + cedulaDoctor + ", cedulaPaciente=" + cedulaPaciente
				+ "]";
	}








}
