package org.iesalandalus.programacion.casi.modelo.dominio;

import java.time.LocalDate;

public class Cosecha {
	
	private LocalDate fechaEntrada;
	private double precioSubasta;
	private boolean subastado;
	private int kilogramos;
	private Producto producto;
	private Agricultor agricultor;
	
	
	public Cosecha (Agricultor agricultor,Producto producto,int kilogramos) {
		setAgricultor(agricultor);
		setProducto(producto);
		setKilogramos(kilogramos);
		this.fechaEntrada=null;
		this.precioSubasta=0;
		this.fechaEntrada=LocalDate.now();
	}
	
	public Cosecha (Cosecha cosecha) {
		if (cosecha==null) {
			throw new NullPointerException("ERROR: NO se puede copiar una cosecha nula");
			}else {
				setAgricultor(cosecha.getAgricultor());
				setProducto(cosecha.getProducto());
				setKilogramos(cosecha.getKilogramos());
				setKilogramos(kilogramos);
			}
	}
	
	
	public Agricultor getAgricultor() {
		return agricultor;
	}

	public void setAgricultor(Agricultor agricultor) {
		if (agricultor==null) {
			throw new NullPointerException("ERROR: NO se puede copiar un agricultor nulo");
			}else {
				this.agricultor = agricultor;
			}
		
	}
	
	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		if (producto==null) {
			throw new NullPointerException("ERROR: NO se puede copiar un agricultor nulo");
			}else {
				if (producto instanceof Pimiento) {producto=new Pimiento(LocalDate.now(),Color.VERDE);}
				if (producto instanceof Tomate) {producto=new Tomate(LocalDate.now(),false);}
				if (producto instanceof Calabacin) {producto=new Calabacin(LocalDate.now(),false,0);}
			}
	}
	
	public double getCosteProduccion() {
		double coste=0;
		return coste;
	}
	
	public double getPrecioSubasta() {
		return precioSubasta;
	}

	public void setPrecioSubasta(double precioSubasta) {
		this.precioSubasta = precioSubasta;
	}

	public int getKilogramos() {
		return kilogramos;
	}

	public void setKilogramos(int kilogramos) {
		this.kilogramos = kilogramos;
	}
	

	public boolean isSubastado() {
		return subastado;
	}

	public void setSubastado(boolean subastado) {
		this.subastado = subastado;
	}


	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(LocalDate fechaEntrada) {
		if (agricultor==null) {
			throw new NullPointerException("ERROR: NO se puede copiar un agricultor nulo");
			}else {
				this.fechaEntrada = fechaEntrada;
			}
	}






	
	
	
	

}
