package org.iesalandalus.programacion.casi.modelo.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Producto {
	
	private LocalDate fechaCorte;
	private boolean envasado;
	protected double costeProduccion;
	
	DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	
	public Producto(LocalDate fechaCorte,boolean envasado) {
		setFechaCorte(fechaCorte);
		setEnvasado(envasado);
	}
	
	public Producto(Producto producto) {
		if (producto==null) {
			throw new NullPointerException("ERROR: NO se puede copiar un producto nulo");
			}else {
				setFechaCorte(producto.getFechaCorte());
				setEnvasado(producto.isEnvasado());
			}
	}

	protected LocalDate getFechaCorte() {
		return fechaCorte;
	}

	private void setFechaCorte(LocalDate fechaCorte) {
		if (fechaCorte==null) {
			throw new NullPointerException("ERROR: La fecha de corte no puede ser nula.");}
		
		if (fechaCorte.isAfter(LocalDate.now()) || fechaCorte.isBefore(LocalDate.now().minusDays(20))) 
			{throw new IllegalArgumentException("ERROR: La fecha de corte excede el plazo");
		}else {this.fechaCorte = fechaCorte;} 
	}

	protected boolean isEnvasado() {
		return envasado;
	}

	private void setEnvasado(boolean envasado) {
		this.envasado = envasado;
	}

	public abstract void setCosteProduccion();
	
	private double getCosteProduccion() {
		return costeProduccion;
	}

	public void setCosteProduccion(double costeProduccion) {
		this.costeProduccion = costeProduccion;
	}

	@Override
	public String toString() {
		return "Producto [fechaCorte=" + fechaCorte + ", envasado=" + envasado + ", costeProduccion=" + costeProduccion
				+ "]";
	}
	
	

}
