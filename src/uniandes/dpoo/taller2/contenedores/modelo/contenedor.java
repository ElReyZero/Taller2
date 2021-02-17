package uniandes.dpoo.taller2.contenedores.modelo;

import java.util.Map;
import java.util.TreeMap;

public class contenedor implements IContenedor 
{
    //*Atributos//
    protected Double capacidadVol;
    protected Double capacidadPeso;
    protected boolean exclusividad;
    protected Double pesoCarga;
    protected Double volumenOcupado;
    protected boolean tienePerecedero;
    protected boolean tieneToxico;
    protected boolean necesitaRefrigeracion;
    protected Double maxTemp;
    protected Map<String,cargamento> DictCarga;

    //*Constructor//

    public contenedor(Double pCapacidadVol, Double pCapacidadPeso, boolean pExclusividad)
    {
        capacidadVol = pCapacidadVol;
        capacidadPeso = pCapacidadPeso;
        exclusividad = pExclusividad;
        pesoCarga = 0.0;
        volumenOcupado = 0.0;
        tienePerecedero = false;
        tieneToxico = false;
        necesitaRefrigeracion = false;
        maxTemp = null;
        DictCarga = new TreeMap<>();          
        }

    //*Métodos//

    public boolean addCargo(cargamento Cargo) 
    {
        Double pesoTotal = this.pesoCarga + Cargo.darPesoCarga();
        Double volumenTotal = this.volumenOcupado + Cargo.darVolumenCarga();
        if(this.maxTemp == null)
        maxTemp = Cargo.darProducto().darTempMax();

        if (pesoTotal > this.capacidadPeso)
        {
            return false;
        }
        else if (volumenTotal > this.capacidadVol)
        {
            return false;
        }
        else if (this.tienePerecedero == true && Cargo.darToxicidadCarga()  == true)
        {
            return false;
        }
        else if (this.tienePerecedero == false && Cargo.darProducto().darTempMax() < 0.0)
        {
            return false;
        }
        else if (this.maxTemp<Cargo.darProducto().darTempMax())
        {
            return false;
        }
        else
        {            
            if (Cargo.darProducto().darTipoPerecedero())
            {
                tienePerecedero = true;
            }
            if (Cargo.darToxicidadCarga())
            {
                tieneToxico = true;
            }
            if (Cargo.darRefrigeracionCarga())
            {
                necesitaRefrigeracion = true;
            }
            maxTemp = Cargo.darProducto().darTempMax();
            DictCarga.put(Cargo.darIdentificador(), Cargo);
            return true;
        }
        
    }

   
    public String darCaracteristicas() 
    {
		String volumen = capacidadVol.toString();
        String peso = capacidadPeso.toString();
        String carga = pesoCarga.toString();
		String resultado = " "+volumen+" "+peso+" "+exclusividad+" "+carga;
        return resultado;
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
        String manifiesto = "Manifiesto del contenedor:\nEste contenedor tiene los siguientes cargamentos:\n";
        for (Map.Entry<String,cargamento> carga : DictCarga.entrySet()) 
        {
            manifiesto += "Cargamento ID: "+carga.getKey().toString()+" - Tipo de Producto: "+carga.getValue().darTipoProd()+"\n";
        }
        manifiesto += "Peso Total de la Carga: "+this.pesoCarga.toString()+"toneladas.\n"+"Volumen Total de la Carga: "+this.volumenOcupado.toString()+"m^3.\nCondiciones: \nRefrigeración Requerida: "+this.necesitaRefrigeracion+"\nTemperatura Máxima: "+this.maxTemp.toString()+"\nContiene Productos Tóxicos: "+this.tieneToxico;
        return manifiesto;
    }

    public void retirarCargamento(String identificador) 
    {
        DictCarga.remove(identificador);
    }

}