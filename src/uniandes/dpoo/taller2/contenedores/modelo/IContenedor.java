package uniandes.dpoo.taller2.contenedores.modelo;
import java.util.ArrayList;
import uniandes.dpoo.taller2.productos.modelo.producto;

public interface IContenedor 
{
	public ArrayList<String>addCargo(producto product);
	public String darCaracteristicas();
	public String darPropietario();
	public String darIdentificador();
	public Integer darCantidadProd();
	public Double darCapacidadVol();
	public Double darCapacidadPeso();
	public boolean darExclusividad();
	public String generarManifiesto();
	
}
