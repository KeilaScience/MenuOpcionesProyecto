/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author yeser
 */
public class Usuario {
   private int codigoUsuario ;
   private String nombres ;
   private String apellidos ;
   private String dni ;
   private String telefono ;
	
	//constructor
	public  Usuario(int codigoUsuario,String dni ,String nombres ,String apellidos ,String telefono ){
	super();
	this.codigoUsuario= codigoUsuario ;
	this.nombres = nombres;
	this.apellidos=apellidos;
	this.dni=dni;
	this.telefono=telefono;
	
	}

//metodos
	public int getCodigoUsuario() {
		return codigoUsuario;
	}


	public void setCodigoSocio(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
    
}
