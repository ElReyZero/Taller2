package uniandes.dpoo.taller2.productos.modelo;

import java.util.ArrayList;

public class producto 
{
	
	//* Atributos//
	protected String nombre;
	protected Double peso;
	protected Double volumen;
	protected boolean perecedero;
	protected Double maxTemp;
	
	//*Constructor//
	
	public producto(String pNombre, Double pPeso, Double pVolumen, boolean pPerecedero, Double pMaxTemp)
	{
		nombre = pNombre;
		peso = pPeso;
		volumen = pVolumen;
		perecedero = true;
		maxTemp = 50.0;
	}
	
	
	//*Métodos//
	
	public Boolean compararProd(producto pProducto1, producto pProducto2)
	{
		if(pProducto1.equals(pProducto2))
		return true;
		else
		return false;
	}

	public ArrayList<String> darCaracteristicas()
	{
		ArrayList<String> caracteristicas = new ArrayList<String>();
		String name = nombre.toString();
		String weight = peso.toString();
		String vol = volumen.toString();
		if (perecedero)
		caracteristicas.add("true");
		else
		caracteristicas.add("false");
		String temp = maxTemp.toString();
		caracteristicas.add(name);
		caracteristicas.add(weight);
		caracteristicas.add(vol);
		caracteristicas.add(temp);
		if (perecedero)
		caracteristicas.add("true");
		else
		caracteristicas.add("false");
		return caracteristicas;

	}

	public String darNombre()
	{
		return nombre;
	}

	public Double darPeso()
	{
		return peso;
	}

	public Double darVolumen()
	{
		return volumen;
	}

	public boolean darTipoPerecedero()
	{
		return perecedero;
	}

	public Double darTempMax()
	{
		return maxTemp;
	}
}
