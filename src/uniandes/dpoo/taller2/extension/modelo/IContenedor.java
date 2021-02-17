package uniandes.dpoo.taller2.extension.modelo;

public interface IContenedor 
{
	public boolean addCargo(cargamento Cargo);
	public String darCaracteristicas();
	public Double darCapacidadVol();
	public Double darCapacidadPeso();
	public boolean darExclusividad();
	public String generarManifiesto();
	public void retirarCargamento(String identificador);
	
}
