package com.sinensia.gestionmedica.backend.business.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Lectura implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	
	@JsonIgnore
	private Usuario usuario;
	
	private Date fechaCreacion;
	private Double longitud;
	private Double latitud;
	private Double peso;
	private Integer presionMin;
	private Integer presionMax;
	private Integer pasos;

	public Lectura() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Integer getPresionMin() {
		return presionMin;
	}

	public void setPresionMin(Integer presionMin) {
		this.presionMin = presionMin;
	}

	public Integer getPresionMax() {
		return presionMax;
	}

	public void setPresionMax(Integer presionMax) {
		this.presionMax = presionMax;
	}

	public Integer getPasos() {
		return pasos;
	}

	public void setPasos(Integer pasos) {
		this.pasos = pasos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lectura other = (Lectura) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lectura [id=");
		builder.append(id);
		builder.append(", usuario=");
		builder.append(usuario);
		builder.append(", fechaCreacion=");
		builder.append(fechaCreacion);
		builder.append(", longitud=");
		builder.append(longitud);
		builder.append(", latitud=");
		builder.append(latitud);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", presionMin=");
		builder.append(presionMin);
		builder.append(", presionMax=");
		builder.append(presionMax);
		builder.append(", pasos=");
		builder.append(pasos);
		builder.append("]");
		return builder.toString();
	}

}
