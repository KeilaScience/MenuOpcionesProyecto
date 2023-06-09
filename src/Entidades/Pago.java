/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author yeser
 */
public class Pago {
    private int codigoPago;
    private int fechaPago;
    public Pago(int codigoPago,int fechaPago){
		
		super();
		this.codigoPago=codigoPago;
		this.fechaPago=codigoPago;
		
		
	}

	public int getCodigoPago() {
		return codigoPago;
	}

	public void setCodigoPago(int codigoPago) {
		this.codigoPago = codigoPago;
	}

	public int getFechaPago() {
		return fechaPago;
	}

	public void setFechapago(int fechaPago) {
		this.fechaPago = fechaPago;
	}

}
