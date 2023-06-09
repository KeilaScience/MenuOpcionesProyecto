/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

public class Ingreso {
  private  int codigoIngreso,codigoUsuario;
  private int fechaIngreso, horaIngreso ; 
  private int numeroInvitados;
  private double  costoIngreso ;
	int estado;
	
	public Ingreso(int codigoIngreso, int codigoUsuario, int fechaIngreso, int horaIngreso,
			int numeroInvitados, double costoIngreso, int estado) {
		super();
		this.codigoIngreso = codigoIngreso;
		this.codigoUsuario = codigoUsuario;
		this.fechaIngreso = fechaIngreso;
		this.horaIngreso = horaIngreso;
		this.numeroInvitados = numeroInvitados;
		this.costoIngreso = costoIngreso;
		this.estado = estado;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getNumeroInvitados() {
		return numeroInvitados;
	}

	public void setNumeroInvitados(int numeroInvitados) {
		this.numeroInvitados = numeroInvitados;
	}

	public int getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public int getCodigoIngreso() {
		return codigoIngreso;
	}

	public void setCodigoIngreso(int codigoIngreso) {
		this.codigoIngreso = codigoIngreso;
	}

	public int getHoraIngreso() {
		return horaIngreso;
	}

	public void setHoraIngreso(int horaIngreso) {
		this.horaIngreso = horaIngreso;
	}

	public int getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(int fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public double getCostoIngreso() {
		return costoIngreso;
	}

	public void setCostoIngreso(double costoIngreso) {
		this.costoIngreso = costoIngreso;
	}
	
    
}
