/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;


public class Consumo {
   private int codigoConsumo;
   private int fechaConsumo;
    public Consumo(int codigoConsumo,int fechaConsumo){
		
		super();
		this.codigoConsumo=codigoConsumo;
		this.fechaConsumo=codigoConsumo;

		
    }

	public int getCodigoConsumo() {
		return codigoConsumo;
	}

	public void setCodigoCosumo(int codigoConsumo) {
		this.codigoConsumo = codigoConsumo;
	}

	public int getFechaConsumo() {
		return fechaConsumo;
	}

	public void setFechaConsumo(int fechaConsumo) {
		this.fechaConsumo= fechaConsumo;
	}
}

