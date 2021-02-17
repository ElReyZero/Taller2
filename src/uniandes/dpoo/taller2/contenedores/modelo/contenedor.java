package uniandes.dpoo.taller2.contenedores.modelo;

import java.util.ArrayList;

import uniandes.dpoo.taller2.productos.modelo.producto;

public class contenedor implements IContenedor 
{
    //*Atributos//
    protected String propietario;
    protected String identificador;
    protected Integer cantidadProd;
    protected Double capacidadVol;
    protected Double capacidadPeso;
    protected boolean exclusividad;
    protected Double pesoCarga;

    //*Constructor//

    public contenedor(String pPropietario, String pIdentificador, Integer pCantidadProd, Double pCapacidadVol, Double pCapacidadPeso, boolean pExclusividad, Double pPesoCarga)
    {
        propietario = pPropietario;
        identificador = pIdentificador;
        cantidadProd = pCantidadProd;
        capacidadVol = pCapacidadVol;
        capacidadPeso = pCapacidadPeso;
        exclusividad = pExclusividad;
        pesoCarga = pPesoCarga;
    }

    //*Métodos//

    public ArrayList<String> addCargo(producto product) 
    {
        // TODO Auto-generated method stub
        return null;
    }

    
    public String darCaracteristicas() 
    {
        String owner = propietario.toString();
		String id = identificador.toString();
		String prod = cantidadProd.toString();
		String volumen = capacidadVol.toString();
        String peso = capacidadPeso.toString();
        String carga = pesoCarga.toString();
		String resultado = ""+owner+" "+id+" "+prod+" "+volumen+" "+peso+" "+exclusividad+" "+carga;
        return resultado;
    }

    
    public String darPropietario() 
    {
        return propietario;
    }

    
    public String darIdentificador() 
    {
        return identificador;
    }

    
    public Integer darCantidadProd() 
    {
        return cantidadProd;
    }

    
    public Double darCapacidadVol() 
    {
        return capacidadVol;
    }

    
    public Double darCapacidadPeso() 
    {
        return capacidadPeso;
    }

    
    public boolean darExclusividad() 
    {
        return exclusividad;
    }

    public String generarManifiesto() 
    {
        // TODO Auto-generated method stub
        return null;
    }
}