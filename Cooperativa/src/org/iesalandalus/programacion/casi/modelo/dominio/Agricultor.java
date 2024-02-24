package org.iesalandalus.programacion.casi.modelo.dominio;

import java.util.Objects;

public class Agricultor {
	
	private static final String PATRON_TELEFONO="[0-9]{9}";
	private static final String PATRON_DNI="[0-9a-zA-Z]{1}[0-9]{7}[0-9a-zA-Z]{1}";
	
	//Los modelos de NIE que he visto tienen una letra y despues numeros, al contrario
	// que el NIF. Por ejemplo:X2325237
	
	private String nombre;
	private String dni;
	private String telefono;
	
	public Agricultor(String nombre,String dni, String telefono) {
		setNombre(nombre);
		setDni(dni);
		setTelefono(telefono);
	}
	
	public Agricultor(String dni) {
		setDni(dni);
		
	}
	
	public Agricultor(Agricultor agricultor) {
		
		if (agricultor==null) {
			throw new NullPointerException("ERROR: NO se puede copiar un agricultor nulo");
			}else {
				setNombre(agricultor.getNombre());
				setDni(agricultor.getDni());
				setTelefono(agricultor.getTelefono());
			}
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre == null) { 
			throw new NullPointerException("ERROR: El nombre de un agricultor no puede ser nulo.");}
		
		if (nombre.trim().equals("")) {
			throw new IllegalArgumentException("ERROR: El nombre de un agricultor no puede estar vac�o.");}
		
		this.nombre = nombre;
		}	
	

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if (dni== null) {
			throw new NullPointerException("ERROR: El dni de un agricultor no puede ser nulo.");}
		else if (!dni.trim().matches(PATRON_DNI)) {
			throw new IllegalArgumentException("ERROR: El dni del agricultor no tiene un formato valido.");}
		else {
			this.dni = dni;} 
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		if (telefono == null) { 
			throw new NullPointerException("ERROR: El telefono de un agricultor no puede ser nulo.");}
		else if (telefono.trim().equals("")) { 
			throw new IllegalArgumentException("ERROR: El telefono del agricultor no tiene un formato valido.");}
		else if (!telefono.matches(PATRON_TELEFONO)) {
			throw new IllegalArgumentException("ERROR: El telefono del agricultor no tiene un formato valido.");}
		else {this.telefono = telefono;}
	
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre, telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agricultor other = (Agricultor) obj;
		return Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(telefono, other.telefono);
	}

	@Override
	public String toString() {
		return "Agricultor [nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono + "]";
	}
	
	
	
	

}
